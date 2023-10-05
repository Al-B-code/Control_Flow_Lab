import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        //Hardcoded secret number
        int secretNumber = 7;

        // Creates a reader scanner object.
        Scanner reader = new Scanner(System.in);

        // Prompts user for a guess.
        System.out.print("Guess a number: ");

        // Takes in user guess.
        int guess = reader.nextInt();

        // Check if user guess is correct/exact
        if (guess == secretNumber){
            System.out.println("Correct!");
        }
        // check if guess is too low
        else if (guess < secretNumber){
            System.out.println("Too low!");
        }
        // check if guess is too high
        else if (guess > secretNumber){
            System.out.print("Too high!");
        }





    }
}
