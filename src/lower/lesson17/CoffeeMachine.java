package lower.lesson17;

import lower.lesson16.CoffeePod;
import lower.lesson16.Cup;
import lower.lesson17.contracts.Reservoirable;

public class CoffeeMachine {
    /**
     * --------- PROPERTIES -------------------------------
     */
    public Cup cup;

    protected CoffeePod coffeePod;

    private boolean isOn;

    private boolean isProgramInProgress;

    private Reservoirable[] tanks;

    /**
     * --------- CONSTRUCTOR -----------------------------
     * No hard dependencies using interfaces and dependency injection
     */
    public CoffeeMachine(Reservoirable[] tanks) {
        this.isOn = false;
        this.isProgramInProgress = false;
        this.tanks = tanks;
    }

    /**
     * --------- METHODS ----------------------------------
     */
    // You can assume all the methods we wrote in Lesson 16 will be unchanged
}
