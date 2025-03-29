package ua.hillel.barynova.lessons.lesson_10;

import java.util.Scanner;

public class IceCreamShop {
    static Scanner scanner = new Scanner(System.in);

    static int[] price = {30, 35, 40};
    static String[] name = {"Ванильное мороженное", "Шоколадное мороженное", "Клубничное мороженное"};

    static void printMenu(){
        System.out.println("Menu:");
        for (int i = 0; i < name.length ; i++) {
            System.out.println((i + 1) + ". " + name[i] + " - " + price[i] + "грн");
        }
    }

    static int calculatePrice(int choice, int quantity){
        if (choice < 1 || choice > 3) {
            System.out.println("Не верно!! Введите число от 1 до 3!!");
            return 0;
        }
        return price [choice - 1] * quantity;
    }

    static void makeOrder(){
        printMenu();

        System.out.println("Выберите мороженое (1-3): ");
        int choice = scanner.nextInt();

        System.out.println("Введите количество порций: ");
        int quantity = scanner.nextInt();

        int totalPrice = calculatePrice(choice, quantity);
        if (totalPrice > 0){
            System.out.println("Вы заказали " + quantity + " порции " + name[choice - 1]);
            System.out.println("Итоговая сумма: " + totalPrice + "грн. Приятного аппетита!!!!");
        }
    }

    public static void main(String[] args) {
        makeOrder();
    }
}
