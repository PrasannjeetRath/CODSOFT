import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1; // Set your lower bound
        int upperBound = 100; // Set your upper bound
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 10; // Set the maximum number of attempts
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");
        
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int userGuess = scanner.nextInt();
            
            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a valid number between " + lowerBound + " and " + upperBound + ".");
                continue;
            }
            
            if (userGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly in " + attempt + " attempts.");
                break;
            }
            
            if (attempt == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess + ".");
            }
        }
        
        scanner.close();
    }
}
