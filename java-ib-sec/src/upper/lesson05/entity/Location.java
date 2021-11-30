package upper.lesson05.entity;

public class Location {
    
    public int id = -1; // 4

    public String name; // 100

    public double lat; // 15

    public double lon; // 15

    public Location(String name, double lat, double lon) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }
}
