package lower.lesson12;

public class NumberStack {

    public int topIndex = 0;

    public int bottomIndex = 0;

    public Integer[] stack = new Integer[10];

    public void push(int n) {
        stack[topIndex] = n;
    }

    public int pop() {
        int value = stack[topIndex];
        stack[topIndex] = null;
        topIndex = topIndex - 1;
        return value;
    }

    public boolean isEmpty() {
        return stack[bottomIndex] == null;
    }
}
