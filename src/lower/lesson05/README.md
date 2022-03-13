# Making Decisions in Java

In the beginning of Topic 4 (IB) we have learnt that we write programs to express algorithms which in turn solve our problems. We have seen that algorithms can be expressed using a flow chart where each symbol should easily translate into some programming construct. So far we have just written instructions in a particular order (input, process, output) but in a flow chart we can make **decisions** so that an algorithm can take one shape or another shape depending on what we are doing... e.g. if we are assembling a burger perhaps we can *decide whether or not to include the current ingredient* in the assembly in order to cater for allergies. 

- A program that can make choices can behave slightly differently each time it is run depending on the input.
- A program that just executes instructions in sequence will behave the same way each time no matter the input.

## Remember the diamond in the flow chart

We have seen how algorithms can be expressed as flowcharts. Each symbol in a flowchart must translate to some construct in a programming language.
The *diamond* can represent some decision that is being made and in Java we can code decision making in a few ways:

- an `if` statement
- an `if ... else` statement
- a `switch` statement  

## The IF statement

```
if (/* boolean logic goes here (hello again topic 2) */) {
    // instruction(s) that only get invoked when true
}
```

## The IF ... ELSE statement

```
if (/* boolean logic goes here (hello again topic 2) */) {
    // instruction(s) that only get invoked when true
} else {
    // instruction(s) that only get invoked when false
}
```

## The SWITCH statement

*Coming Soon*

## Arithmetic Comparison and Boolean Logic

We normally want the program to make decisions based on a combination of:

<ins>Arithmetic Comparison</ins>

- Equality `==`
- Less Than `<`
- Greater Than `>`
- Greater Than or Equal To `>=`
- Less Than or Equal To `<=`

<ins>Boolean Logic</ins>

- AND `&&`
- OR `||`
- NOT `!`

# Introduction to Procedures or Methods in Java

We have already started defining and calling methods to be quite frank with you, you just did not know it (sorry).

 - In the very first lesson we have met with the special `main()` - the entry point of a program. 
 - Each time we create a new class to do something new we also declare our `lesson()`. 

Just up till now we were creating methods that act like neat drawers to store our code, so that we can "open" them and "close" them whenever we deem it is necessary. Let me refresh your memory.

## Declaring and Defining our Lesson Method

```
public static void lesson() {
    // code written during the lesson
}
```
<b>Looking into the Anatomy</b>

- Header: the first four words followed by parenthesis
- Body: the two curly brackets and its contents

## Using the Method

This is also known as a *method call*. This is a recall of what we normally do in our lessons. 
The lesson code is neatly stowed in its own class and whenever we want to run it, we simply call it in our `App` class.

```
public class App {
    public static void main(String[] args) {
        // This is a method call
        FirstLesson.lesson()
    }
}
```
## Methods Check List

As we create some methods I will be showing you a few things that we can do:

- Method names that make sense and proper convention
- Method without parameters e.g. ``displayBurgerIngredients``
- Method with parameters e.g. ``multiply``
- Method that does not give back a value, we say it is *void* e.g. ``displayBurgerIngredients``
- Method that does give back a value, we say it *returns* something e.g. ``isRaining``
- Method overloading, how Java can allow multiple methods with the same name e.g. ``multiply``

# Treating Programming Like Lego

You are probably thinking that so far programming seems over simplified - yes you are right.
Building complex solutions is probably the most challenging part of programming. 
People start out just looking into the individual blocks of programming without really seeing the big picture. 
Doing that is like playing with only two lego blocks at a time and stopping there. It gets boring and pointless very quickly.

From now on, we are going to treat programming like lego so that you will realise that you can do very powerful things much like the amazing things we see people do with colourful lego blocks.

<img src="https://www.mcall.com/resizer/QHj14zlBsb5htPiusxUBKKVWmU0=/1200x0/top/arc-anglerfish-arc2-prod-tronc.s3.amazonaws.com/public/FNSKMUUPBRE6NMEFOFRNFGP3PI.jpg" width="auto" height="300"/>

We finally have enough to just get started. Yes we will meet cool new blocks along the way. Just from now on we will always be solving *real* problems. Buckle up and get your math on because you are in for a ride!

## CCS 4.1.6 - 4.1.8 Thinking Procedurally (Pages 183 - 184)

- The Divide and Conquer approach is generally good to tackle complex problems.
- One big problem can be split into multiple smaller problems.
- A procedure can be part of an algorithm and can express an algorithm in its own right.

## ACS 5.1.1 - 5.1.3 Thinking Recursively (Pages 1 - 6)

- A procedure can call itself.
- By combining decision making and procedures we can have recursion.