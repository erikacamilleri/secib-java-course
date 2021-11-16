package upper.lesson04;

import java.util.Scanner;

import upper.lesson04.logging_system.LogEvent;
import upper.lesson04.logging_system.observer.ConsolePrintObserver;
import upper.lesson04.logging_system.observer.EmailDeveloperObserver;
import upper.lesson04.logging_system.observer.FileWriteObserver;
import upper.lesson04.logging_system.subscriber.LogEventSubscriber;

public class MathSeries {

    public static LogEventSubscriber logEventSubscriber;

    private static void boot() {
        logEventSubscriber = new LogEventSubscriber();
        logEventSubscriber.attachObserver(new EmailDeveloperObserver());
        logEventSubscriber.attachObserver(new FileWriteObserver());
        logEventSubscriber.attachObserver(new ConsolePrintObserver());
    }
    
    public static void main(String[] args) {
        
        /**
         * Set up the environment for the app.
         */
        boot();

        /**
         * From here the client interacts with the app.
         */
        System.out.println("** Welcome to my IA **");
        System.out.println("This program lets you print fibonacci series.\n");
        
        /**
         * Let us accept some form of input from a client.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter n: ");
        int n = sc.nextInt();

        try {
            fibonacciSeries(n, 0);
        } catch (Exception e) {
            // Handle the error
            logEventSubscriber.notifyAbout(new LogEvent(3, "NumberTooLargeException", e.getMessage(), null));
        }
        sc.close();
    }

    /**
     * https://en.wikipedia.org/wiki/Fibonacci_number
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n-1) + fibonacci(n-2);
        } else {
            return n;
        }
    }

    /**
     * https://www.youtube.com/watch?v=wTlw7fNcO-0
     * @param n
     * @param step
     */
    public static void fibonacciSeries(int n, int step) throws Exception {

        // Check if the number is too big...
        if (n > 50000) {
            throw new Exception("The number is too large the limit set is 50000.");
        }

        /**
         * Example of calling a procedure.
         */
        System.out.print(fibonacci(step) + " ");
        
        if (step < n) {
            step = step + 1;
            fibonacciSeries(n, step);
        }
    } 
}
