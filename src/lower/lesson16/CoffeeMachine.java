package lower.lesson16;

public class CoffeeMachine {
    
    /**
     * --------- PROPERTIES -------------------------------
     */
    public Cup cup;

    protected CoffeePod coffeePod;

    private boolean isOn;

    private boolean isProgramInProgress;

    /**
     * --------- CONSTRUCTOR -----------------------------
     */
    // TODO: Write a constructor without parameters but think about what the initial state should be...

    /**
     * --------- METHODS ----------------------------------
     */

    // --------- Accessors and Mutators --------------------
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    // TODO: Implement accessors and setters for CoffeePod. 
    // If a program is in progress just throw an Exception 
    // because you cannot access a coffee pod while coffee is being brewed.

    // --------- Behaviour Methods -------------------------
    public void coffeeProgram8oz() throws InterruptedException {
        this.isProgramInProgress = true;
        // instructions to make an 8oz coffee we are faking this with Thread.sleep()
        Thread.sleep(15000);
        this.isProgramInProgress = false;
    }

    public void coffeeProgram10oz() throws InterruptedException {
        this.isProgramInProgress = true;
        // instructions to make an 10oz coffee we are faking this with Thread.sleep()
        Thread.sleep(25000);
        this.isProgramInProgress = false;
    }

    public void coffeeProgramKCup() throws InterruptedException {
        this.isProgramInProgress = true;
        // instructions to make an 10oz coffee we are faking this with Thread.sleep()
        Thread.sleep(10000);
        this.isProgramInProgress = false;
    }

    public void coffeeProgramEspressoLungo() throws InterruptedException {
        this.isProgramInProgress = true;
        // instructions to make an 10oz coffee we are faking this with Thread.sleep()
        Thread.sleep(10000);
        this.isProgramInProgress = false;
    }

    // TODO: other programs available
    // - espresso corto
    // - 6 oz
    // - 4 oz
}
