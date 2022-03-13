package lower.lesson04;

import java.util.Scanner;

public class WorkingWithStrings {
    
    public static void lesson() {
        /**
         * The String class is a complex data type in Java therefore we
         * need the new keyword to reserve some memory for the program.
         */
        String myName = new String("Erika Camilleri");

        // This is a more common way
        String myFavouriteColour = "blue";

        // Displaying myName which is storing "Erika Camilleri"
        System.out.println(myName);

        // String is a complex type that has a value and behaviour
        // Experimenting with some behaviour defined as endsWith
        // We are assuming it returns a true value
        boolean flag = myName.endsWith("eri");

        System.out.println("Does my name end with 'eri'? " + flag);

        // We are assuming it returns a false value now
        flag = myFavouriteColour.endsWith("eri");

        System.out.println("Does my favourite colour end with 'eri'? " + flag);
    }

    /**
     * Some while ago, the European Union decreed that all traders in the UK
     * sell their goods by the kilo and not by pound. The following steps should
     * carry out the conversion between kilo and pounds.
     */
    public static void challenge() {
        // 1. Prompt the user to enter a weight in pounds
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the weight in pounds, and it will be converted to kilos...");
        // 2. Store the input in a variable
        double weightInPounds = sc.nextDouble();
        // 3. Divide 2.2 to get the value in kilos.
        double weightInKilos = weightInPounds / 2.2;
        // 4. Display the conversion to the user.
        System.out.println("The weight of " + weightInPounds + " in pounds is equivalent to " + weightInKilos + " kilos.");
        // Close our resources
        sc.close();
    }
}
