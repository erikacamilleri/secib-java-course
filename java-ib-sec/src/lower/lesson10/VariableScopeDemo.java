package lower.lesson10;

/**
 * 
 */
public class VariableScopeDemo {
    // A variable that is accessible *only* through this class but lives as long as this class lives
    // So far, all our classes live as long as the program runs
    // See VariableScopeMain.java in this folder
    public static int count = 10;

    // I want to use all of the below within all methods in this class, so I declare them here
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_RED = "\u001B[31m";

    public static void lesson() {
        // A variable that only lives within this method, as soon as this method is gone then so is myName
        String myName = "Ms Camilleri";
        System.out.println(TEXT_YELLOW + "\t[VariableScopeDemo.lesson] The variable myName only lives within lesson(): " + myName + TEXT_RESET);

        for(int i = 1; i < 10; i++) {
            System.out.println(TEXT_BLUE + "\t\t[VariableScopeDemo.lesson.forloop] From this block count is accessible and can be updated, it is being multiplied by a variable i which is now: " + i + TEXT_RESET);
            // count *= i is the same as doing count = count * i (google assignment operators)
            count *= i;
            if (i == 1) {
                System.out.println(TEXT_RED + "\t\t\t[VariableScopeDemo.lesson.forloop.if] Declaring an array of Strings to store the names of my students in a new scope: " + i + TEXT_RESET);
                String[] myStudents = {"Alex", "Mike", "Anirudh", "Bill", "Daniil"};
                System.out.println(TEXT_RED + "\t\t\t[VariableScopeDemo.lesson.forloop.if] The array myStudents only lives within this block, the first student is: " + myStudents[0] + TEXT_RESET);
            }
        }
        
        System.out.println(TEXT_YELLOW + "\t[VariableScopeDemo.lesson] Variables i and myStudents ba-bye!" + TEXT_RESET);
    }
}
