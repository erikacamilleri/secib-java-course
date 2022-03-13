package lower.lesson07;

public class Arrays {

    public static void lesson() {
        /**
         * 1. Declare an array variable.
         * 2. Allocate a fixed amount of memory to store the array elements.
         */
        double[] studentRunTimes;
        studentRunTimes = new double[5];
        studentRunTimes[0] = 27.5;
        studentRunTimes[1] = 33.2;
        studentRunTimes[2] = 33.2;
        studentRunTimes[3] = 18.2;
        studentRunTimes[4] = 57.2;

        /**
         * Declare an array variable and assign it to a collection of values of the same type.
         */
        String[] studentNames = {"Daniil", "Bill", "Anirud", "Mike", "Alex"};

        /**
         * We can loop through the indices, (note start at 0) and print out the array elements like we do variables.
         */
        for(int i = 0; i < 5; i++) {
            System.out.println(studentNames[i] + " " + studentRunTimes[i]);
        }

        /**
         * Think of each array element as a variable... we can also do logical stuff.
         */
        if (studentRunTimes[0] > studentRunTimes[1]) {
            System.out.println("Daniil is slower than Bill.");
        } else {
            System.out.println("Daniil is faster than Bill!");
        }

        // Doing the declaration and allocation in one line
        String[] tweets = new String[100];
        tweets[0] = "Here is a big bird tweet!";

        // Declaring an array with the elements
        String[] burgerIngredients = {"TB", "AC", "BP", "SO", "AC", "BP", "L", "T", "S", "BB"};

        // Assign a variable to a value of an array element
        String firstBurgerIngredient = burgerIngredients[0];
        
        // Should output "TB" (refer to top bun)
        System.out.println(firstBurgerIngredient);
    }
}
