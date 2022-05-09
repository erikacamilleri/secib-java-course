package lower.lesson18;

public class Date {
    /**
     * PROPERTIES
     */
    private int day;

    private int month;

    private int year;

    /**
     * CONSTRUCTOR
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * GETTERS and SETTERS
     */
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    /**
     * CUSTOM BEHAVIOUR METHODS
     */
    public static int stayDays(Date x, Date y)  {
        // method that calculates the number of nights between x and y  
    }
}
