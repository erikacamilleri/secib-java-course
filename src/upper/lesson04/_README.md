# Glossary

| **Term** | Meaning | Covered | Lesson |
|---|---|---|---|
| **Object-Oriented Programming (OOP)** | An approach to designing and building applications that are flexible, natural, well-crafted, and testable by focusing on objects that interact cleanly with one another. | Yes | 15 |
| **Class** | A code file which acts as the blueprint, or cookie cutter, of an object by specifying the properties (characteristics) that and methods (behaviour). | Yes | 11 |
| **Property** | A characteristic of an object defined in the class e.g. in a class called `Person` a property can be `eyeColour`. | Yes | 11 |
| **Method** | The code that defines behaviour of a class normally contains a verb like `changeWeapon()` or `respawn()`. | Yes | 11 |
| **Mutator** | A method in a class that provides a way to update the current state of an object in other program parts. | Yes | 16 |
| **Accessor** | A method in a class that provides a way to get the current state of an object in other program parts. | Yes | 16 |
| **Members** | The *properties* and *methods* of a class. | Yes | 11 |
| **Instance** | The variable that stores a single object in memory that retains the state during a program's lifetime. This is created using the `new` keyword e.g. `Soldier jack = new Soldier();`. In this case `jack` is an instance of `Soldier`. | Yes | 11  |
| **Overloading** | Coming Soon | No | -- |
| **Contract** | Inspired by "real world contracts" because a subclass that either `extends` or `implements` another abstract class is *promising* to obey behavioural rules defined by the super with the option to `@Override` as long as rules are enforced. | Yes | 17 |
| **Constructor** | The special method that is invoked using the `new` keyword when creating an *instance* of a *class*. Must share the same name of the class. | Yes | 13 |
| **Default Constructor** | A constructor with no parameters. If a *constructor* is not defined within a class then the default one will be invoked upon `new`. | Yes | 13 |
| **Overriding** | Allows a subclass (a class that either `extends` or `implements`) to provide specific code for methods defined in the superclass or interface. Methods defined in an interface *must* be overridden by the subclass. | Yes | 17 |
| **Interface** | Defines the "behaves like" relationship between two classes whereby the subclass would need to `@Override` the methods defined by the interface class. Interfaces are also referred to as 'contracts' because when a class `implements` an interface then it *promises* to have code for all behavioural methods. | Yes | 17 |
| **Abstraction** | The process of defining classes by simplifying reality as much as possible. This means leaving unimportant details out and focusing on what is truly necessary. | Yes | 11 |
| **Encapsulation** | Bundling data and methods in a a class and data handling can only occur by using the class. | Yes | 16 |
| **Inheritance** | Defines the "is a" relationship between two classes whereby a subclass would share the attributes and methods of its parent class. | Yes | 16 |
| **Polymorphism** | When code can take *many forms* either through a strong relationship between classes like inheritence and method overriding, or, method overloading (using the same name for multiple methods but with different parameters) e.g., overloading a constructor.  | Yes | This lesson |
| **Aggregation** | Defines the "has a" relationship between two classes. Since a class would have properties that are in themselves objects then it implies that the class is an aggregation (of other classes). This is normally a tightly coupled relationship whereby the existence of a class only makes sense along with another. | Yes | 16 |
| **Association** | A relationship between two (or more) objects that normally reflects a relationship in the real world we are trying to model with OOP. | Yes | 12 |
| **Composition** | Defines the "uses a" relationship between two (or more) objects. Even though there is clearly some dependency between these, they are quite loosely coupled. This means that one class can exist without having the other. | Yes | 16 |


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

h. The changes I propose are as follows:
1. We added the getPaid() in the Employee class.
2. The Employee class was changed to be abstract, and even the getPaid() is abstract so that Employee is class that describes a contract.
3. Override getPaid() in the OfficeStaff and in the SalesPersonnel.

i. First of all, an example of polymorphism is a method that may have multiple implementations. In the previous question, we indeed have a getPaid() method which must be implemented differently because an OfficeStaff and a SalesPersonnel get paid in different ways. Polymorphism is most evident between OfficeStaff, SalesPersonnel and Employee. Because any employee in the company, can take a different form e.g., can either be an OfficeStaff or a SalesPersonnel, but both inherit from Employee so no matter the shape or form, the both get paid.
