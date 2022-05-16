package lower.lesson18;

public class Client {
    /**
     * PROPERTIES
     */
    private int customerID;
    
    private String name;
    
    private Date arrive;
    
    private Date leave;
    
    private Room bedroom;

    private int[] date; // {2, 5, 2022}

    /**
     * CONSTRUCTOR
     */
    public Client(int id, String c, Date dateIn, Date dateOut, Room r) {
        setCustomerID(id);
        setName(c);
        setArrive(dateIn);
        setLeave(dateOut);
        setBedroom(r);
    }

    /**
     * GETTERS and SETTERS
     */
    public void setCustomerID(int id) {
        customerID = id;
    }

    public void setName(String c) {
        name = c;
    }

    public void setArrive(Date dateIn) {
        arrive = dateIn;
    }

    public void setLeave(Date dateOut) {
        leave = dateOut;
    }

    public void setBedroom(Room r) {
        bedroom = r;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public Date getArrive() {
        return arrive;
    }

    public Date getLeave() {
        return leave;
    }

    public Room getBedroom() {
        return bedroom;
    }
    
    /**
     * CUSTOM BEHAVIOURAL METHODS
     */
    public void bill()   { 
        int numberOfNights = Date.stayDays(arrive, leave);
        double total = numberOfNights * bedroom.price;
        System.out.println("Name: " + name);
        System.out.println("Price per night: " + bedroom.price);
        System.out.println("Number of nights: " + numberOfNights);
        System.out.println("Dates: " + arrive + " - " + leave);
        System.out.println("Total Due: " + total); 
    }
}
