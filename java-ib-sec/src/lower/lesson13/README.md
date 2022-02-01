# Arrays as static queues

## Basic characteristics of a queue (short version)

The stack is a LIFO abstract data structure. The elements in a stack may be of any type however in order to handle these elements it utilises the following methods:

* `push()` - to add an element at the top of the stack
* `pop()` - remove and give back the element at the top of the stack

Other methods normally implemented include:

* `peek()` - to 'look' at the element at the top of the stack (does not alter the stack)
* `isEmpty()` - to test if there are any elements at all 

For the long version re-do the [Brilliant course on queues](https://brilliant.org/practice/queues/?chapter=stacks-and-queues).

## Implementing SimpleJobQueue.java

In order to store the elements we are using an array that stores elements of type `Job`. 
In Java anything can be an object, but usually an object represents some entity or process in the real world.

<img src="https://github.com/erikacamilleri/secib-java-course/blob/main/java-ib-sec/img/number_stack_uml.PNG?raw=true" width="auto" height="300"/>

# Technical Discussion

## The Constructor

## Array of Objects