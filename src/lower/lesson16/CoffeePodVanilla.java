package lower.lesson16;

// Note: The word extends refers to the "is a" relationship.
//       CoffeePodVanilla *is a* CoffeePod
public class CoffeePodVanilla extends CoffeePod {  

    /**
     * --------- CONSTRUCTOR -----------------------------
     */
    public CoffeePodVanilla() {
        // Note: super is the CoffeePod constructor
        super("Vanilla");
    }
}
