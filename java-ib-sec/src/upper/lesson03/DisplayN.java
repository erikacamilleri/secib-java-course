package upper.lesson03;

/**
 * CCS Page 222
 * Analysing algorithms expressed as flowcharts and tracing them.
 */
public class DisplayN {

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLUE = "\u001B[34m";

    public static boolean LOGGING = true;

    public static void main(String[] args) {
        // N = 0
        // while n less than or equal to 3
        //     DISPLAY "ok"
        //     n = n + 1
        // end while
        // DISPLAY n
        int n = 0;

        while (n <= 3) {
            System.out.println("OK");
            n = n + 1;
            log("LOG[DEBUG]    Value of n: " + n + "    Output: OK");
        }
        System.out.println(n);
        log("LOG[DEBUG]    Value of n: " + n + "    Output: " + n);
    }

    public static void log(String message) {
        if (LOGGING) {
            System.out.println(TEXT_BLUE + message + TEXT_RESET);
        }
    }
}
