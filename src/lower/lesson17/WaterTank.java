package lower.lesson17;

import lower.lesson17.contracts.Reservoirable;

public class WaterTank implements Reservoirable {
    /**
     * --------- PROPERTIES -------------------------------
     */
    private int carbonLevel;

    /**
     * --------- CONSTRUCTOR -----------------------------
     */
    public WaterTank(int carbonLevel) {
        this.carbonLevel = carbonLevel; // flat: 0, lightly fizzed: 1, medium: 2, knock-your-socks-off: 3
    }

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
        // code for extracting water
    }

    @Override
    public void heat(double temperature) {
        // code for heating flat water
    }
}
