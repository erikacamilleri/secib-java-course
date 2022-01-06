package upper.lesson05.record;

import java.util.ArrayList;

import upper.lesson05.entity.Car;

public class CarEntityFile extends AbstractEntityFile<Car> {
    /**
     * Entity object for persistance
     */
    private Car car;

    private String RECORD_FILE_NAME = "cars.txt";

    /**
     * ------ Internal File Methods -----------------------------------------------
     */
    @Override
    protected String getFileName() {
        return RECORD_FILE_NAME;
    }

    @Override
    protected int getRecordSize() {
        return 71;
    }

    @Override
    protected String serialize() {
        String record = "";
        record += String.format("%1$" + 4 + "s", this.car.id) + this.DELIMITER;
        record += String.format("%1$" + 25 + "s", this.car.model) + this.DELIMITER;
        record += String.format("%1$" + 25 + "s", this.car.colour) + this.DELIMITER;
        record += String.format("%1$" + 10 + "s", this.car.licensePlate) + this.DELIMITER;
        record += String.format("%1$" + 2 + "s", this.car.isDeleted() ? "1" : "0") + this.DELIMITER;
        return record;
    }

    @Override
    protected Car deserialize(String record) {
        String[] fields = record.split(";");
        int id =  Integer.parseInt(fields[0].trim());
        String model = fields[1].trim();
        String colour = fields[2].trim();     
        String licensePlate = fields[3].trim();
        int isDeleted = Integer.parseInt(fields[4].trim());
        Car car = new Car(model, colour, licensePlate); 
        car.id = id;
        if (isDeleted == 1) {
            car.delete();
        }
        return car;
    }

    /**
     * ------ Data Access Object Methods API ----------------------------------------------
     */
    public ArrayList<Car> all() {
        ArrayList<Car> allCars = new ArrayList<Car>();
        for(int i = 1; i <= getLastRecordId(); i++) {
            allCars.add(this.getById(i));
        }
        return allCars;
    }

    /**
     * @param id
     * @return
     */
    public Car getById(int id) {
        String data = this.read(id);
        return deserialize(data);
    }

    /**
     * @param car
     */
    public void save(Car car) {
        this.car = car;
        if (this.car.id != -1) {
            // save a new car
            this.update(this.car.id);
        } else {
            // create a new car record
            this.car.id = this.getLastRecordId() + 1;
            this.insert();
        }
     }
}
