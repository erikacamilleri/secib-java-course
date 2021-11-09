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
        /**
         * Example of calling a procedure.
         */
        System.out.print(fibonacci(step) + " ");
        
        if (step < n) {
            step = step + 1;
            fibonacciSeries(n, step);
        }
    }
    
    /**
     * ACS Page 2 5.1 Pages 2 - 3
     * This makes the same assumption as in the flow chart, that move is another procedure
     * we need to call. 
     * @param n         | stack number
     * @param from      | move stack from the rod
     * @param to        | move stack to rod
     * @param temporary | stacks out of the way
     */
    public static void towersOfHanoi(int n, char from, char to, char temporary) {
        if (n == 1) {
            System.out.println("Move " + n + " from " + from + " to " + to + ".");
            return;
        }
        
        towersOfHanoi(n - 1, from, temporary, to);
        System.out.println("Move " + n + " from " + from + " to " + to + ".");
        
        towersOfHanoi(n - 1, temporary, to, from);
        System.out.println("Move " + n + " from " + from + " to " + to + ".");
    }
}
