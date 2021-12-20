package upper.lesson05.entity;

import java.util.Date;

public class Trip {
    
    private Date pickupDate;

    private Date dropOffDate;

    private Location location; // save the location id in the file

    private Car car; // save the car id in the file

    public Trip (Date pickupDate, Date dropOffDate, Location location, Car car) {
        this.pickupDate = pickupDate;
        this.dropOffDate = dropOffDate;
        this.location = location;
        this.car = car;
    }

    public Date getPickupDate() {
        return this.pickupDate;
    }

    public Date getDropOffDate() {
        return this.dropOffDate;
    }

    public Location getLocation() {
        return this.location;
    }

    public Car getCar() {
        return this.car;
    }
}
