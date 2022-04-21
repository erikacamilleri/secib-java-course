package lower.lesson17.contracts;

public interface Reservoirable {
    /**
     * --- METHOD SIGNATURES ------------------------------------------------
     */
    public void clean();

    public void extract(double amount);

    public void heat(double temperature);
}
