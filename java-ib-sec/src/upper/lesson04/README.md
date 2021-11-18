# Taking it to the next level

We have covered a lot of programming concepts in Java, mostly to do with very simple concepts. So how do we deal that more complex problems? What to algorithms that solve problems for real users really look like? In theory, we talked about divide and conquer, splitting our code into procedures, think in a modular way...

Let's explore new turf and really appreciate what Java has to offer. This lesson tackles some advanced OOP features and programming concepts:

- Throwing Exceptions [Programmiz Course](https://www.programiz.com/java-programming/exceptions)
- Definition of an interface and implementing them [Programmiz Course](https://www.programiz.com/java-programming/interfaces)
- Implementation of the **Observer Design Pattern** [Watch Video](https://www.youtube.com/watch?v=98DiwRp-KZk)
- Implementation of the **Singleton Design Pattern** [Watch Video](https://www.youtube.com/watch?v=KUTqnWswPV4)
- Generics
- Email with a test mail server (using third party dependencies)
- Loading environment variables from a text file

Hopefully by exploring all of the above you get a sneak peek of what your future in coding could look like.

# Algorithm for Logging Errors

When an Exception is Thrown
Display Warning to Client
IF Exception.Level >= 2 Log to File
IF Exception.Level = 3 Email the developer

# Dependencies

| Jar File           | Version                                     |
| ------------------ | ------------------------------------------- |
| activation.jar     | No information available at this time       |
| javax.mail.jar     | No information available at this time       |

# Frequently Asked Questions

## What is a design pattern?

In software engineering, a design pattern is a general repeatable solution to a commonly occurring problem in software design. A design pattern isn't a finished design that can be transformed directly into code. It is a description or template for how to solve a problem that can be used in many different situations. Developers heavily rely on design patterns to build/use development frameworks e.g. Hibernate, Spring.

## Why use design patterns?

They are not for everyone, I have worked with great developers that say they over complicate matters and take out the creativity of programming. Personally, I tend to like applying design patterns because I feel it gives my code a good structure, and I believe it is a good point of communication from developer to developer. The <b>Observer Design Pattern</b> is probably a good idea if you want to build any of the following:

* Any user interface: You would want to listen for user actions and separate the responsibility between the logic of your program and the feedback to the user.
* Tracking changes in the data to build an audit trail for a particular object.
* Tracking a state machine for example, online orders tend to be like this (cart, in progress, paid, delivered)

## I don't understand most of this does it mean I am bad at programming?

No, of course not! It just means you need to read and practice more. The real question is, do you like the process enough to do so. If you do, don't give up.