public class Trip {
    private String tripId;
    private Rider rider;
    private Driver driver;

    private TripStatus status;
    private double fare;

    public Trip(String tripId, Rider rider, Driver driver, TripStatus status, double fare) {
        this.tripId = tripId;
        this.rider = rider;
        this.driver = driver;
        this.status = status;
        this.fare = fare;
    }

    public String getTripId() {
        return tripId;
    }

    public Rider getRider() {
        return rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public TripStatus getStatus() {
        return status;
    }

    public double getFare() {
        return fare;
    }
}
