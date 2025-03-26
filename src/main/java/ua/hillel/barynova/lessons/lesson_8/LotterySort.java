package ua.hillel.barynova.lessons.lesson_8;

import java.util.Arrays;

public class LotterySort {
    public static void main(String[] args) {

        int[] organiser = new int[7];
        int[] player = new int[7];

        for (int i = 0; i < organiser.length ; i++) {
            organiser[i] = (int) (Math.random() * 10);
            player[i] = (int) (Math.random() * 10);

        }

        Arrays.sort(organiser);
        Arrays.sort(player);

        System.out.println("Organiser's numbers: " + Arrays.toString(organiser));
        System.out.println("Player Numbers: " + Arrays.toString(player));

        int countMatches = 0;

        for (int i = 0; i < organiser.length; i++) {
            if (organiser[i] == player[i]) {
                countMatches++;
                System.out.println("Coincidence in position " + (i + 1) + ": " + organiser[i]);
            }

        }

        System.out.println("Number of matches: " + countMatches);

    }
}
