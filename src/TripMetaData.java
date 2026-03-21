public class TripMetaData {
    private Rider rider;
    private Location source;
    private Location destination;

    public TripMetaData(Rider rider, Location source, Location destination) {
        this.rider = rider;
        this.source = source;
        this.destination = destination;
    }

    public Rider getRider() {
        return rider;
    }

    public Location getSource() {
        return source;
    }

    public Location getDestination() {
        return destination;
    }
}

