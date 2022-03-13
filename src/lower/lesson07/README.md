# Getting started with Data Structures

A data structure is a way of organizing data of a similar nature so that our algorithms can be flexible and efficient.

# The Array

An array is a contiguous block of memory, of a pre-determined size, that can store a *collection* of data of the *same* data type.

![](https://qph.fs.quoracdn.net/main-qimg-6dcb98b78005a9af064fc4f0e8fbc19e)

Every piece of data in an array is often referred to as an *element*.

## Declaration and initialisation

Declaring an array in Java is not much different to declaring a single variable, there is just one slight difference to indicate that there will be "many" of the stated type.

Recall declaring a single integer:
`int point;`

Declaring an array of integers to store multiple points:
`int[] points;`

You can declare an array to store data of any single type in Java:
`double[] temperatures;`

`char[] letters;`

`String[] tweets;`

In order to initialise our array (store actual values) we first need to *allocate* memory. We must commit and reserve a definite size of contiguous memory, and we can do that by stating how many variables we intend to store. 

Arrays in Java are *complex* types, and as we have seen in previous lessons, we initialise complex types using the `new` keyword.

`points = int[10]; // intend to store 10 numbers representing points`

Similarly...

`temperatures = double[15]; // intend to store 15 decimal numbers`

## Accessing and updating elements

How do we get a specific value? Every element in an array is labelled with a unique index indicating its position in the array. The index is a number, and the first position is always indexed at 0.

So to access the first element in an array...
`int firstPoint = points[0];`

Naturally we can get the second element by...
`int secondPoint = points[1];`

To get the last point:
`int lastPoint = points[9];`

The last index is always going to be the size minus one.

Using the same logic we can update specific array locations with values:

```
points[0] = 9;
points[1] = 4;

// We can even do this
int awardedByMalta = 12;
points[0] = awardedByMalta; // assigning a value through a variable

// We can also do this...
points[4] = 2 * awardedByMalta; // assigning an expression

// This is ok also...
Scanner sc = new Scanner(System.in);

points[1] = sc.nextInt(); // storing user input in an array location

sc.close();
```
Basically, you can treat a single array element as you would any other variable!

```
if (points[0] > points[1]) {
    int temp = points[0];
    // swap positions
    points[0] = points[1];
    points[1] = temp;
}
```

What happens when you try and do something like `points[50] = 2;`? You get an error which we usually refer to as an *Exception* (more details next lesson).

Try it out for yourself and see if you get an `ArrayIndexOutOfBoundsException`. 

## Array <3 For Loops

We have recently done loops in Java, and there is one kind of loop in particular that is really useful with arrays. Since arrays are of a *fixed size* then they are are naturally pairing with `for` loops.

```
for (int i = 0; i < 10; i++) { // i will go up in steps of 1 from 0 to 9
    System.out.println(points[i]);
}
```
It is important that you start iterating/counting (we tend to use *i* because it means iteration, go figure) from 0.

### Tips and Tricks

Instead of remembering the size of the array... you can use `.length` on any array variable e.g.:

```
points.length; // gives you 10
temperatures.length; // gives you 15
```

If you do not really care about the position of the elements then you can use a special for loop provided by Java just to get each and every element in an array.

```
// for each element which we named p in points
for (int p : points) {
    System.out.println(p);
}
```

The above will come in very handy in the future. I promise.

## Methods that accept an array of values

Remember when I said that you need to treat programming like playing with lego? Even though we did not cover this aspect in this lesson, I should point out that just like you can declare methods that accept simple parameters, methods can also accept array parameters!

```
// method accepting simple parameter 
public static void doublePoints(int points) {
    System.out.println(points * 2);
}

// method accepting array parameter (you should assume that the array passed in is filled in)
public static void doublePoints(int[] points) {
    for (int i = 0; i < points.length; i++) {
        System.out.println(points[i] * 2);
    }
}
```

## Methods that return an array of values

Much like a method can return a value, a method can return (give as feedback) more complex types such as the array. 

As an example, let us enhance the doublePoints, so that it actually gives back the points doubled in value, rather than output them in the console. Like this, methods are so much more useful and reusable.

```
// method returning a single value
public static void doublePoints(int points) {
    return points * 2; // the 
}

// method returning an array (collection) of values
public static void doublePoints(int[] points) {
    for (int i = 0; i < points.length; i++) {
        points[i] = points[i] * 2; // tip: points[i] *= 2; is a shorter way of doubling the particular element
    }
    return points; // giving back the array of points
}
```

## Remember

Worth revising how to call a method, and a reminder to pass in values that are going to be copied over to the method parameters. We are taking `doublePoints()` as an example:

```
int[] points = {1, 5, 7};
int[] doublePoints = doublePoints(points); // making the method call and passing in points, it will give back an array

// the result
for(int dp : doublePoints) {
    System.out.println(dp);
}
```

Expected output:

```
2
10
14
```

## Appreciating the power of methods (or sub procedures)

If someone had to ask me to draw a computer in ten seconds... this is what I would draw:

![Input, Process, Output, Feedback](https://image.shutterstock.com/image-illustration/input-process-output-feedback-diagram-260nw-1982606642.jpg)

*Link: We will be covering the above in more detail in Topic 7.*

Everything that is related to computers obeys this model, therefore if we want to exercise computational thinking then we always have to keep the above in mind when: 

1. Designing algorithms for computers; 
2. Learning a programming language.

An entire program obviously takes the form of: input, process, output.

But think about it, a method also can take the form of: input, process, output.

```
public static void multiply(int a, int b) {
    return a * b; // feedback
}

// usage
Scanner sc = new Scanner(System.in);
int a = sc.nextInt(); // user input
int b = sc.nextInt(); // user input

// do process
// multiply takes two numbers as inputs... returns a * b
int result = multiply(a, b) // the result is feedback

// We can either take in the feedback and do something with it (continue processing)
if (result > 10) {
    /* do something if result is greater than 10 */
}

// Or just spit it out as output to the user
System.out.println("Result: " + result);
```

The modular nature of computers and programming makes it better for engineers to:
1. Solve complex problems by practicing divide and conquer.
2. Collaborate with other developers, each developer can work on different procedures.
3. Re-use other people's code by making use of software libraries.
   
# 4.1.17 Thinking Abstractly

The array provides developers with an abstraction of the organisation of our memory. As programmers, we do not care about the registers, physical/logical memory addresses. All we care about is that we have room in computer memory to store data can can be processed by the algorithm we write.

# Keywords
- Data structure
- Collection
- Contiguous

*More information about arrays in !(assignment1)[https://github.com/erikacamilleri/secib-java-course/tree/main/java-ib-sec/src/lower/assignment1]*