package lower.lesson17;

import lower.lesson17.contracts.Reservoirable;

public class MilkTank implements Reservoirable {

    /**
    * --------- METHODS ----------------------------------
    */

    // Implementation methods for Reservoirable
    @Override
    public void clean() {
        // code for cleaning
    }

    @Override
    public void extract(double amount) {
        // code for extracting frothy milk
    }

    @Override
    public void heat(double temperature) {
        // code for heating milk
    }

    // Custom methods
    public void froth() {
        // code to froth the milk
    }
}
