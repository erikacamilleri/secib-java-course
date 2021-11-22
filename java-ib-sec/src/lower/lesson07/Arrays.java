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

        String[] studentNames = {"Daniil", "Bill", "Anirud", "Mike", "Alex"};

        for(int i = 0; i < 5; i++) {
            System.out.println(studentNames[i] + " " + studentRunTimes[i]);
        }

        if (studentRunTimes[0] > studentRunTimes[1]) {
            System.out.println("Daniil is slower than Bill.");
        } else {
            System.out.println("Daniil is faster than Bill!");
        }

        // Doing the declaration and allocation in one line
        String[] tweets = new String[100];

        // Declaring an array with the elements
        String[] burgerIngredients = {"TB", "AC", "BP", "SO", "AC", "BP", "L", "T", "S", "BB"};

        String firstBurgerIngredient = burgerIngredients[0];

        System.out.println(firstBurgerIngredient);
    }
}
