package lower.lesson05;

public class Procedures {
    
    public static void lesson() {
        int score = Procedures.multiply(4, 2);
        System.out.println("The value of score is " + score);
    }

    /**
     * A method that displays an ordered list of ingredients to assemble a double cheese burger.
     */
    public static void displayBurgerIngredients() {
        System.out.println("1. Top Bun");
        System.out.println("2. American Cheese");
        System.out.println("3. Beef Patty");
        System.out.println("4. Sliced Onion");
        System.out.println("5. American Cheese");
        System.out.println("6. Beef Patty");
        System.out.println("7. Iceberg Lettuce");
        System.out.println("8. Sliced Tomatoe");
        System.out.println("8. Spread");
        System.out.println("1. Bottom Bun");
    }

    /**
     * This is a definition of a method that multiplies two integers.
     * @param a | integer
     * @param b | integer
     * @return  | the multiplication of two integers
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * @param a | real
     * @param b | real
     * @return  | the multiplication of two real numbers
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * This is a very dumb procedure to let us know whether it is raining
     * @return | true or false
     */
    public static boolean isRaining() {
        return false;
    }
}

 
