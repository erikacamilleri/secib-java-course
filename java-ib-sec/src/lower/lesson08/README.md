# Thinking Ahead 4.1.9 - 4.1.12

In this practical exercise:
- Planned out the algorithm in a simple list of steps (we identified things we knew how to do, others we did not know)
- From the tasks we had to do, we clearly identified what was input, process and output
- Even though we knew the domain of the problem well, we did not know how to go about it, so we tried to learn from others first
- Saw first hand that there may be more than one solution to a problem.
- Pre-conditions and post-conditions.
- Things can go wrong, in programs they are known as exceptions.

# Exceptions in Java

## What is an Exception?

An event that breaks the normal flow of a program. These are errors that occur during run-time.

As our programs become more complex, we will be able to identify so many things that could go wrong. We do our best to prevent events from happening, but it is impossible to prevent them all. Our job is to handle them gracefully, so that either the program comes to a graceful stop - or event better - attempt to regain control and normal flow. 

## How to get an Exception

The programs we are writing seem stupidly simple, it might be difficult to imagine what can go wrong.Probably a good time to quote Murphy's Law: "Anything that can go wrong will go wrong." Yes, even in our simple programs things can go wrong.

- Accidently accessing an element in an array using an index that does not exist.
- Users misbehaving when providing input for our algorithms.
- Doing a division by 0.

## How to handle Exceptions in Java

There are many ways to do this in reality (we will look into these in the future). The most basic way is doing a `try...catch` block. We can probably look into that now.

```
try{
  // code for normal algorithm flow
}
catch(/* some exception event */) {
  // a bad event occured that broke the flow, what are you going to do about it?
}
```

Example in DecimalBinaryConversion:

```
try {
    double number = Double.parseDouble(numberIn);
    if (number > 0) {
        String result = decimalToBinary(number, 5);
        // output
        System.out.println("The binary representation of " + number + " is: " + result);
    } else {
        System.out.println("We told you to put in a positive number. We don't support negative numbers.");
    } 
} catch (NullPointerException e) { // catch exceptions that you can foresee
    System.out.println("You have entered nothing. Please try again.");
} catch (NumberFormatException e) {
    System.out.println("We cannot perform the conversion. Please try again.");
}
```
FYI:

`NullPointerException` occurs if the user gives us an empty input (just keys in Enter).

`NumberFormatException` occurs if the user inputs something that cannot be perceived as a number like alphanumeric characters e.g. 'please convert 1234'

# Supporting Material
(Exception Handling in Java)[https://youtu.be/ohpCMpderow]
(Programiz Course)[https://www.programiz.com/java-programming/try-catch]
(Converting a String to Double in Java)[https://www.geeksforgeeks.org/convert-string-to-double-in-java/]