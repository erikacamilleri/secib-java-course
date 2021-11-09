package lower.lesson05;

public class MathProblems {
    public static void main(String[] args) {
        /**
         * Given a number n, square returns n * n
         */
        int square = MathProblems.square(9, 0, 0);
        System.out.println("Test recursive square n = 9: " + square);

        /**
         * Given a number n, fibonacciSeries displays fibonacci numbers in sequence up to n
         */
        fibonacciSeries(6, 0);
    }
    
    /**
     * Square number from first principles.
     * https://brilliant.org/courses/math-fundamentals/intro-to-math-fundamentals/introduction/1/
     * @param n
     * @param step
     * @param blocks
     * @return
     */
    public static int square(int n, int step, int blocks) {
        blocks = blocks + (2 * step) + 1;
        if (step < n - 1) {
            step = step + 1;
            return MathProblems.square(n, step, blocks);
        } else {
            return blocks;
        }
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
        
        System.out.print(fibonacci(step) + " ");
        
        if (step < n) {
            step = step + 1;
            fibonacciSeries(n, step);
        }
    }
}
