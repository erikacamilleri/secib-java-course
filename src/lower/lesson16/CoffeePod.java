package lower.lesson16;

// Note: abstract means the developer is not allowed to create an instance by using this class directly!
public abstract class CoffeePod {

    /**
     * --------- PROPERTIES -------------------------------
     */
    private String flavour;

    /**
     * --------- CONSTRUCTOR -----------------------------
     */
    public CoffeePod(String flavour) {
        this.flavour = flavour;
    }

    /**
     * --------- METHODS ----------------------------------
     */
    // --------- Accessors and Mutators --------------------
    public String getFlavour() {
        return this.flavour;
    }

    // Note: We do not provide write access to flavour.
}
    	