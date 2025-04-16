package ua.hillel.barynova.lessons.lesson_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean ordering = true;

        while (ordering){
            System.out.println("Виберіть напій (coffee, tea, lemonade, mojito, mineral_water, coca_cola) або 'exit' для завершення:");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("EXIT")){
                ordering = false;
                break;
            }

            try {
                DrinksMachine selectedDrink = DrinksMachine.valueOf(input);
                Drinks.makeDrink(selectedDrink);
            } catch (IllegalArgumentException e){
                System.out.println("Такого напою не існує. Спробуйте ще раз.");
            }

            System.out.println("\nВсього напоїв замовлено: " + Drinks.drinksCount);
            System.out.println("\nЗагальна сума до сплати: " + Drinks.totalSum + " грн");
        }
    }
}
