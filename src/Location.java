public class Location {
    private double x;
    private double y;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Location loc){
        return Math.sqrt(Math.pow(loc.y - this.y,2)+Math.pow(loc.x-this.x,2));
    }
}
