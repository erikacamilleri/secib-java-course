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

## Methods that return an array of values

# Keywords
- Data structure
- Collection
- Contiguous