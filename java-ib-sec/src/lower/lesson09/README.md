# Students' Choice

As a group we felt that we needed to work a bit more on arrays. We also needed to reach our target of *one past paper question a week* so we combined the two!

During this lesson we had a look at May 2021 q 14. which you can view [here](https://www.ibdocuments.com/IB%20PAST%20PAPERS%20-%20SUBJECT/Group%204%20-%20Sciences/Computer_science_HL/2021%20May%20Examination%20Session/Computer_science_paper_1__HL.pdf).

# New Stuff

We thought that it was kind of too laborious to input 1000 numbers ourselves. However, we will compensate for our laziness by learning something new.

## The java.util.Random Class

We have used the `java.util.Scanner` class numerous times, so there is no reason why we should find `java.util.Random` difficult to use. The experience is quite similar. We just need to know what it gives us in terms of functionality.

Random class is used to generate pseudo-random numbers in java. In simpler english, it is a random number generator, and the methods are actually going to seem pretty familiar:

```
import java.util.Random;

Random randomiser = new Random();
int randomNumber = randomiser.nextInt(5000); // passed in an upper limit for our number generator, randonNumber will be between 0 and 4999
```

## Questions from Bill

1. How can I get numbers between a range for example, between 5 and 10?

I did not know actually, but we quickly googled it. We <3 you stackoverflow.

```
int high = 10;
int low = 5;
int randomNumberBetweenRange = low + randomiser.nextInt((high - low));
```
Of course, after seeing the answer, it seems obvious.

2. How can I get numbers between two ranges for example, between 5 and 10 *or* 30 and 40?
Well Java gives us many tools, but not everything and something like you suggested seems specific. Sp we can reason it out like any other algorithm. 

If I want to do what you said in real life, I would flip a coin. If it is heads, I come up with a random number between 5 and 10, and if it is tails I come up with a number between 30 and 40. 

Luckily, Random() has the functionality to give us a random boolean, so we can simulate flipping a coin.

```
int randomNumber;
boolean coinFlip = randomiser.nextBoolean;

if (coinFlip) {
    int high = 10;
    int low = 5;
    randomNumber = low + randomiser.nextInt((high - low));
} else {
    int high = 40;
    int low = 30;
    randomNumber = low + randomiser.nextInt((high - low));
}
```

# Fixing the logical error

Our number generator, gave us values between 0 and 4999 however, since it is random it is never really guaranteed that our generator gives us 0. However, the flowchart had told us to initialise `lowest` to 0. 

Two ways to fix it...
1. We gave our generator an upper bound, so we can set lowest to a number that is greater than our upper bound (a really high number).
2. However, as a group we kind of preferred to set it as 0 first, and as soon as we generate the first random number, we update it, so that in the beginning the lowest number is always the first number.