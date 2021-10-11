# 1.6 Arithmetic operators

It is very common to need to perform some kind of arithmetic. Java has 4 familiar arithmetic operators plus a remainder operator. Refer to the table below:

| Operation      | Java Operator |
| -------------- | ------------- |
| Addition       | +             |
| Subtraction    | -             |
| Multiplication | *             |
| Division       | /             |
| Remainder      | %             |

## Usage

```
int x;
x = 10 + 25;
```
It is always a good idea to group terms using parenthesis when expressions have multiple operators. Precendence as follows: brackets, division, multiplication, addition and subtraction (BODMAS).  

```
double cost;
cost = 500 * (1 + 17.5/100);
```

## The remainder operator or modulus

Returns remainder after integer division. Some examples:

| Expression     | Result        |
| -------------- | ------------- |
| 29 % 9         | 2             |
| 6 % 8          | 6             |
| 40 % 40        | 0             |
| 10 % 2         | 0             |

## The division of two integers returns an integer even if result not accurate

As discovered in class, `int totalPointsEachPlayer = totalPoints / numberOfPlayers;` which equated to 250/3 yielded a whole number, 83 as oppose to 83.3333. This in Java is by design. Rather than having two separate operators for division, Java uses one and at times it returns an integer or else a real number depending on the context. In this case the division operator is said to be **overloaded**. We will learn more about this in the future, but basically it means that there is more than one behaviour tied to the same element. You might think it is confusing now, but don't worry later on you will find out that this is a good thing.

So, how will you know which behaviour will kick in? Simple, if in the expression at least one variable or value is a *real number* then the Java will assume we mean the division we are used to. 
