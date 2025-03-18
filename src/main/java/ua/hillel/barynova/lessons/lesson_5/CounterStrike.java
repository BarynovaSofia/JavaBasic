package ua.hillel.barynova.lessons.lesson_5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name first team: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter the player points for the first team))");

        int firstTeam1 = 0;
        if (scanner.hasNextInt()) {
            firstTeam1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data. Restart the program.");
            System.exit(0);
        }

        int firstTeam2 = 0;
        if (scanner.hasNextInt()) {
            firstTeam2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data. Restart the program.");
            System.exit(0);
        }

        int firstTeam3 = 0;
        if (scanner.hasNextInt()) {
            firstTeam3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data. Restart the program.");
            System.exit(0);
        }

        int firstTeam4 = 0;
        if (scanner.hasNextInt()) {
            firstTeam4 = scanner.nextInt();
        } else {
            System.out.println("Wrong data. Restart the program.");
            System.exit(0);
        }

        int firstTeam5 = 0;
        if (scanner.hasNextInt()) {
            firstTeam5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data. Restart the program.");
            System.exit(0);
        }

        scanner.nextLine();

        double pointsTeamOne = (double) (firstTeam1 + firstTeam2 + firstTeam3 + firstTeam4 + firstTeam5) / 5;
        System.out.println("Total Team " + firstName + " Points: " + pointsTeamOne);

        System.out.println();

        System.out.print("Name second team: ");
        String secondName = scanner.nextLine();

        System.out.println("Enter the player points for the second team))");

        int secondTeam1 = 0;
        if (scanner.hasNextInt()) {
            secondTeam1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data. Restart the program.");
            System.exit(0);
        }

        int secondTeam2 = 0;
        if (scanner.hasNextInt()) {
            secondTeam2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data. Restart the program.");
            System.exit(0);
        }

        int secondTeam3 = 0;
        if (scanner.hasNextInt()) {
            secondTeam3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data. Restart the program.");
            System.exit(0);
        }

        int secondTeam4 = 0;
        if (scanner.hasNextInt()) {
            secondTeam4 = scanner.nextInt();
        } else {
            System.out.println("Wrong data. Restart the program.");
            System.exit(0);
        }

        int secondTeam5 = 0;
        if (scanner.hasNextInt()) {
            secondTeam5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data. Restart the program.");
            System.exit(0);
        }

        double pointsTeamTwo = (double) (secondTeam1 + secondTeam2 + secondTeam3 + secondTeam4 + secondTeam5) / 5;
        System.out.println("Total Team " + secondName + " Points: " + pointsTeamTwo);

        if (pointsTeamOne > pointsTeamTwo) {
            System.out.println("Winner team is: " + firstName);
        } else if (pointsTeamOne < pointsTeamTwo) {
            System.out.println("Winner team is: " + secondName);
        } else {
            System.out.println("It's a draw!");
        }

        scanner.close();
    }
}

