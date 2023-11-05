import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        
        int attempts = 0;
        int maxAttempts = 10; // You can change the maximum attempts as needed.
        int score = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between " + minRange + " and " + maxRange + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            
            attempts++;
            
            if (userGuess < minRange || userGuess > maxRange) {
                System.out.println("Your guess is out of the valid range.");
            } else if (userGuess == randomNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                score += (maxAttempts - attempts) * 10; // Assign points based on remaining attempts.
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
            
            int remainingAttempts = maxAttempts - attempts;
            if (remainingAttempts > 0) {
                System.out.println("You have " + remainingAttempts + " attempts left.");
            } else {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
            }
        }
        
        System.out.println("Your final score is: " + score);
        
        // You can add code here to ask the user if they want to play again and reset the game.
    }
}
