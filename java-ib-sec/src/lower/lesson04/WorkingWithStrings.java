package lower.lesson04;

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
}
