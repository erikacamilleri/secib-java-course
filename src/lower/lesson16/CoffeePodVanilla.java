package lower.lesson16;

// Note: The word extends refers to the "is a" relationship.
//       CoffeePodAmericano *is a* CoffeePod
public class CoffeePodAmericano extends CoffeePod {  

    /**
     * --------- CONSTRUCTOR -----------------------------
     */
    public CoffeePodAmericano() {
        // Note: super is the CoffeePod constructor
        super("Americano");
    }
}
