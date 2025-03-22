package ua.hillel.barynova.lessons.lesson_7;

public class Killer {
    public static void main(String[] args) {
        /* Задание:
  В убийстве Кеннеди есть 10 подозреваемых. Для каждого подозреваемого установлена вероятность того, что он был убийцей.
  Все эти вероятности записаны как массив чисел. Написать функцию, которая определит номер подозреваемого,
  которого нужно посадить в тюрьму.
         */

        int[] people = {11, 44, 98, 44, 22, 33, 55, 22, 90, 9};

        int maxProbability = people[0];
        int suspectIndex = 0;

        for (int i = 1; i < people.length; i++) {
            if (people[i] > maxProbability) {
                maxProbability = people[i];
                suspectIndex = i;
            }

        }

        System.out.println("Suspect number: " + suspectIndex);
        System.out.println("His likelihood of being a murderer: " + maxProbability);

    }
}
