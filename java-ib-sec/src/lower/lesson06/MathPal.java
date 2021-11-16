package lower.lesson06;

import java.util.Scanner;

public class MathPal {
    
    public static void main(String[] args) {
        onboarding();
        counting(1, 7, 1);
    }

    public static void onboarding() {
        System.out.println("***************************");
        System.out.println("******** MATH PAL *********");
        System.out.println("***************************");
        System.out.println("Welcome to MathPal, when we get enough money we will greet you with a jingle!");
        System.out.println("This is an educational toy for early learners.");
        System.out.println("C. Simple Counting 1,2,3 [Pic of Monkey]");
        System.out.println("A. Addition [Pic of Apples in Basket]");
        System.out.println();
    }

    public static void chooseOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What shall we do today?");
        char option = sc.next().charAt(0);
        sc.close();
        
        // if (option == 'C') {
        //     counting();
        // } else {
        //     if (option == 'A') {
        //         addition();
        //     } else {
        //         System.out.println("You are being silly and trying to break me. Bye bye.");
        //     }
        // }
        /**
         * In order to avoid a lot of nested ifs or if else if else, we are going to do a 
         * switch statement in Java
         */
        switch (option) {
            case 'C' : addition(); break;
            case 'A' : addition(); break;
            default  : System.out.println("You are being silly and trying to break me. Bye bye.");
        }
    }

    public static String printStar(int n, String s) {
        if (n == 1) {
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
            System.out.println(i + "" + printStar(i, "*"));
        }
    }

    public static void addition() {

    }
}
