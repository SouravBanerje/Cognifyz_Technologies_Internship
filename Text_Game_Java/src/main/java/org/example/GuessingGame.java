package org.example;

import java.util.Scanner;

public class GuessingGame {

    public static  void GuessingGames(Scanner sc){
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess what it is?");

        while (!hasWon) {
            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                hasWon = true;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Game Over. Thanks for playing!");
        sc.close();
    }
}
