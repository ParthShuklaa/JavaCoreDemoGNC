/*
Below is a simple Java program for a guessing game where the user tries to guess a randomly generated number between 1 and 100. The program provides feedback on whether the user's guess is too high, too low, or correct, and keeps track of the number of attempts made.
Steps to write the above code:
Step 1: Import the Scanner class from the java.util package to read input from the user and the Random class to generate a random number.
Step 2: Create a class named "GuessingGame" and define the main method.
Step 3: Create a Scanner object to read input from the user and a Random object to generate a random number.
Step 4: Generate a random number between 1 and 100 and store it in a variable named "numberToGuess".
Step 5: Initialize variables to keep track of the number of tries, the user's guess, and a boolean variable to indicate whether the user has won.
Step 6: Print a welcome message and instructions for the game.
Step 7: Use a while loop that continues until the user wins. Inside the loop, prompt the user to enter their guess and read the input.
Step 8: Use if-else statements to compare the user's guess with the number to guess
- If the guess is correct, set the win variable to true.
- If the guess is too low, print a message indicating that the user should guess higher.
- If the guess is too high, print a message indicating that the user should guess lower.
Step 9: After the loop, print a congratulatory message along with the number of tries it took for the user to guess the correct number. 


*/
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // 1. Setup
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int numberToGuess = rand.nextInt(100) + 1; // Random number 1-100
        int numberOfTries = 0;
        int guess = 0;
        boolean win = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100...");

        // 2. Game Loop
        while (!win) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            numberOfTries++;

            // 3. Conditional Logic
            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Higher! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Lower! Try again.");
            }
        }

        // 4. Result
        System.out.println("Congratulations! You found it in " + numberOfTries + " tries.");
        sc.close();
    }
}