package lower.lesson05;

/**
 * This is a warm-up exercise to get comfortable writing if statements in Java.
 */
public class Branching {
    /**
     * We are calling the methods and passing different values so that we can see how our algorithms behave.
     * If you are looking back at this and wondering why examples are so random they are probably like so because
     * of some exercise we worked out in the book. Or the teacher made a link to a real life scenario she experienced.
     */
   public static void lesson() {
       // Our grocery shopping scenario
       canBuyAlcohol(7);
       canBuyAlcohol(78);
       canDeliver(100);
       canDeliver(1.3);

       // The weather scenario (from topic 2)
       giveAdviceBasedOnWeather(true, false);
       giveAdviceBasedOnWeather(false, false);
       giveAdviceBasedOnWeather(true, true);
   }

    /**
    * This method can be in an online grocery store and checks whether the customer is old enough to browse alcoholic items like beer and wine.
    * @param age
    */
   public static void canBuyAlcohol(int age) {
        if (age >= 18) {
            System.out.println("Yes, can view alcoholic items.");
        } else {
            System.out.println("No, better remove alcoholic items from listing.");
        }
   }

   public static void canDeliver(double distance) {
       if (distance < 5.0) {
           System.out.println("Yes, the customer lives close enough to get the shop delivered. Direction to payment.");
       } else {
           System.out.println("No, the customer lives too far away to get the shop delivered. Do not accept payment.");
       }
   }

   /**
    * This method tries to give advice based on information about the weather.
    * Probably not very useful but we can see some logical operators in action.
    * @param isWindy
    * @param isCloudy
    */
   public static void giveAdviceBasedOnWeather(boolean isWindy, boolean isCloudy) {
        // OR
        if (isWindy || isCloudy) {
            System.out.println("Bring your umbrella!");
        }

        // NOT OR (NOR)
        if (!(isWindy || isCloudy)) {
            System.out.println("You probably just need a jacket if it is cold.");
        }

        // AND
        if (isWindy && isCloudy) {
            System.out.println("Stay home and make hot chocolate.");
        }
        
        // NOT AND (NAND)
        if (!(isWindy && isCloudy)) {
            System.out.println("You probably should stop gaming and go outside.");
        }
   }
}
