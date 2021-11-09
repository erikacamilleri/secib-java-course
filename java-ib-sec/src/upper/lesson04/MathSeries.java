package upper.lesson04;

public class MathSeries {
    
    public static void main(String[] args) {
        
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
    public static void fibonacciSeries(int n, int step) {
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
