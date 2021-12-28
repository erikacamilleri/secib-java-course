package lower.lesson09;

import java.util.Random;

public class MoreFunWithArrays {
    
    /**
     * This is an adaptation of the flow chart in May 2021 q 14.
     */
    public static void highestAndLowestNumber() {
        
        int highest = 0;
        
        int lowest = 0;
        
        // Make sure to allocate enough memory to store your data collection
        int[] numbers = new int[1000];

        for(int counter = 0; counter < numbers.length; counter ++) {
            // Using a java utility called Random, gives us a lot of features
            Random randomiser = new Random();
            int nextRandomNumber = randomiser.nextInt(5000); // in order to get a random number between x and y do randomiser.nextInt(y - x) + x
            numbers[counter] = nextRandomNumber;

            // if first random number, set the lowest value immediately
            if (counter == 0) {
                lowest = numbers[counter];
            }

            // if the random number just put in the array is larger than the highest recorded, update
            if (numbers[counter] > highest) {
                highest = numbers[counter];
            }
            
            // if the random number just put in the array is larger than the highest recorded, update
            if (numbers[counter] < lowest) {
                lowest = numbers[counter];
            }
        }

        // print out all the random numbers (using the special for loop)
        for (int n : numbers) {
            System.out.print(n + ", ");
        }

        System.out.println();
        System.out.println("Highest: " + highest + " Lowest: " + lowest);
    }
}
