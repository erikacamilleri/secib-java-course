# Arrays as static stacks

## Basic characteristics of a stack (short version)

The stack is a LIFO abstract data structure. The elements in a stack may be of any type however in order to handle these elements it utilises the following methods:

* `push()` - to add an element at the top of the stack
* `pop()` - remove and give back the element at the top of the stack

Other methods normally implemented include:

* `peek()` - to 'look' at the element at the top of the stack (does not alter the stack)
* `isEmpty()` - to test if there are any elements at all 

For the long version re-do the [Brilliant course on stacks](https://brilliant.org/practice/stacks-2/?chapter=stacks-and-queues).

## Implementing NumberStack.java

In order to store the elements we are using an array that stores elements of type `Integer`. 
Now that you have started learning about objects, you should probably know that in Java anything can be an object and Java has an object wrapper for all primitive data types.

<img src="https://github.com/erikacamilleri/secib-java-course/blob/main/java-ib-sec/img/number_stack_uml.PNG?raw=true" width="auto" height="300"/>

## Trace algorithms that use stacks

Back when we studied recursion we looked at the Towers of Hanoi algorithm. We can refresh our memory [here](https://www.mathsisfun.com/games/towerofhanoi.html). You will probably immediately appreciate how natural it is to look at each rod as a stack. Try to play the game yourself and notice the push and pop mechanism.

However, I feel the rules of the game make tracing this algorithm really daunting with little benefit (remember last time?). There is code for this in the book...

We will be tracing/implementing [Postfix Evaluation](https://www.geeksforgeeks.org/stack-set-4-evaluation-postfix-expression/), which I believe is easier to understand and much more fun to trace. 

# Object-oriented Design

Object-oriented design helps us acheive <b>seperation of concerns</b>, so rather than have one class that does everything, we should logically organise related functionality in separate classes. 

For example: a class for the number stack; a class for the logic of evaluating postfix notation and finally have a class for the `main()`.

<img src="https://raw.githubusercontent.com/erikacamilleri/secib-java-course/main/java-ib-sec/img/postfix_evaluation_uml.PNG" width="auto"/>