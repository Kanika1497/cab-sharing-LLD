// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RiderManager riderManager=RiderManager.getInstance();
        DriverManager driverManager=DriverManager.getInstance();
        TripManager tripManager=TripManager.getInstance();

        riderManager.addRider(new Rider("R1","Kanika",new Location(0,0)));

        driverManager.addDrivers(new Driver("D1","LalChand",new Location(2,4)));
        driverManager.addDrivers(new Driver("D2","Suresh",new Location(1,5)));

        Trip trip=tripManager.createTrip("R1",new Location(0,0),new Location(10,10));


        //Start trip
        if(trip!=null){
            trip.setStatus(TripStatus.ONGOING);
        }

        // Complete trip
        if(trip!=null){
            tripManager.completeTrip(trip.getTripId());
        }
        else{
            System.out.println("Trip cannot be created !");
        }

    }
}