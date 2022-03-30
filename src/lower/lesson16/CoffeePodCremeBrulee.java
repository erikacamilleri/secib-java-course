package lower.lesson16;

// Note: The word extends refers to the "is a" relationship.
//       CoffeePodVanilla *is a* CoffeePod
public class CoffeePodCremeBrulee extends CoffeePod {  

    /**
     * --------- CONSTRUCTOR -----------------------------
     */
    public CoffeePodCremeBrulee() {
        // Note: super is the CoffeePod constructor
        super("Creme Brulee");
    }
}
