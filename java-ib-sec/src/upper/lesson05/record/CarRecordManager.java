package upper.lesson05.record;

import upper.lesson05.entity.Car;

public class CarRecordManager extends BaseEntityRecord {

    private Car car;

    private String RECORD_FILE_NAME = "cars.txt";

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

    @Override
    protected String getFileName() {
        return RECORD_FILE_NAME;
    }

    @Override
    protected int getRecordSize() {
        return 68;
    }

    @Override
    protected String serialize() {
        String record = "";
        record += String.format("%1$" + 4 + "s", this.car.id) + this.DELIMITER;
        record += String.format("%1$" + 25 + "s", this.car.model) + this.DELIMITER;
        record += String.format("%1$" + 25 + "s", this.car.colour) + this.DELIMITER;
        record += String.format("%1$" + 10 + "s", this.car.licensePlate) + this.DELIMITER;
        return record;
    }
    
    public static Car deserialize(String record) {
        String[] fields = record.split(";");
        int id =  Integer.parseInt(fields[0].trim());
        String model = fields[1].trim();
        String colour = fields[2].trim();     
        String licensePlate = fields[3].trim();
        Car car = new Car(model, colour, licensePlate); 
        car.id = id;
        return car;
    }

     /**
      * Read
     */
    public Car getById(int id) {
        String data = this.read(id);
        return deserialize(data);
    }
}
