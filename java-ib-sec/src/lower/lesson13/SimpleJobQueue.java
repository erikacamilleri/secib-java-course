package lower.lesson13;

public class SimpleJobQueue {
    
    /**
     * --------- PROPERTIES -------------------------------
     */
    public int head = -1;

    public int rear = 0;

    // This is the first time we are creating an array of objects <3
    public SimpleJob[] jobs = new SimpleJob[100];

    /**
     * --------- METHODS  -------------------------------
     */
    public void enqueue(SimpleJob job) {
        if (isFull()) {
            return; // we don't want to do anything
        }
        if (isEmpty()) {
            head = 0;
        }
        jobs[rear] = job;
        rear = rear + 1;
    }

    public void dequeue() { 
        if (isEmpty()) {
            return; // we don't want to do anything
        }
        for(int i = head; i < rear - 1; i++) {
            SimpleJob moveUp = jobs[i+1];
            jobs[i] = moveUp;
        }
        rear = rear - 1;
        // if we dequeued the last element then head is -1
        if (rear == 0) {
            head = -1;
        }
    }

    public SimpleJob peek() {
        if (isEmpty()) {
            return null;
        }
        SimpleJob peek = jobs[head];
        return peek;
    }

    public boolean isEmpty() {
        if (head == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (rear == jobs.length) {
            return true;
        }
        return false;
    }

    public int count() {
        if (isEmpty()) {
            return 0;
        } else if (isFull()) {
            return 100;
        } else {
            return rear;
        }
    }
}
