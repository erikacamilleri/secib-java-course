package lower.lesson13;

public class SimpleJob {
    /**
     * ----- PROPERTIES ---------------------------------------
     */
    public int id;

    /**
     * ----- PARAMETERISED CONSTRUCTOR -------------------------
     */
    public SimpleJob(int id) {
        this.id = id;
    }

    /**
     * ----- METHODS ---------------------------------------
     */ 
    public void start() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Pretend I am a print job printing document " + id);
            try {
                Thread.sleep(2000); // because printers are slow we are faking a slow process by pausing the program for 2 seconds...
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
