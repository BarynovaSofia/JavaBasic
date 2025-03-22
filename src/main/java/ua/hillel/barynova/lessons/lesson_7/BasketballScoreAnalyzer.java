package ua.hillel.barynova.lessons.lesson_7;

import java.util.Arrays;

public class BasketballScoreAnalyzer {
    public static void main(String[] args) {
        /*
        В вашей баскетбольной команде 10 человек. Очки игроков основного состава записаны в парные ячейки массива,
        а запасные игроки нечетные. Написать функцию, которая найдет насколько больше баллов,
        заработал основной состав относительно запасных игроков
         */

        int[] team = new int [10];

        for (int i = 0; i < team.length; i++) {
            team[i] = (int) (Math.random() * 11);
        }

        System.out.println("Total team points: " + Arrays.toString(team));

        int sumTeamOne = 0;
        int sumTeamTwo = 0;

        for (int i = 0; i < team.length; i++) {
            if (i % 2 == 0) {
                sumTeamOne += team[i];
            } else {
                sumTeamTwo += team[i];

            }
        }

        System.out.println("Basic composition: " + sumTeamOne);
        System.out.println("Reserve squad: " + sumTeamTwo);

        if (sumTeamOne > sumTeamTwo) {
            System.out.println("Win Team One: " + sumTeamOne);
        } else if (sumTeamTwo > sumTeamOne) {
            System.out.println("Win Team Two: " + sumTeamTwo);

        } else {
            System.out.println("Draw!!!");
        }


    }
}
