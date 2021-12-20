package upper.lesson05.entity;

import java.util.ArrayList;

import upper.lesson05.entity.trait.DeletableRecord;
import upper.lesson05.record.CarEntityFile;

public class Car extends DeletableRecord {

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
        (new CarEntityFile()).save(this);
    }

    /**
     * Querying
     */
    public static ArrayList<Car> all() {
        return (new CarEntityFile()).all();
    }

    public static Car getById(int id) {
        return (new CarEntityFile()).getById(id);
    }
}
