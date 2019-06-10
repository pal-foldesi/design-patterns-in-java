package structural.flyweight;

public class Location {
    private final double latitude;
    private final double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "latitude=" + latitude +
                ", longitude=" + longitude;
    }
}
