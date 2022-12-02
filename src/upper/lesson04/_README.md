# May 2017 Paper 2 Option D

13 a. A class simply defines what a real world entity has as attributes (characteristics) and methods (behaviour). It does not take up any space in main memory. The instance however, is a real world example of that particular entity and takes up memory when the program is in execution.

Example:

```
// This is an example of a class
public class Employee {
    
    // Attributes
    Salary salary;

    String position;
    
    // Methods
    public void getPaid() {
        
    }
}

// This is an example of an instance
public static void main(String[] args) {
    Employee salesManager = new Employee();
}
```

b. Inheritence describes a relationship between two classes, in particular it is an 'is-a' relationship. For example, a SalesPersonnel is-a-type-of Employee and OfficeStaff is-a-type-of Employee. 

Example code:
```
/**
 * Extends is a keyword for inheritence in Java.
 * Anything that is of the Employee, is also of the SalesPersonnel.
 * This is also knows as an 'is-a-type-of' relationship.
 */
public class SalesPersonnel extends Employee {
    
}
```

This implies that anything that Employee has (attributes and methods) also belong to the SalesPersonnel and the OfficeStaff. Moreover, for the GUI, perhaps we can consider a view called AddEmployee in order to allow a user to enter new details about any type of employee.

```
public static void main(String[] args) {
    save(new SalesPersonnel());
    save(new OfficeStaff());
}

public static void save(Employee employee) {
    // some amazing things
}
```

c. A library is a package of code that is written by someone else and can get imported into a custom project (essentially using code somebody else wrote). A very good example of a library for this administration program would be an object library for graphical components e.g. Button, Panel, TextBox. This would make building applications easier, quicker and very manageable to debug. It is assumed, that when you use a library, it was tested by the developer/s that built it.

14 a.

```
public SalesPersonnel(String id)   {
    this.id = id;
    ths.salesHistory = new Sales[100];
    this.coiunt = 0;
}
```
14 b. We need the getter methods to be able to access attributes that are *private*. Private attributes cannot be accessed outside of the class they are in. 
Example:

`private id;`

`public int getId() { return this.id }`

To access `id` one must go through the `getId()` method.

14 c. i. 

c. ii There is a dependency between SalesPersonnel and Sales. The SalesPersonnel class makes use of public methods in the Sales class. Therefore, if I make a change to any of the public methods in the Sales class, there is a good chance that I will break code, that was working in the SalesPersonnel class. 

d. 102
   2
   2550.40
   5000.00

e.
```
public double calcTotalSales() {
        // recurring total
        double totalSales = 0;
        for (int i = 0; i < salesHistory.length; i++) {
            Sales s = salesHistory[i];
            totalSales = totalSales + (s.getValue()*s.getQuantity());
        }
        return totalSales;
    }
```

f. 

```
// input, process, output
// input - parameters in the ()
// output - return and the type
// process - anything in between input and output
public static String highest(SalesPersonnel[] salesPeople) {
    String highestId = "";
    double highestTotalValue = -1.0;
    for(int i = 0; i < salesPeople.length; i++) {
        SalesPersonnel sp = salesPeople[i];
        double totalSales = sp.calcTotalSales();
        if (totalSales > highestTotalValue) {
            highestTotalValue = totalSales;
            highestId = sp.getId();
        }
    }
    return highestId;
}
```

