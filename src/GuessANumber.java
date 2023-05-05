import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // generate a random number between 1 and 100

        int guess;
        int numGuesses = 0; // keep track of the number of guesses

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            numGuesses++;

            if (guess < randomNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high. Try again.");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
    }
}
