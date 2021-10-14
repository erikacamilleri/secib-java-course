package upper.lesson01;

public class Person {

    // Private autoIncrement to calculate ID
    private static int autoIncrement = 0;

    // Properties of person
    public int id;

    public String name;
    
    public int age;

    public Person(String name, int age) {
        this.id = autoIncrement++;
        this.name = name;
        this.age = age;
    }
}
