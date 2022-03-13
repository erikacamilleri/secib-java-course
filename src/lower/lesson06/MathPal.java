package lower.lesson06;

import java.util.Scanner;

public class MathPal {
    
    public static void main(String[] args) {
        onboarding();
        chooseOption();
    }

    public static void onboarding() {
        System.out.println("***************************");
        System.out.println("******** MATH PAL *********");
        System.out.println("***************************");
        System.out.println("Welcome to MathPal, when we get enough money we will greet you with a jingle!");
        System.out.println("This is an educational toy for early learners.");
        System.out.println("C. Simple Counting 1,2,3 [Pic of Monkey]");
        System.out.println("A. Addition [Pic of Apples in Basket]");
        System.out.println("B. Bigger Number [Pic of Whale and Clown Fish]");
        System.out.println("L. Logic Game [Pic of Robot]");
        System.out.println("E. Exit [Bye Song]");
        System.out.println();
    }

    public static void chooseOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What shall we do today?");
        char option = sc.next().charAt(0);

        // While the child would like to keep on playing with the toy...
        while(option != 'E') {
            switch (option) {
                case 'C' : {
                    // Counting
                    System.out.println("Let's learn how to count!");
                    System.out.println("Give me a number from 5 to 10:");
                    int upTo = sc.nextInt();
                    counting(1, upTo, 1); // Calling a method and passing parameters, note that you can pass in a value or a variable!
                    break;
                } 
                case 'A' : {
                    // Addition
                    System.out.println("Let's learn how to add!");
                    System.out.println("Give me a number from 1 to 10:");
                    int a = sc.nextInt();
                    System.out.println("Give me another number from 1 to 10:");
                    int b = sc.nextInt();
                    addition(a, b);
                    break;
                }
                case 'L' : {
                    // Logic
                    System.out.println("Let's play Logic, my favourite!");
                    System.out.println("Mum does not let us play outside all the time. \nWe can play outside depending on whether or not we were good. \nBut if we were good and it is raining outside, can we still play?");
                    System.out.println("Mum let us play outside if your homework is done and if the weather is nice...");
                    System.out.println("Did you do your homework?");
                    boolean isHomeworkDone = sc.nextBoolean();
                    System.out.println("Is the weather nice outside?");
                    boolean isWeatherNice = sc.nextBoolean();
                    canWePlayFootball(isHomeworkDone, isWeatherNice);
                    break;
                }
                default  : {
                    System.out.println("You are being silly and trying to break me. Bye bye.");
                    System.exit(-1); // Exit the program abruptly here
                }
            }
            System.out.println("What shall we do next?");
            option = sc.next().charAt(0);
        }
        if (option == 'E') {
            sayBye();
        }
        sc.close();
    }

    public static void sayBye() {
        System.out.println("Was nice playing with you, until next time!");
    }

    public static String printStar(int n, String s) {
        if (n == 0) {
            return s;
        }
        s = s + "*";
        n = n - 1;
        return printStar(n, s);
    }

    /**
     * This is an example of a FOR LOOP in Java
     * @param startFrom
     * @param upTo
     * @param step
     */
    public static void counting(int startFrom, int upTo, int step) {
        for(int i = startFrom; i <= upTo; i += step) {
            System.out.println(i + "   " + printStar(i, "*"));
        }
    }

    public static void addition(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void whichIsTheBiggerNumber(int a, int b) {
        if (a > b) {
            System.out.println(a + " is larger than " + b);
        } else if (b > a) {
            System.out.println(b + " is larger than " + a);
        } else {
            System.out.println("Both numbers are equal!");
        }
    }

    public static void canWePlayFootball(boolean isHomeworkDone, boolean isWeatherNice) {
        if (isHomeworkDone && isWeatherNice) {
            System.out.println("You have done your homework, and the weather is nice, go play football.");
        } else {
            System.out.println("No playing outside, sorry!");
        }
    }

    public static void canWePlayInside(boolean isHomeworkDone, boolean isWeatherNice) {
        if (isHomeworkDone && !isWeatherNice) {
            System.out.println("You have done your homework, and the weather is horrible, stay in with your toy.");
        } else {
            System.out.println("No inside, sorry!");
        }
    }

    public static void timestable(int n) {
        for(int m = 1; m <= 12; m++) { // m++ means m = m +
            int rowResult = m * n;
            System.out.print(m + " X " + n + " = " + rowResult + "  ");
            // draw grouped stars for the current multiplier
            for (int p = 1; p <= m; p++) { // need to loop on a new variable!
                System.out.print(printStar(3, "") + "  ");
            }
            System.out.println();
        }
    }

    public static void oddOrEven() {
        // Pre-condition
        char again = 'y';
        Scanner sc = new Scanner(System.in);
        while(again != 'n') { 
            System.out.println("Give me a number and I will tell you if it is odd or even.");
            int number = sc.nextInt();
            if(number % 2 == 0) {
                System.out.println("Even!");
            } else {
                System.out.println("Odd!");
            }
            System.out.println("Would you like to go again? Type y for yes and n for no.");
            again = sc.next().charAt(0);                      
        }
        sc.close();  
    }
}
