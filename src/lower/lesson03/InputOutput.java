package lower.lesson03;

import java.util.Scanner;

public class InputOutput {
    public static void lesson() {
        // Accept input from the keyboard. We will be using this all the time.
        Scanner sc = new Scanner(System.in);
        
        // ---- INT EXAMPLE ---------------------------------------------------------------------------------------------

        // Storing our user's age here
        int age = 0;
        
        // Prompt user to let us know his age
        System.out.println("Before we display the menu, please tell us how old you are...");
        
        age = sc.nextInt();

        // Verify user age
        System.out.println("The menu items displayed are based on the fact that you are " + age + " years old.");

        // ---- DOUBLE EXAMPLE ---------------------------------------------------------------------------------------------

        // Storing our user's salary
        double salary = 0.0; 

        // Prompt user to let us know his age
        System.out.println("Please tell us how much you earn...");

        // Accept input from the keyboard
        salary = sc.nextDouble();

        // Verify user salary
        System.out.println("You just told us that you earn " + salary + " per annum.");

        // ---- CHAR EXAMPLE ---------------------------------------------------------------------------------------------

        // Storing our user's letter
        char favouriteScrabbleTile;

        // Prompt user to let us know his age
        System.out.println("Which scrabble tile do you like most?");

        favouriteScrabbleTile = sc.next().charAt(0);

        System.out.println("You just told us that your favourite tile is " + favouriteScrabbleTile + "!");

        System.out.println("Ok bye for now!");

        // Clean up when you are done with a resource
        sc.close();
    }

    public static void challenge() {
        // Accept input from the keyboard. We will be using this all the time.
        Scanner sc = new Scanner(System.in);

        System.out.println("** Product Price Check **");

        System.out.println("Enter the price of product you want to buy: ");

        double price = sc.nextDouble();

        System.out.println("Enter the tax rate to be charged on product: ");

        double tax = sc.nextDouble();

        double due = price + (price * (tax/100));

        System.out.println("For the product you have to pay: " + due);

        sc.close();
    }
}
