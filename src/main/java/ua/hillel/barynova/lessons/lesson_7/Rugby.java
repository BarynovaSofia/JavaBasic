package ua.hillel.barynova.lessons.lesson_7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {

        int[] teamOne = new int[25];
        int[] teamTwo = new int[25];

        int sumOne = 0;
        int sumTwo = 0;
        
        for (int i = 0; i < teamOne.length; i++) {
            teamOne[i] = (int) (Math.random() * 23) + 18;
            sumOne += teamOne[i];
        }

        System.out.print("Age Team One: ");

        for (int i = 0; i < teamOne.length; i++) {
            if (i == teamOne.length - 1) {
                System.out.print(teamOne[i] + "\n");
            } else {
                System.out.print(teamOne[i] + ", ");
            }
        }
        
        for (int i = 0; i < teamTwo.length; i++) {
            teamTwo[i] = (int) (Math.random() * 23) + 18;
            sumTwo += teamTwo[i];
        }

        System.out.print("Age Team Two: ");

        for (int i = 0; i < teamTwo.length; i++) {
            if (i == teamTwo.length - 1) {
                System.out.print(teamTwo[i] + "\n");
            } else {
                System.out.print(teamTwo[i] + ", ");
            }
        }

        double averageAgeOne = sumOne / (double) teamOne.length;
        double averageAgeTwo = sumTwo / (double) teamTwo.length;

        System.out.println("Average Age One: " + averageAgeOne + "\nAverage Age Two: " + averageAgeTwo);

    }
}
