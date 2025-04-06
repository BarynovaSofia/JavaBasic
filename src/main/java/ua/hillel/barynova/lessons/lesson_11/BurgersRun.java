package ua.hillel.barynova.lessons.lesson_11;

import java.util.Scanner;

public class BurgersRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the burger number: ");
        System.out.println("1. Regular burger");
        System.out.println("2. Diet burger");
        System.out.println("3. Double meat burger");
        System.out.print("Enter number (1-3): ");

        int number = scanner.nextInt();

        System.out.println("\nYour burger ingredients:");

        if (number == 1){
            Burgers usualBurger = new Burgers();
        } else if (number == 2){
            Burgers dietBurger = new Burgers(true);
        } else if (number == 3){
            Burgers doubleMeatBurger = new Burgers("double");
        } else {
            System.out.println("Invalid burger number!!!!");
        }

        scanner.close();

//        Burgers usualBurger = new Burgers();
//        Burgers dietBurger = new Burgers(true);
//        Burgers doubleMeatBurger = new Burgers("double");

    }

}
