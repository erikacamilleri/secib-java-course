package lower.lesson13;

public class SimpleJobQueue {
    
    /**
     * --------- PROPERTIES -------------------------------
     */
    public int head = -1;

    public int rear = -1;

    // This is the first time we are creating an array of objects <3
    public SimpleJob[] jobs = new SimpleJob[100];

    /**
     * --------- METHODS  -------------------------------
     */
    public void enqueue(SimpleJob job) {
        // TODO implement
    }

    public void dequeue() {
        // TODO implement
    }

    public SimpleJob peek() {
         // TODO implement
        return null;
    }

    public boolean isEmpty() {
         // TODO implement
        return true;
    }

    public boolean isFull() {
        // TODO implement
        return false;
    }

    public int count() {
        if (this.isEmpty()) {
            return 0;
        } else if (this.isFull()) {
            return 100;
        } else {
            // TODO maybe use rear and head to figure out how many elements?
            return -1;
        }
    }

    /**
     * --------- SPECIAL STATIC METHODS -------------------------------
     */
    public static void simpleJobFinished(SimpleJob job) {
        // TODO: What happens when a particular job finishes?
    }
}
