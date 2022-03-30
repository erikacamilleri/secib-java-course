package lower.lesson16;

public class CoffeeMachine {
    
    /**
     * --------- PROPERTIES -------------------------------
     */
    public Cup cup;

    protected CoffeePod coffeePod;

    private MilkTank milkTank;

    private WaterTank waterTank;

    private boolean isOn;

    private boolean isProgramInProgress;

    /**
     * --------- CONSTRUCTOR -----------------------------
     */
    public CoffeeMachine() {
        this.isOn = false;
        this.isProgramInProgress = false;
        this.milkTank = new MilkTank();
        this.waterTank = new WaterTank();
    }

    /**
     * --------- METHODS ----------------------------------
     */

    // --------- Accessors and Mutators --------------------
    /**
     * This simulates the actual button
     * @param isOn
     */
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    /**
     * This is faking the lightbulb that indicates whether it is on or off
     * @return
     */
    public boolean getIsOn() {
        return this.isOn;
    }

    // If a program is in progress just throw an Exception 
    // because you cannot access a coffee pod while coffee is being brewed.
    public void setCoffeePod(CoffeePod coffeePod) {
        // If coffee is being brewed, the user is not allowed to change the state so throw exception
        if (this.isProgramInProgress) throw new IllegalStateException("You cannot change the coffee pod right now!");
        this.coffeePod = coffeePod;
    }
 
    public CoffeePod getCoffeePod() {
        if (this.isProgramInProgress) throw new IllegalStateException("You cannot get the coffee pod right now, it is being used!");
        return this.coffeePod;
    }

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

    public void coffeeProgramEspressoCorto() throws InterruptedException {
        this.isProgramInProgress = true;
        // instructions to make an 10oz coffee we are faking this with Thread.sleep()
        Thread.sleep(4000);
        this.isProgramInProgress = false;
    }
}
