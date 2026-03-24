import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TripManager {
    private static TripManager instance;
    private final Map<String , Trip> trips=new HashMap<>();
    public TripManager (){
    }

    public  static TripManager getInstance(){
        if(instance==null) return instance =new TripManager();
        return instance;
    }

    public Trip createTrip(String riderId,Location src,Location dest){
        if(riderId==null || src==null || dest==null){
            throw new IllegalArgumentException("RiderId or Src or destination can't be null");
        }
        Rider rider= RiderManager.getInstance().getRider(riderId);
        if(rider ==null){
            System.out.println("No such rider in the system add rider first!");
            return null;
        }
        TripMetaData metaData=new TripMetaData(rider,src,dest);

        DriverMatchingStrategy driverMatchingStrategy=StrategyManager.getInstance().getDriverMatchingStrategy(metaData);
        Driver driver =driverMatchingStrategy.matchDriver(metaData);

        if(driver==null){
            System.out.println("NO driver available");
            return null;
        }

        PricingStrategy pricingStrategy=StrategyManager.getInstance().getPricingStrategy(metaData);

        double fare= pricingStrategy.calculatefare(metaData);

        Trip trip=new Trip(UUID.randomUUID().toString(),rider,driver,fare);
        driver.setAvailable(false);

        trips.put(trip.getTripId(),trip);

        System.out.println(rider.getName() + "'s trip is created with driver " +driver.getName() + " Fare =" +fare);

        return trip;
    }

    public void completeTrip(String tripId){
        Trip trip=trips.get(tripId);
        trip.setStatus(TripStatus.COMPLETED);
        trip.getDriver().setAvailable(true);
        System.out.println("Trip Completed !");
    }
}
