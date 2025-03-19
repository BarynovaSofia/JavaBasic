package ua.hillel.barynova.lessons.lesson_6;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

       int secretNumber = (int) (Math.random() * (30 - 10 + 1) + 10);
       Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the secret number in 3 tries!!! From 10 to 30 \n");

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Please enter your secret number: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Error!!! Enter a number between 10 and 30");
                scanner.next();
                continue;
            }

            int userNumber = scanner.nextInt();

            if (userNumber < 10 || userNumber > 30 ){
                System.out.println("The number is out of range!!! Enter a number between 10 and 30");
                continue;

            }

            if (userNumber == secretNumber) {
                System.out.println("Congratulations! You guessed the number: " + secretNumber);
            } else {
                System.out.println("Not a guess! Attempts left: " + (2 - i));
            }

            if (i == 2) {
                System.out.println("You've lost! The guessed number was: " + secretNumber);
            }

        }

        scanner.close();

    }
}
