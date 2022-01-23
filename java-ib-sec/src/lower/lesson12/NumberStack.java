package lower.lesson12;

public class NumberStack {
    
    /**
     * ----- PROPERTIES -----------------------------------------------------------------
     */
    // an index pointer to the top of the stack
    public int topIndex = -1;

    // an index pointer to the bottom of the stack
    public int bottomIndex = 0;

    // an array to store the numbers
    public Integer[] numbers = new Integer[10]; // using the object wrapper for int provided by Java

    /**
     * ----- METHODS ---------------------------------------------------------------------
     */

    // adds a number to the top of the stack
    public void push(int n) {
        this.topIndex = this.topIndex + 1;
        this.numbers[this.topIndex] = n;
    }

    // gets and removes the number from the top of the stack
    public int pop() {
        int value = numbers[this.topIndex];
        this.numbers[this.topIndex] = null;
        this.topIndex = this.topIndex - 1;
        return value;
    }

    // gets the value at the top of the stack but does not remove it
    public int peek() {
        return this.numbers[this.topIndex];
    }

    // checks if the stack is empty
    public boolean isEmpty() {
        return this.numbers[this.bottomIndex] == null; // an alternative check would be topIndex == -1
    }
}
