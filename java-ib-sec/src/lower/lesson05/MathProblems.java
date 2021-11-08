package lower.lesson05;

public class MathProblems {
    public static void main(String[] args) {
        int square = MathProblems.square(9, 0, 0);
        System.out.println(square);
    }
    
    /**
     * Square number from first principles.
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
}
