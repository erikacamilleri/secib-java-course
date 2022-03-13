# Iteration in Java

Allows us to instruct the computer to carry out a task over, and over again by repeating a small body (encapsulated in {}) of code. The programming structure that is used to control this repetition is often called a loop.

We will be looking at the most common two in Java:

## For Loop

Let's say that we want to write a simple program that needs to display a square (five by five).

                                    * * * * *
                                    * * * * *
                                    * * * * *
                                    * * * * *
                                    * * * * *

In the beginning one would probably code:

```
System.out.println("* * * * *");
System.out.println("* * * * *");
System.out.println("* * * * *");
System.out.println("* * * * *");
System.out.println("* * * * *");
```

And this is valid, but if we had to repeat the same code every time we wanted repetition our code would get big very quickly. Also something like the above does not give us flexibility, what if we do not know the width of the square and it should be based on user input?

We have so much more control using the `for loop`. This is how it works:
1. A loop counter is initialised to a value
2. There is a test condition for the counter, while this test returns a true then it loops; as soon as it tests false the loop breaks.
3. After each repetition the value of the counter must change (not doing so will result in an infinite loop -- not fun).

```
for (/* start counter */; /* test counter */; /* change counter; */) {
    // instruction(s) to be repeated go here
}
```

Examples:
```
for (int i = 1; i <= 5; i = i + 1) {
    System.out.println("* * * * *");
}
// i = i + 1 can be shortened to i++
```

Example in MathPal:

```
public static void counting(int startFrom, int upTo, int step) {
    for(int i = startFrom; i <= upTo; i += step) {
        System.out.println(i + "   " + printStar(i, ""));
    }
}
// printStar is a recursive sub-procedure :') <3 (don't you just love it when things come together?)
```

So, wait a minute... if we don't know the width of the box... we need two loops to form a square, one for the width, and one for the height. Right? 

Yup!

Remember when I said we need to treat programming like lego? We can have a loop in a loop! [Loopception](https://www.youtube.com/watch?v=97THN8_Vdvs).

```
for(int i = 1; i <= height; i++) {
    for(int j = 1; j <= width; j++) {
        System.out.print("*");
    }
}
```

## While Loop

Sometimes, repetition which is not fixed is required. In such cases a for loop is not very useful. However, the `while` loop offers non-fixed iteration.

```
while(/* test goes here */) {
    for(int j = 1; j <= width; j++) {
        // instruction (s) to be repeated go here
    }
}
```

Example in MathPal:

```
char again = 'y';
Scanner sc = new Scanner(System.in);
while(again != 'n') { 
    // more code here
    System.out.println("Would you like to go again? Type y for yes and n for no.");
    again = sc.next().charAt(0);                      
}
sc.close();  
```

# A cleaner way to make decisions

In the previous lesson we looked at how our algorithms can take shape or form depending on some action. In MathPal we definitely see this sort of thing again. Based on what the user chooses, the algorithm is going to do different actions. We have learnt how to do the IF...ELSE statement, but if it gets too repetitive there is a better way.

## The Switch Statement

In Java there is the switch statement which is meant to avoid too many IF statements that test the same condition. This works very well with three or more values, for example, checking the user option of a menu!

```
switch(/* a variable to check */) {
    case valueOne : {
        // instruction(s) that only get invoked when variable has valueOne
        break; // use break to get out of the switch when there is a match
    }
    case valueTwo : {
        // instruction(s) that only get invoked when variable has valueTwo
        break;
    }
    case valueThree : {
        // instruction(s) that only get invoked when variable has valueThree
        break;
    }
    default : {
        // instruction(s) that only get invoked when variable has none of values
    }
}
```

# Logical Rules for Real-World

To design digital solutions to real world problems we need to understand

