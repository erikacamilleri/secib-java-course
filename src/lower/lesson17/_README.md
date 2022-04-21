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
| **Polymorphism** | Coming Soon | No | -- |
| **Aggregation** | Defines the "has a" relationship between two classes. Since a class would have properties that are in themselves objects then it implies that the class is an aggregation (of other classes). This is normally a tightly coupled relationship whereby the existence of a class only makes sense along with another. | Yes | 16 |
| **Association** | A relationship between two (or more) objects that normally reflects a relationship in the real world we are trying to model with OOP. | Yes | 12 |
| **Composition** | Defines the "uses a" relationship between two (or more) objects. Even though there is clearly some dependency between these, they are quite loosely coupled. This means that one class can exist without having the other. | Yes | 16 |

# OOP is a bed of roses; but do not ignore the thorns!

Forming classes and linking them seems easy enough. Using OOP principles to model real world problems that already have a real world solution seems natural. OOP is packed with features that initially can give us flexibility and power.

What if however you are trying to model something new that does not quite exist yet? What if you are learning how to model a problem in increments, as we do in Agile? Objects *will* change, links and relationships *will* change. The problem will grow and so will your model. Maintaining object oriented designs *can be* hard if the world you are trying to model is evolving over a long period of time!

# Object dependencies are thorns (D.1.7)

We had already learnt what a dependency is. 

> A dependency is simply when a class needs one or more other classes to function. This is also defined as the "makes use of" relationship between two or more classes.

Recall from lesson 16:

```
/**
* --------- CONSTRUCTOR -----------------------------
*/
public CoffeeMachine() {
    this.isOn = false;
    this.isProgramInProgress = false;
    this.milkTank = new MilkTank();
    this.waterTank = new WaterTank();
}
```

In the previous lesson we have defined a `CoffeeMachine` class, a `MilkTank` class and a `WaterTank` class. When a class creates instances of other classes using the `new` keyword then we have coded a ***hard dependency***.

Fun Tip: Below are two phrases that scare any developer:
1. I performed `DROP table` in production.
2. I coded a ***hard dependency*** between object A and object B.

Why are ***hard dependencies*** so bad? There is no such thing as *bad code* but it can raise eyebrows because when class A creates and instance of class B then there is a 'take it or leave it' situation going on. In a world where modern culture is centred around **configurable**, **custom**, **customer has control** then there is really little room for hard dependencies like above.

There are many real life analogies to help us understand. Let us imagine we are each buying a nice t-shirt for ourselves to wear.

Popular designer brands tend to provide a "take it or leave it" shopping experience:
<img width="500" src="https://github.com/erikacamilleri/secib-java-course/blob/main/img/house_of_fraser_tshirts.PNG?raw=true">

Artists and aspiring fashion designers are finding a lucrative outlet in tshirts and garments with the help of Etsy. Even with a modest price tag, they *can* compete with the big fish for one reason - customisation.

<img width="500" src="https://github.com/erikacamilleri/secib-java-course/blob/main/img/etsy_custom_tshirts.PNG?raw=true"/>

The `CoffeeMachine` we designed in Java last lesson is also a "take it or leave it" because we could only produce one kind of coffee machine that has a particular `MilkTank` and a particular `WaterTank`. It was so easy to build and we felt good about ourselves. But that feeling will be short lived because...

Client:

"I really like ice coffee sometimes. Does the water tank have a compartment for sparkling water to make bubbly iced-coffee?"

Us:

<img src="https://media.giphy.com/media/LyJ6KPlrFdKnK/giphy.gif" />

We panic, we create a boolean property `canMakeIcedCoffee` in `CoffeeMachine`, pass it in to the `CoffeeMachine` constructor and in turn pass it in to the `WaterTank` and just like that, we broke the fundamental principle of *Seperation of Concerns* or more formally Encapsulation.

<img src="https://media.giphy.com/media/2kUEoTOLFfsoeQBDsQ/giphy.gif"/>

This reduces the opportunity for <b>code reuse</b> and this is important to the developers (not to the client) to maintain a competitive advantage.  

> Hard dependencies, aka Composition, aka the black diamond in UML, should be avoided in general and should only be implemented when you want to create a take it or leave it situation. In this day and age a black diamond in the UML can be difficult to justify.

So for our unsellable `CoffeeMachine` we have two options:

## Option 1 (CCS pages 306 - 307)

If class A is composed of B and C then there is no point of having B and C because their existence depends on A being created anyway. For us this means that everything in `MilkTank` and in `WaterTank` can go into `CoffeeMachine`. This is not very popular with professionals who use frameworks because code readability is still important and this solution feels cluttered but it is still valid and may be appropriate if overall class A remains small. 

## Option 2 Creating interfaces and use dependency injection 

### Interface and Overriding

An <b>interface</b> is an abstraction class that simply *defines* what "behaviour" the subclass should have. You might think that it is similar to inheritence but the dependency using interfaces is much more flexible.

1. Torch, lamp, candles are all sources of *Light*. Sun and moon are also sources of *Light*. However the first group of light sources have the "ability" to be *switched on and off*. An electric blanket is not a source of light but can still be switched on/off.
2. Brand Houses, Etsy and Adidas all sell *TShirts* but only Etsy provides the "ability" to *customise*. Ikea is not really known to sell t-shirts but they also provide the ability to customise furniture. 

The above implies that even though two objects are different behaviour can be similar.

```
public interface Switchable {
    public boolean toggle(); // no method body!
}

public class Torch implements Switchable {
    
    boolean isOn;

    // Override means that Torch is providing code for toggle() which is in Switchable
    @Override
    public boolean toggle() {
        return !isOn;
    }
}

public class Lamp implements Switchable {
    // code to implement toggle
}

public class ElectricBlanket implements Switchable {
    // code to implement toggle
}
```

### Dependency injection

<b>Dependency injection</b> means do not allow classes to create instances of other classes using the `new` keyword. Pass instances in through the constructor but these instances should `implement` an `interface`.

There is a really good explainer video [here](https://www.youtube.com/watch?v=tW6UHD81SG0).

What will our new and improved `CoffeeMachine` look like now? We need to create an interface for the `WaterTank` and the `MilkTank` which I called `Reservoirable`.

```
public interface Reservoirable {
    public void clean();

    public void extract(double amount);

    public void heat(double temperature);
}
```

The `MilkTank` and the `WaterTank` will both have code for behaviour defined by `Reservoirable`. Have a good look at the code that I wrote for this lesson. The part of the UML concerning the `CoffeeMachine` and the tanks is now like this:

<img src="https://raw.githubusercontent.com/erikacamilleri/secib-java-course/97548da04c63995fe135bf4da775820ae3c1cc1f/draw.io/lower17_coffee_machine.drawio.svg"/>

Notice how the 'black diamond' is elimintated! 

# Design patterns and use of frameworks

A way to ensure that you do not have a lot of dependencies is to use tried and tested OOP techniques which are referred to as <b>Design Patterns</b>. Design patterns represent the best practices used by experienced object-oriented software developers. Design patterns are solutions to general problems that software developers faced during software development. A specific problem you are working on is probably a variation of some general problem which there is a design pattern for. In fact, <b>Dependency Injection</b> is a design pattern in itself!

You can assume that there are many design patterns out there and when you are inexperienced it is still extremely difficult to map your problem to a more general problem. So spending time deciding on a design pattern that fits may seem counter productive. This is why developers use frameworks. A software framework is a template for a kind of program (like a webapp, or mobile app etc...) that combines various design patterns that are appropriate for the most generic scenario. To explain, if you are building a desktop application using Google's Flutter then you are probably making use of design patterns like Observer Pattern. If you are building a web application in Java using Spring then you are making use of MVC Pattern and Dependency Injection. Dependency Injection is a pattern that is provided out of the box in most modern frameworks. Therefore you don't really need to think about it, but you can expect it to work like "magic". The challenge would be to find the best framework for you.

## OOP is not for everyone

https://thenewstack.io/why-are-so-many-developers-hating-on-object-oriented-programming/





