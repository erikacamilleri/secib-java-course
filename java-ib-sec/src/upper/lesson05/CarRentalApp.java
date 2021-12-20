package upper.lesson05;

import upper.lesson05.entity.Location;
import upper.lesson05.record.LocationEntityFile;

public class CarRentalApp {
    public static void main(String[] args) {

        // TODO Display Menu Of Options
        // Car car = new Car("BMW", "Colour", "BMW334");
        // Car car2 = new Car("Toyota", "Colour", "FBJ112");
        // Car car3 = new Car("Nissan", "Colour", "GHT456");

        // car2.save();

        // CarEntityFile fileManager = new CarEntityFile();
        // fileManager.save(car2);

        // Car gotCar3 = Car.getById(3);
        // Car gotCar4 = Car.getById(4);

        // System.out.println(gotCar3.model);
        // System.out.println(gotCar4.model);

        // CarEntityFile file = new CarEntityFile();
        // File raw = file.getFile();

        // if (raw == null) {
        //     System.out.println("no file");
        // } else {
        //     System.out.println(raw.canWrite());
        // }

        

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

        // Car theSecondCar = Car.getById(2);
        // theSecondCar.licensePlate = "XYZ777";
        // theSecondCar.save();

        // ArrayList<Car> allCars = Car.all();
        
        // for(Car item : allCars) {
        //     System.out.println(item.licensePlate);
        // }

        Location location = new Location("Birgu", 23.456789093, 45.99907777);
        LocationEntityFile locationFile = new LocationEntityFile();
        locationFile.save(location);
    }

    private void boot() {
        
    }
}