package ua.hillel.barynova.lessons.lesson_6;

public class ShuttleNumbers {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 1; ; i++) {
            int temp = i;
            boolean found = false;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit == 4 || digit == 9){
                    found = true;
                    break;
                }
                temp /= 10;
            }

            if (found) {
                continue;
            }

            counter++;
            System.out.println(counter + ") " + i);

            if (counter == 100) {
                break;
            }

        }

    }
}
