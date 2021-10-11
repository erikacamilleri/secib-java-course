package lower.lesson02;

public class BasicArithmetic {
    public static void lesson() {
        // Declaring a constant for turbo boost during game play
        final int TURBO_BOOST = 2;
        
        // Assign variable to store number of players
        int numberOfPlayers = 3;

        // Assigning variables to store points collected
        int pointsForApples = 100;
        int pointsForBananas = 50;

        // Assigning variables to store the number of lives
        int livesAvailable = 3;

        // Addition (Basic Plus +)
        // Added brackets to awards more points
        // Multiplication (Basic Times *)
        int totalPoints = (TURBO_BOOST * pointsForApples) + pointsForBananas;

        // Subtraction (Basic Minus -)
        // Remove one life for the player
        livesAvailable = livesAvailable - 1; // livesAvailable -= 1;

        // Division (Basic Division /)
        int totalPointsEachPlayer = totalPoints / numberOfPlayers;

        // Modulus (Basic Remainder %)
        int remainder = totalPoints % numberOfPlayers;
        
        // Recall of displaying output and using + for concatinating text
        System.out.println("Total Points: " + totalPoints); // 250
        System.out.println("Lives Available: " + livesAvailable); // 2
        System.out.println("Cooperative Mode On Points Each Player: " + totalPointsEachPlayer); // 83
        System.out.println("Just checking if points are easily divisible: " + remainder); // 1
    }
}
