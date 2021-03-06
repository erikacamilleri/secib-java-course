# Your First Steps In Java

Welcome to your first lesson. This lesson is all about breaking the ice and gaining some level of comfort with the basics.

# 1.1 First Program

## Hello, world!

A program is an ordered sequence of instructions for the computer to execute. Anyone who knows anything about programming will tell you that the first program that you write a new language has always got to be a program that displays "Hello, world!" on screen; so we will stick to the tradition also, and our first program will do exactly that!

## Breaking it down

The first line (the header) looks like this:

```
public class HelloWorld
```

and it is very important to pay attention to the word **class**. This concept is very important in Java because it is an *object-oriented language*. We will get into more detail about what this means later but for now you should understand that all the source code that we write in Java must be in a `public class` and the name of the class must match the filename.

We then move on to write more code within the {}; these tell the compiler (recall from introduction) where a class begins and ends.

As our programs become larger and more complex you can imagine that our projects will contain multiple classes therefore multiple files to keep our source code neat and organised. However, *just one* of the classes must declare the `main` method which indicates the beginning of a program.

```
public static void main(String[] args)
```

Finally let us look at the most exciting bit. The single line of code that actually produces an output! The line below prints out text of our choice on to the console when we **run** our program. 

```
System.out.println("Hello, world!");
```

# 1.2 Comments

- Single line comments
- Multi-line comments

# 1.3 Simple Data Types (Link to D.1.9)

We need our programs to store and manipulate data so it becomes valuable information. We are surrounded by different kinds of data, therefore Javat allows
us to easily classify various data into different types:

- `int` is short for `Integer` and can store whole numbers e.g. 1, 2, -4
- `float` is short for floating-point and can store real numbers within a specific range e.g 0.1, 0.005, 6.7
- `double` is a real number but we use the type to store numbers of a wider range than `float` e.g. 56789321.1, 3.4, 898989898989.2221 
- `char` is short for character so it stores alphanumeric symbols e.g. 'a', '&', '*'
- `boolean` stores `true` or `false` this is the smallest unit of data that can be processed by any computer because it is binary

# 1.4 Declaration and Assignment of Variables

`int points = 45;`

# 1.5 Declaration and Assignment of Constants

`final PI  = 3.142;`

# Keep in mind

* Java is case-sensitive.
* Must declare just one main method as indicated above.
* Every statement we write in java must end with a semi-colon `;` .
* Text meant to be outputted is surrounded by double quotes `" "`.

# FAQ

**What do public and static mean?**<br/>
Those are special words in Java that mean something quite important but let us not worry about that for now. If you are programming for the very first time you have learned a lot already. As we progress we will come across them again and at that point you would be able to understand better.

**My first program is not working. What could be the problem?**<br/>
It is difficult to anticipate what problems you might have. However, when people just start out it is probably because they typed something incorrectly. Make sure to be very very careful and type out exactly what is in the code in this repository. 
<br/>
<br/>
<br/>
Want to learn more? Why not do so from [here](https://www.w3schools.com/java/default.asp)? 
