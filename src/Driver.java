public class Driver {
    private String id;
    private String name;
    private Location location;
    private boolean isAvailable;

    public Driver(String id, String name, Location location, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
