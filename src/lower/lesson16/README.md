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
| **Contract** | Coming Soon | No | -- |
| **Constructor** | The special method that is invoked using the `new` keyword when creating an *instance* of a *class*. Must share the same name of the class. | Yes | 13 |
| **Default Constructor** | A constructor with no parameters. If a *constructor* is not defined within a class then the default one will be invoked upon `new`. | Yes | 13 |
| **Overriding** | Coming Soon | No | -- |
| **Interface** | Coming Soon | No | -- |
| **Abstraction** | The process of defining classes by simplifying reality as much as possible. This means leaving unimportant details out and focusing on what is truly necessary. | Yes | 11 |
| **Encapsulation** | Bundling data and methods in a a class and data handling can only occur by using the class. | Yes | 16 |
| **Inheritance** | Defines the "is a" relationship between two classes whereby a subclass would share the attributes and methods of its parent class. | Yes | 16 |
| **Polymorphism** | Coming Soon | No | -- |
| **Aggregation** | Defines the "has a" relationship between two classes. Since a class would have properties that are in themselves objects then it implies that the class is an aggregation (of other classes). | Yes | 16 |
| **Association** | A relationship between two (or more) objects that normally reflects a relationship in the real world we are trying to model with OOP. | Yes | 12 |
| **Composition** | Coming Soon | No  | -- |

# OOP Principle 1 is Encapsulation (D.2.1)

Encapsulation is the idea of bundling data and methods in a unit (like a class) and data handling can only occur by using the unit (example in the form of an instance). So far, nothing new.

Looking back at lesson 11, we have *encapsulated* some data in a `Soldier` class and we could amend the `health` value through an instance of the class and call `reduceHealth`. 

```
public class Soldier {
    // declare variables
    public int health;

    // declare methods
    public void reduceHealth() {
        this.health = this.health - 1;
    }
}
```

In reality however, we could have completely bypassed `reduceHealth` and change the `health` attribute directly from an instance:

```
Soldier jack = new Solder();
jack.health = 100;
```

But changing the state from class methods is the right way to implement *abstraction*. The general idea behind this principle is to hide complexity as much as possible by removing the visibility of attributes. This is also known as information hiding. Hidden data can only be processed and altered through methods that provide read/write access.

## Hiding data using Access Modifiers (D.3.3)

What is an access modifier? In the example `public int health;` the word `public` is an access modifier. Access modifiers are keywords that let us know how the data can be accessed.

### Private

Access is restricted within the class only. An instance cannot directly access it.

### Protected

Similar to private however, as we have seen in previous lessons, it is perfectly common for classes to share some form of relationship (more detail on this soon). If a piece of data is protected then it can only be accessed within the class, or a class that is very closely related to it. Once again, an instance cannot directly access protected information.

### Public

This is the least restrictive. Any class can access data with this modifier through the class (normally an instance of it) that defines it. 

# OOP Principle 2 is Inheritence (D.2.2)

This relationships is the "is a" relationship and perhaps one of the most easiest to grasp and explain.

1. Lions, tigers and persians are different animals but they are all *Cats*.
2. Squares, triangles and circles have different mathematical properties but they are all *Shapes*.
3. Ford, BMW, Lamborghini come from different manufacturers but they are all *Cars*.

The above implies that even though objects are different, at the core they are grouped because they share some fundamental concepts.

A cat is a cat because an animal is: nocturnal, territorial, solitary, predatory and maternal-sexual.

A shape is a shape because a continuous line is eventually closed forming a boundary.

A car is a car because it is a wheeled vehicle for the purpose of transportation.

```
public class Lion extends Cat { ... }

public class Ford extends Car { ... }

public class Circle extends Shape { ... }
```

Inheritance allows the sharing of attributes and methods among different classes. In the examples above, `Lion` will *inherit* all the attributes and methods defined in `Cat`. 

# An Example

<img src="https://kingofexhibitionstands.com/wp-content/uploads/2020/06/Nespresso-koffiemachine-huren.jpg">