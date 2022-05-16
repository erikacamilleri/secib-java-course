package lower.lesson18;

public class Group    {
    
    private String name; // name of group
    
    private int number;  // number of rooms allocated to the group

    public Group(String name, int number)      {
        this.name = name;
        this.number = number;      
    }

    public String getName() {
        return name;
    }
    
    public int getNumber() {
        return number;
    }

    int[] gRooms = new int[number];// array to hold room numbers allocated to the group
    
    public double bill(int[] gRooms) { 
        // method that calculates the bill for the group      
    }
}
