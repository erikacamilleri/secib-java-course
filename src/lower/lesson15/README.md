# Object Oriented Thinking

<img src="https://miro.medium.com/max/800/1*_uqsddZ9YiOruN_Op6WN_g.png"/>

Object-oriented programming is just a paradigm or *a way of thinking*. It is by no means a magic pill that will solve all problems. Object-oriented thinking does not apply to all problems we solve with computers. But... it *is very applicable* for various real-world (businessy) problems.

Java was not created with the intention of kids learning it at school. It was created out of necessity. The imperative style of programming was becoming difficult to maintain when working on large-scale projects and building flexible systems for businesses. Professionals working within teams felt it was necessary for domain to be really present in the programs they write. To explain, if a programmer is building a system for an entire school then the program should "model" that micro environment. These kind of tasks were not very fun to do with programming languages like Pascal and Visual Basic. It does not mean that they were bad languages, just these tools did not cater to the ever changing needs of the time.

If at the start of the course you were new to programming then you probably felt that steep learning curve. It will likely feel the same way with OOP. A way of thinking is something you learn and refine over a long period of time. There is also a lot of "jargon" that unfortunately you must study for the exam. I suggest to keep this nifty <a href="https://www.edureka.co/blog/cheatsheets/java-oop-cheat-sheet/" target="_blank">cheat sheet</a> handy during practical lessons. But don't let this discourage you. The words are only there so that developers can communicate effectively and I will be covering each and every term clearly. It is more important that you find your way to enjoy the journey.

## Unified Modelling Language (UML)

UML stands for Unified Modelling Language and it provides a way to visualise programs that are object-oriented. 

If you ever find yourself in a team of developers who *all* know UML (good luck with that) then you can use this tool for technical discussions in order to achieve one or more of the following:

- Specification which identifies what is needed to meet business requirements.
- Standard visualization because it is very common to work with people with different backgrounds and nationalities so UML *should be* something everyone can get behind.
- Architecture or design. UML can quickly let you know whether an idea is elegant or not.
- Construction since every diagram should be easily translated into code with minimal effort. Junior Developers fresh out of university tend to like building code off a UML because they can focus on getting used to tech stacks and company norms rather than be pressured to impress. There are tools that allow you to create a schema for a database from a UML.
- Testing concepts and ideas.
- Documentation (this is kind of an old idea which I don't believe really applies nowadays because code is constantly evolving, maybe I am wrong though).  

UML is huge but only class diagrams (the boxes with different compartments e.g. the soldier exercise we did on miro) are within the scope of IB.

The most important aspect of UML is to describe how many classes and objects are working together to solve a real-world problem. This is especially important for your IA. 

## Glossary

| **Term** | Meaning | Covered | Lesson |
|---|---|---|---|
| **Object-Oriented Programming (OOP)** | An approach to designing and building applications that are flexible, natural, well-crafted, and testable by focusing on objects that interact cleanly with one another. | Yes | 15 |
| **Class** | A code file which acts as the blueprint, or cookie cutter, of an object by specifying the properties (characteristics) that and methods (behaviour). | Yes | 11 |
| **Property** | A characteristic of an object defined in the class e.g. in a class called `Person` a property can be `eyeColour`. | Yes | 11 |
| **Method** | The code that defines behaviour of a class normally contains a verb like `changeWeapon()` or `respawn()`. | Yes | 11 |
| **Mutator** | Coming Soon | No | -- |
| **Accessor** | Coming Soon | No | -- |
| **Members** | The *properties* and *methods* of a class. | Yes | 11 |
| **Instance** | The variable that stores a single object in memory that retains the state during a program's lifetime. This is created using the `new` keyword e.g. `Soldier jack = new Soldier();`. In this case `jack` is an instance of `Soldier`. | Yes | 11  |
| **Overloading** | Coming Soon | No | -- |
| **Contract** | Coming Soon | No | -- |
| **Constructor** | The special method that is invoked using the `new` keyword when creating an *instance* of a *class*. Must share the same name of the class. | Yes | 13 |
| **Default Constructor** | A constructor with no parameters. If a *constructor* is not defined within a class then the default one will be invoked upon `new`. | Yes | 13 |
| **Overriding** | Coming Soon | No | -- |
| **Interface** | Coming Soon | No | -- |
| **Abstraction** | The process of defining classes by simplifying reality as much as possible. This means leaving unimportant details out and focusing on what is truly necessary. | Yes | 11 |
| **Encapsulation** | Coming Soon | No | -- |
| **Inheritance** | Coming Soon | No | -- |
| **Polymorphism** | Coming Soon | No | -- |
| **Aggregation** | Coming Soon | No | -- |
| **Association** | A relationship between two (or more) objects that normally reflects a relationship in the real world we are trying to model with OOP. | Yes | 12 |
| **Composition** | Coming Soon | No  | -- |

# This Lesson

## Student Report Example

<img src="https://raw.githubusercontent.com/erikacamilleri/secib-java-course/main/draw.io/lower15_student_report.drawio.svg"/>

### Parallel Arrays Technique 

Parallel arrays are an implicit data structure that make use of multiple arrays to represent data records whereby a record is made of multiple fields and therefore different data types. This may sound like a very simplified version of a database table. Using this technique, in order to pull out one record, then you need to combine elements of each array *at the same index*.

In order to represent the subject grades in the report we constructed two parallel arrays.

```
public String[] subjects;

public int[][] questionGrades;
```

As the image below depicts, a student learns a number of subjects, and each subject has a number of tasks or questions the student must complete. Each task is graded individually.

<img src="https://raw.githubusercontent.com/erikacamilleri/secib-java-course/main/img/parallel_arrays_technique.PNG" width="auto" height="200"/>

Having one 2D array to model the above will not work in Java because most probably we would want to use a `String` to store the subject and an `int` or some other data type to store the grade. A single array in Java can only store elements of the same data type.

So we do the following:

```
subjects = {"Math", "Science", "English"};

questionGrades = {
    {10, 10, 10},
    {20, 15, 5},
    {30, 22, 7},
};

// combining all the grades for Math
int mathTotal = questionGrades[0][0] + questionGrades[1][0] + questionGrades[2][0];
```

### Arrays vs 2D arrays vs parallel arrays vs objects

Arrays vs 2D arrays vs parallel arrays vs objects