package learning_aids;

/**
 * An example of concurrency in Java
 */
public class ThinkingConcurrently {

    public static void example() {
        
        // The creation of a process in Java
        Thread t1 = new Thread(){
            public void run() {
                for(int i=0; i<10; i++) {
                    System.out.println("This is the first loop: " + i);
                    try {
                        Thread.sleep(3000);
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public void run() {
                for(int i=0; i<10; i++) {
                    System.out.println("This is the second loop: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }

    public static void sequential() {
        
        for(int i=0; i<10; i++) {
            System.out.println("This is the first loop: " + i);
            try {
                Thread.sleep(1000);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(int i=0; i<10; i++) {
            System.out.println("This is the second loop: " + i);
            try {
                Thread.sleep(1000);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
