package upper.lesson05;

import upper.lesson05.entity.Car;

public class CarRentalApp {
    public static void main(String[] args) {
        // testCreateCar();

        testDeleteCar();
    }

    public static void testDeleteCar() {
        Car car = Car.getById(5);
        car.delete();
        car.save();
    }

    public static void testCreateCar() {
        for (int i = 0; i < 5; i++) {
            Car car = new Car("Test Model", "Test Colour", "BMW334");
            car.save();
        }
    }
}