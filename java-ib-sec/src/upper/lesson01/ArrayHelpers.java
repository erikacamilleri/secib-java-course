package upper.lesson01;

/**
 * 4.2   Connecting computational thinking and program design
 * 4.2.1 Searching, sorting and other algorithms on arrays
 */
public class ArrayHelpers {

    /**
     * An array can hold a collection of variables that share the same type.
     * Has a name and a predetermined fixed size.
     * In most cases indices (array locations) define a lower bound (start from 0)
     * Assume these kind of arrays in exam questions that have pseudo code.
     * 
     * A simple array of String holding different programming languages and displaying them.
     */
    public static void linearArrayExample()
    {
        // Let us declare a constant to commit to an array size
        final int ARRAY_SIZE = 50;
        
        // Let us declare a Linear Array (One Dimensional)
        String[] programmingLanguages = new String[ARRAY_SIZE];

        // Let us start filling in our Linear Array
        programmingLanguages[0] = "Java";
        programmingLanguages[1] = "Python";
        programmingLanguages[2] = "PHP";
        programmingLanguages[3] = "C Sharp";

        // Let's construct a for loop to Display the Programming Languages
        int index;
        // loop INDEX from 0 to 4
        for (index = 0; index < 4; index++) {
            // output "Array position " . index . " contains the value " . programmingLanguages[index]
            System.out.println("Array position " + index + " contains the value " + programmingLanguages[index]);
        }
    }

    /**
     * The most simple way to store tabular data (like the kind you would store in a DB).
     * Each array stores values of a particular field of data.
     * The combination of elements from all arrays that have the same index represent a record.
     * 
     * Parallel Arrays to represent Person records. Primary Keys automatically filled in.
     */
    public static void parallelArraysExample()
    {
        // Parallel Arrays
        int[] ids = new int[3];
        String[] names = {"Paul", "Ervin", "Jaylan"};
        int[] ages = {12, 15, 90};
        
        int index;
        for (index = 0; index < 3; index++) {
            // Automatically fill in the IDs
            ids[index] = index + 1;
            System.out.println(ids[index] + " " + names[index] + " " + ages[index]);
        }
    }

    public static void arrayOfObjectsExample() {
        // Create instances of Person
        Person paul = new Person("Paul", 12);
        Person ervin = new Person("Ervin", 15);
        Person jaylan = new Person("Jaylan", 90);

        // TODO Create array and store the objects
    }

    public static void twoDimensionalArrayExample() {
        // TODO Represent tabular data in an array. 
    }

    /**
     * ----------------------------------------------------------------------------------------------
     * ALGORITHMS FOR ARRAYS EXAMPLES
     * ----------------------------------------------------------------------------------------------
     * An algorithm that finds the two neighbouring elements with the smallest difference/distance.
     * Requires the Math library to reuse the abs() -- returns an absolute value of a number.
     */
    public static void smallestElementDistanceLinear() {
        int[] A = {5, 1, 4, 7, 9, -12};
        final int SIZE = 6;
        int minimum = Math.abs(A[0] - A[1]);
        int minindex = 0;
        for(int i=1; i < SIZE - 2; i++) {
            if(Math.abs(A[i] - A[i+1]) < minimum) {
                minimum = Math.abs(A[i] - A[i+1]);
                minindex = i;   
            }
        }
        System.out.println("Distance " + minimum + " between element " + minindex + " and element " + ((int)minindex + 1));
    }
}
