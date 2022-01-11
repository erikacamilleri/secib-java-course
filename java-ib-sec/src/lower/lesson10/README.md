# Analysing the structure of our programs (so far)

Before deep-diving into Object-Oriented Programming we are going to have a last look at how we have shaped our programs so far. In the beginning, programming is very much about exploring *what*, today will be one of the few times we talk about *why* the programs look a certain way.

## Blocks of code

Programming is a discipline that requires the organization of thought (hence the general principles which need to be applied). A program is a product of our organised thoughts. When we organise our thoughts we categorise, group, remove distractions etc...

In Java, our organised thinking translates to *blocks of code*, a block is a grouping of two or more statements. The visual cue for the groupings are the curly brackets `{}` where each pair defines a logical grouping.

In Visual Studio Code, each block can be opened or closed kind of how you would treat a chest of drawers so that you can abstract out unncessary details if you want to focus on something in particular.

Our most complex program to date is probably `MathPal.java`, so I made a short screen recording on how blocks can be treated in Visual Studio Code. [Watch coding blocks in VsCode](https://screenrec.com/share/nVeS4zsXyw).

In certain IDEs geared for beginners, like Blue J, code blocks are visually represented using colours:

<img src="https://github.com/erikacamilleri/secib-java-course/blob/main/java-ib-sec/img/java_blocks_of_code_bluej.PNG?raw=true" width="auto" height="300"/>

You should note the following:

- Every block of code in Java starts with a open curly brace `{` and ends with close curly brace `}`.
- There is no restriction on the number of blocks inside a block and the level of nesting the blocks. i.e. Blocks can be nested and can be included inside other blocks.
- Block of code in Java is commonly used in if, for and while statements.
- All class and method contents are also blocks e.g., the class content or the main method in the examples are blocks.
- It is advised to indent i.e. put tabs or spaces so that the inside blocks are one tab more than the containing block. Indenting the blocks will help in resolving the compilation errors faster and the programs will be *easy to read*.

## Variable scope

Each block you create in your code defines a *scope*. A scope determines the accessibility or lifetime of a particular variable. Many times we want to create a variable, and then just throw it away when we do not need it (like the iteration variable we normally name `i` in a for loop).

Different programming languages tackle variable scopes differently, and this really depends on the paradigm of the programming language you are using. For instance, in functional or procedural style programming (like Haskell, or vanilla python) variables can either be *local* (lives for a short while) or *global* (is alive and accessible at any point in the program).   

Java, on the other hand is an Object-Oriented language, and scopes are defined in various ways. The most basic ways can be explained: a variable can either livs within a method, or specific construct (this is like local), or lives within some object and albeit not really global (Java is not a fan of this sort of thing) is accessible in other parts of the program through the object.

So far we have always treated variables like they are going to be very short-lived, partially because our programs so far have been very small.

```
public class VariableScopeDemo {
    public static void lesson() {
        String myName = "Ms Camilleri"; // only lives within lesson() block
    }
}
```

But now, I can introduce you to variables that are meant to "live longer" as we are now naturally progressing into Object-Oriented Programming.

```
// VariableScopeDemo.java
public class VariableScopeDemo {
    public static int count = 10;
    /** more code blocks here */
}

// VariableScopeMain.java
public class VariableScopeMain.java {
    System.out.println(VariableScopeDemo.count);
}
```

I was really inspired by how BlueJ gives a visual representation of variable scope, so for each line of output I assigned a different colour based on the scope. When you run the program you should see...

<img src="https://github.com/erikacamilleri/secib-java-course/blob/main/java-ib-sec/img/java_blocks_of_code_bluej.PNG?raw=true" width="auto" height="300"/>

## How we programmed so far...

- So far, for one program, we generally used one or two classes at most. When we created two classes, one of them always had the main method.
- We always declared and assigned variables within small short-lived scopes.
- We used method blocks to organise our code, to keep the main() minimal and clean.

Why bother saying these things? You guessed it, it will slowly turn into something different and much more complex. You can take a sneak peak at the code in the `upper` folder.

# Exercise

The following is pseudocode of an algorithm taken from CCS page 223:

> MAX = 10 <br/>
> SUM = 0 <br/>
> COUNT = 0 <br/>
> loop COUNT from 0 to MAX - 6 <br/>
> &nbsp;&nbsp;&nbsp;if COUNT = 0 and MAX > 0 then <br/>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; output "Hello" <br/>
> &nbsp;&nbsp;&nbsp;else if COUNT > 2 then <br/>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;output "Go for it" <br/>
> &nbsp;&nbsp;&nbsp;else <br/>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;output "OK" <br/>
> &nbsp;&nbsp;&nbsp;end if <br/>
> end loop <br/>
> SUM = SUM + COUNT <br/>
> output "Total = " SUM <br/>

Include the above algorithm in VariableScopeDemo (use any approach you like) and answer the following:

1. What is a scope? Define the scope of the COUNT variable in your program.
2. Where in a block can variables be declared? In which block did you declare the MAX and SUM variables?
3. In your approach, when is your SUM variable destoryed?
4. Are you able to run the algorithm twice in a single program instance? If so, is the SUM result the same or different? Making reference to scope, explain your results.

# Critical skills

I am going to do my best to keep things as simple and progress as logically as possible, but this is not easy. From now, complexity will snowball. Please, before you move on make sure you know...

- Create and run a simple Java program with only the `main()`
- Declare, initialise and use variables (primitive data types)
- Comments
- Use branching statements like `if` and `switch`
- Use repetition constructs like `for`, `while`
- Userstand how statements are ordered, indented and terminated
- Separate keywords from non-keywords, basic rules for Java identifiers
- Difference between Java primitive types (`int`, `float`) and complex types (`String`, `Scanner`, `int[]`)
- Basic input and output
- Variable assignment, arithmetic and logic
- Simple arrays and using `for` loops to access elements
- Accessing and updating array elements
- Simple methods

## Did we cover all the basics?

Sadly, no. If we focus on *perfect coverage* you will end up getting too much practice on the basics and complex stuff gets rushed. However, it is impossibe to really and truly learn everything. We should have done enough that you can fill in small gaps independently. A few examples:

- Nested if statements
- String literals like '\n' for new line
- Assignment operators like +=, -=
- Bitwise operations (hello again Topic 2)
