package upper.lesson04;

public class Sales {
    
    private String itemId;  // id of the item
    
    private double value;  // the price of one item 
    
    private int quantity;  // the number of the items sold   
    
    // constructor missing
    public Sales(String itemId, double value, int quantity) {

    }
    
    public double getValue() {return value;}
    
    public int getQuantity() {return quantity;}
}
