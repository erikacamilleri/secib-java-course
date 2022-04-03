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

    /**
     * An addition by Ms Camilleri for lesson 17 (3.04.2022)
     */
    @Override
    public boolean equals(Object o) {
        SimpleJob compare = (SimpleJob) o;
        return compare.id == this.id;
    }
}
