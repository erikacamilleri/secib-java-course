package lower.lesson13;

public class SimpleJob {
    /**
     * ----- PROPERTIES ---------------------------------------
     */
    public int id;

    /**
     * ----- PARAMETISED CONSTRUCTOR -------------------------
     * @param id
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
                Thread.sleep(2000); // because printers are slow...
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
