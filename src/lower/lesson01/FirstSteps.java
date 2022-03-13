package lower.lesson01;

public class FirstSteps {
    
    public static void lesson()
    {
        // I am just displaying a greeting to the world!
        System.out.println("Let's declare some variables!");
        
        // Declaring an *int* variable (numbers)
        // Points in a game
        int points = 45;
        System.out.println("The value of my points: " + points);

        // Declaring float variable (real numbers)
        // Storing the temperature data
        float temperature = (float) 1.1;

        // Declare double variable (real number with a much bigger range)
        // Total amount of money due to pay a bill
        double total = 100.00;

        // Declare a char variable (single characters)
        // Storing a character for a scrabble tile
        char letter = 'A';

        // Declare a boolean variable (true or false)
        // A flag to set if something is valid or not valid
        boolean isValid = true;
        boolean isYoung = false;

        System.out.println("Let's declare some constants!");

        // Declare a constant
        // The value of pi does not change in the lifetime of program execution
        final double PI = 3.142;
        System.out.println("The value of constant pi in my program: " + PI);
    }
}
