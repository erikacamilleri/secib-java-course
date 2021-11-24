package upper.lesson05;

import upper.lesson05.entity.Car;
import upper.lesson05.record.CarRecordManager;

public class CarRentalApp {
    public static void main(String[] args) {
        Car car = new Car("BMW", "Colour", "BMW334");
        Car car2 = new Car("Toyota", "Colour", "FBJ112");
        Car car3 = new Car("Nissan", "Colour", "GHT456");

        //CarRecordManager carRecordManager = new CarRecordManager();

        // Basic Saving
        //carRecordManager.save(car);
        //carRecordManager.save(car2);

        // Basic Reading
        //String data = car.read(3);
        //System.out.println(data);

        //System.out.println(car.getLastRecordId());

        //CarRecordManager carRecordManager = new CarRecordManager();
        //carRecordManager.save(car);
        //carRecordManager.save(car2);

        Car theSecondCar = Car.getById(2);
        theSecondCar.licensePlate = "XYZ777";
        theSecondCar.save();

    }
}