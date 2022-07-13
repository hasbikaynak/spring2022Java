package dev_02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuessingGame {
    /*
    Number guessing game in java:
The number guessing game is based on a concept where player guesses a number between a range.
If player guesses the exact number then player wins else player looses the game.
Since this game provides limited attempts, so, player must guess the number with the limited attempts, else will lose the game.
Number guessing game Rules

1-You must enter only valid integer within the specified range.

2-You will be provided limited attempts to guess the number.

3-You cannot leave the game, once started.

If the entered number is less than or greater than the required number, then player gets the message (hint) to proceed further either in up or down range.
     */
   static int userGuess;
   static int attempts =0;
   static int breakUsed =0;
    static ThreadLocalRandom random = ThreadLocalRandom. current();
   static final int randomNumber = random. nextInt(1, 11);
   static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        bringWhileLoop();

    }

    private static void bringWhileLoop() {
        System.out.println("I selected an number between 1 to 10, guess the number(both inclusive)");

        while (true){
            userGuess = input.nextInt();

            checkIfUserGuessIsTrue();

            if (breakUsed > 0) {
                break;
            }

            checkNumberOfAttempts();

            if (breakUsed > 0) {
                break;
            }

        }
    }

    private static void checkIfUserGuessIsTrue() {

        if (userGuess == randomNumber) {
            attempts++;
            System.out.println("Great you`ve found it!!!" +
                    "\nThe attempts you`ve made : " + attempts+
                    "\nThe number was : " + randomNumber);
            breakUsed++;
        }

        else if (userGuess < randomNumber && userGuess > 0) {
            System.out.println("Your number is less than my selected number.");
            attempts++;
        }
        else if (userGuess > randomNumber && userGuess < 11) {
            System.out.println("Your number is greater than my selected number.");
            attempts++;
        }
        else {
            System.out.println("Please enter a number between 1 to 10(both inclusive)");
            attempts++;
        }
    }

    private static void checkNumberOfAttempts() {
        if (attempts >= 3){
            System.out.println("Your number of attempts has been exceeded to the final limit, You`ve lost the game!!!" +
                    "\nThe number was " + randomNumber);
            breakUsed++;
        } else if (attempts < 3) {
            System.out.println("You used your one attempt right and remained "+ (3-attempts) + " attempt rights.");
        }
    }
}
