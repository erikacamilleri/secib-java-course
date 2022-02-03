# Arrays as static queues

<img src="https://github.com/erikacamilleri/secib-java-course/blob/main/java-ib-sec/img/photo_queue_0302_2022.PNG?raw=true" width="auto" height="300"/>

## Basic characteristics of a queue (short version)

The queue is a FIFO abstract data structure. The elements in a queue may be of any type however in order to handle these elements it utilises the following methods:

* `enqueue()` - to add an element at the rear/tail of the queue
* `dequeue()` - remove the element at the front/head of the queue

Other methods normally implemented include:

* `peek()` - to 'look' at the element at the front of the queue (does not alter the queue)
* `isEmpty()` - to test if there are any elements at all 
* `isFull()` - to test if the queue has any empty space left for elements

For the long version re-do the [Brilliant course on queues](https://brilliant.org/practice/queues/?chapter=stacks-and-queues).

## Implementing SimpleJobQueue.java

In order to store the elements we are using an array that stores elements of type `SimpleJob`. `SimpleJob` is a very simple object class that we will define. Unlike stacks, a queue of numbers does not have practical implications in the real world. 

Just a reminder, in Java *anything* can be an object, but *usually* an object represents some entity or process in the real world. We will be implementing a `SimpleJobQueue` according to the spec described in the UML class diagram below (we designed this collaboratively in class).

<img src="https://github.com/erikacamilleri/secib-java-course/blob/main/java-ib-sec/img/job_queue_uml.PNG?raw=true" width="auto" height="300"/>

# Testing Queue Functions

```
import lower.lesson13.SimpleJob;
import lower.lesson13.SimpleJobQueue;

public class App {
    public static void main(String[] args) throws Exception {
        // Create an instance of SimpleJobQueue
        SimpleJobQueue jobQueue = new SimpleJobQueue();

        // Create instances of SimpleJob
        SimpleJob job1 = new SimpleJob(1);
        SimpleJob job2 = new SimpleJob(2);

        // Put the instances of SimpleJob in the queue using enqueue
        jobQueue.enqueue(job1);
        jobQueue.enqueue(job2);

        // Test that the queue has two elements
        System.out.println(jobQueue.isEmpty());
        System.out.println(jobQueue.count());

        // Make the queue work, ideally this is done in a separate thread but
        // let's keep things simple for now ;)
        jobQueue.work();

        // After all the hard work, the queue should be empty
        System.out.println(jobQueue.isEmpty());
        System.out.println(jobQueue.count());
    }
}
```

# Technical Discussion

## The Constructor

A constructor in Java is similar to a method that is invoked when an object of the class is created.

The purpose of this special method is to allocate memory for the instance.

Unlike Java methods, a constructor has the same name as that of the class and does not have any return type. For example,

```
public class SimpleJobQueue {
    
    // constructor
    public SimpleJobQueue() {
        // constructor body
    }

}
```

Multiple constructors are possible:
- Default
- Do not pass in parameters
- Pass in parameters

### The Default Constructor

If you don't explicity specify a constructor in the class, (like NumberStack.java and Soldier.java in previous lessons) then Java will create the default <b>empty</b> constructor for you during run-time and call it!

### No Parameters

### With Parameters

## Array of Objects