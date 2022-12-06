package upper.lesson04;

/**
 * Employee contract
 */
abstract class Employee {
    
    // Attributes
    Salary salary;

    String position;
    
    // Methods
    abstract void getPaid();
}
