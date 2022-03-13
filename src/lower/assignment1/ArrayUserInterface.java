package lower.assignment1;

public class ArrayUserInterface {
    public static void main(String[] args) {
        // on board user (say welcome)

        // display a menu with all the functions (provide a quit option)

        // accept user option as input

        // while option is not 'q'
        //      ask user to give array size
        //      declare int array
        //      if option requires fill before
        //          ask user to fill in elements
        //      end if
        //      perform option (switch)
        //      output result
        //      ask user for another option or 'q' to quit
        // endwhile
    }

    /**
     * Takes a String pattern like 1,2,3,4,5 and converts it into an int array {1, 2, 3, 4, 5}
     * @param pattern e.g. "1,2,3,4,5"
     * @param delimeter e.g. ","
     * @return converted array
     * @throws NumberFormatException
     */
    public static int[] convert(String pattern, String delimeter) throws NumberFormatException {
        String[] split = pattern.split(delimeter);
        int size = split.length;
        int[] converted = new int[size];
        for(int i = 0; i < size; i++) {
            converted[i] = Integer.parseInt(split[i]);
        }
        return converted;
    }

    public static void displayAll(int[] arr) {
        // Special for loop provided by Java
        for(int e : arr) {
            System.out.print("| " + e + " | ");
        }
        System.out.println("");
    }
}
