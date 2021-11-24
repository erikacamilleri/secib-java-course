package upper.lesson05.entity;

import upper.lesson05.record.CarRecordManager;

public class Car {

    public int id;

    public String model;

    public String colour;

    public String licensePlate;

    public Car(String model, String colour, String licensePlate) {
        this.id = -1;
        this.model = model;
        this.colour = colour;
        this.licensePlate = licensePlate;
    }

    /**
     * Persistence
     */
    public void save() {
        (new CarRecordManager()).save(this);
    }

    /**
     * Querying
     */
    public static Car getById(int id) {
        return (new CarRecordManager()).getById(id);
    }
}
