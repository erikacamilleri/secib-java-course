# Two Dimensional Array

By now you should have learnt that arrays are really convenient to group data of a similar nature.
We have also seen that arrays can store anything. In fact, each element in an array can store another array, thus making it a 2D array! The best way to visualise this is a grid like the image shows below. 

<img src="https://www.cs.ubc.ca/~pcarter/cs189/image/2darrayrc.png"/>

Each element labelled as "rows" is storing an array of three elements:

<pre>
rows[0] ==> {1, 2, 3}

rows[1] ==> {4, 5, 6}
</pre>

Why is this useful? 

We handle a lot of data that tends to be represented in a tabular format. Some examples:

- Timetable
- Tic Tac Toe
- Checker Board

If you remember how to declare a normal array in java, then declaring a 2D array is just as simple:

```
// declare and initialise normal array
int[] numbers = new int[4]; // 4 slots

// declare and initialise 2d array
int[][] numberGrid = new int[4][4] // 16 slots, 4 rows and 4 columns
```

## Looping and Accessing Elements in a 2D Array

Looping through 2D arrays is very common. Recall the use of a for loop to traverse a 1D array:

```
for(int i = 0; i < numbers.length; i++>) {
    System.out.println("The " + i + "th element is " + numbers[i]);
}
```

For looping through multiple dimensions we used nested for loops. Nested loops are just loops within loops. Each iteration of the outer loops triggers the iterations of the inner loop.

```
for(int row = 0; row < 4; row++) { // outer loop
    for(int col = 0; col < 4; col++) { // inner loop
        System.out.println("The " + ((4*row) + col) + "th element is " + numberGrid[row][col]);
    }
}
```
## Task - Linear Search (Again)

In `ArrayHelper.java` construct a new `find` method that will perform a linear search in a 2D array. 

You should assume that this method will accept 2 parameters: 

1. `int[][] grid`
2. `int target`

If the target is found then `find` should return an instance of `SimpleEntry<Integer, Integer>`. This is an object provided by Java that conveniently stores 2 values. To create an instance of the class above you need to import `java.util.AbstractMap` at the very top of the class and use the code below:

```
SimpleEntry<Integer, Integer> gridIndex = new AbstractMap.SimpleEntry<>(row, col);
```

If the target is not found simple return `null`.

Good luck!

# Method Overloading

The term *overloading* refers to the ability to use the same programming symbols for multiple things. You
already encounter this when you use the `+` operator. As you know, the plus + is not used for addition but also for concatenating two strings. This means that the same symbol can operate differently depending on what it is operating on.

Method overloading is a Java feature that allows you to use the same name for multiple methods as long as the parameters are somehow different.

In the task we just did, we probably wanted to keep the name `find` so now you should have two methods called as such.

```
public static int find(int[] arr, int target) {
    // ...
}

public static SimpleEntry<Integer, Integer> find(int[][] grid, int target) {
    // ...
}
```
Therefore, the symbol `find` can be used in *two* ways and the behaviour selected depends on what is passed into the method.