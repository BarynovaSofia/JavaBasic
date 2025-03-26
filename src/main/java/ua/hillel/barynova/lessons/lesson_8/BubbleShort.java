package ua.hillel.barynova.lessons.lesson_8;

import java.util.Arrays;

public class BubbleShort {
    public static void main(String[] args) {

        //Найдёт только самое большое число за один проход

        int[] array = {1, 56, 78, -45 , 67, 12, 3, 0, 10, -345, 567, -9};

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }

        }

        System.out.println("Найдено только самое большое: " + Arrays.toString(array));

        //Переберёт полностью весь массив, с помощью вложенного цикла

        int[] array1 = {1, 56, 78, -45 , 67, 12, 3, 0, 10, -345, 567, -9};

        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 0; j < array1.length - 1; j++) {
                if (array1[j] > array1[j + 1]) {
                    int temp1 = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp1;
                }
            }

        }

        System.out.println("Полностью отсортировано: " + Arrays.toString(array1));

    }

}
