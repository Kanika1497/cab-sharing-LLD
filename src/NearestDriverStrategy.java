import java.util.List;

public class NearestDriverStrategy implements DriverMatchingStrategy{
   // private DriverManager driverManager;
    @Override
    public Driver matchDriver(TripMetaData data) {
        List<Driver> availableDriver=DriverManager.getInstance().availableDriver();
        Driver nearestDriver=null;
        double minDist= Double.MAX_VALUE;
        for(Driver d: availableDriver){
            double dist=d.getLocation().distance(data.getSource());
            if(dist<minDist){
                minDist=dist;
                nearestDriver=d;
            }
        }
        return nearestDriver;
    }
}
