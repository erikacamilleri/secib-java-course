package upper.lesson04;

/**
 * Extends is a keyword for inheritence in Java.
 * Anything that is of the Employee, is also of the SalesPersonnel.
 * This is also knows as an 'is-a-type-of' relationship.
 */
public class SalesPersonnel extends Employee {
    
    // Attributes
    private String id;
    
    private Sales[] salesHistory; // details of the different sales
    
    private int count = 0;  // number of sales made

    // Constructor
    public SalesPersonnel(String id)   {
        this.id = id;
        this.salesHistory = new Sales[100];
        this.count = 0;
    }

    public SalesPersonnel(String id, Sales[] s, int c)  {
       this.id = id;
       this.salesHistory = s;
       this.count = c;
    }

    // Getters and Setters
    public int getCount() { 
        return count; 
    }
    
    public String getId() {
        return id;
    }
    
    // Behavioural Methods

    public void setSalesHistory(Sales s) {

    }

    public double calcTotalSales() {
        // recurring total
        double totalSales = 0;
        for (int i = 0; i < salesHistory.length; i++) {
            Sales s = salesHistory[i];
            totalSales = totalSales + (s.getValue()*s.getQuantity());
        }
        return totalSales;
    }
}
