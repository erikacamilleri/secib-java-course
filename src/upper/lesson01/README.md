# Glossary

| **Term** | Meaning | Covered | Lesson | Year |
|---|---|---|---|---|
| **Object-Oriented Programming (OOP)** | An approach to designing and building applications that are flexible, natural, well-crafted, and testable by focusing on objects that interact cleanly with one another. | Yes | 15 | 12 |
| **Class** | A code file which acts as the blueprint, or cookie cutter, of an object by specifying the properties (characteristics) that and methods (behaviour). | Yes | 11 | 12 |
| **Property** | A characteristic of an object defined in the class e.g. in a class called `Person` a property can be `eyeColour`. | Yes | 11 | 12 |
| **Method** | The code that defines behaviour of a class normally contains a verb like `changeWeapon()` or `respawn()`. | Yes | 11 | 12 |
| **Mutator** | A method in a class that provides a way to update the current state of an object in other program parts. | Yes | 16 | 12 |
| **Accessor** | A method in a class that provides a way to get the current state of an object in other program parts. | Yes | 16 | 12 |
| **Members** | The *properties* and *methods* of a class. | Yes | 11 | 12 |
| **Instance** | The variable that stores a single object in memory that retains the state during a program's lifetime. This is created using the `new` keyword e.g. `Soldier jack = new Soldier();`. In this case `jack` is an instance of `Soldier`. | Yes | 11  | 12 |
| **Overloading** | Coming Soon | No | -- | 12 |
| **Contract** | Inspired by "real world contracts" because a subclass that either `extends` or `implements` another abstract class is *promising* to obey behavioural rules defined by the super with the option to `@Override` as long as rules are enforced. | Yes | 17 | 12 |
| **Constructor** | The special method that is invoked using the `new` keyword when creating an *instance* of a *class*. Must share the same name of the class. | Yes | 13 | 12 |
| **Default Constructor** | A constructor with no parameters. If a *constructor* is not defined within a class then the default one will be invoked upon `new`. | Yes | 13 | 12 |
| **Overriding** | Allows a subclass (a class that either `extends` or `implements`) to provide specific code for methods defined in the superclass or interface. Methods defined in an interface *must* be overridden by the subclass. | Yes | 17 | 12 |
| **Interface** | Defines the "behaves like" relationship between two classes whereby the subclass would need to `@Override` the methods defined by the interface class. Interfaces are also referred to as 'contracts' because when a class `implements` an interface then it *promises* to have code for all behavioural methods. | Yes | 17 |
| **Abstraction** | The process of defining classes by simplifying reality as much as possible. This means leaving unimportant details out and focusing on what is truly necessary. | Yes | 11 | 12 |
| **Encapsulation** | Bundling data and methods in a a class and data handling can only occur by using the class. | Yes | 16 | 12 |
| **Inheritance** | Defines the "is a" relationship between two classes whereby a subclass would share the attributes and methods of its parent class. | Yes | 16 |
| **Polymorphism** | Coming Soon | No | -- | 12 |
| **Aggregation** | Defines the "has a" relationship between two classes. Since a class would have properties that are in themselves objects then it implies that the class is an aggregation (of other classes). This is normally a tightly coupled relationship whereby the existence of a class only makes sense along with another. | Yes | 16 | 12 |
| **Association** | A relationship between two (or more) objects that normally reflects a relationship in the real world we are trying to model with OOP. | Yes | 12 | 12 |
| **Composition** | Defines the "uses a" relationship between two (or more) objects. Even though there is clearly some dependency between these, they are quite loosely coupled. This means that one class can exist without having the other. | Yes | 16 | 12 |
| **Static** | A member variable of a given class which is shared across all instances (objects), and is accessible as a member variable of these objects. | Yes | 1 | 13 |

# Data Management Systems

If you are building a productivity app of some sort, or a self-service application you will probably need to maintain some database. A database is a collection of data files. In case you are confused by this notion, and you are more used to thinking in terms of objects, probably some objects would represent a data file.

Managing data is a common problem in OOP applications therefore it comes as no surprise that there is a particular design pattern that we should follow.

## Data Access Object Design Pattern

The <a href="https://www.baeldung.com/java-dao-pattern">Data Access Object (DAO) pattern</a> is a structural pattern that suggests that we should isolate the application/business layer from the persistence layer (usually a relational database but could be any other persistence mechanism such as a flat file) using an <b>abstract</b> API.

## Link 4.3.1 Fundamental Operations of a Computer

If we had to rethink computers and reinvent entirely we still have to preserve the following basic functions:
- Create
- Read
- Delete
- Update
- Compare

It is only natural that we want to do all of the above with our data records. We want to create a record. We want to read it. We want to delete it. We want to make changes, so update it. And when we probably want to search, order data so we would need to compare two entities.

## Advantages/Disadvantages of using third-party code/libraries

<b>Advantages</b>

<b>Disadvantages</b>

## Always Recall Links from Last Year Mainly:
- D.3.1 Define the terms: class, identifier, primitive, instance variable, parameter variable, local variable.
- D.3.2 Define the terms: method, accessor, mutator, constructor, signature, return
value.
- D.3.3 Define the terms: private, protected, public, extends, static. These are generally related to the OOP.
- D.3.4 Describe the uses of the primitive data types and the reference class string.


