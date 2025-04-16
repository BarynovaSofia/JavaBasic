package ua.hillel.barynova.lessons.lesson_15;

public class Drinks {
    public static final double COFFEE_PRICE = 1.30;
    public static final double TEA_PRICE = 1.0;
    public static final double LEMONADE_PRICE = 2.40;
    public static final double MOJITO_PRICE = 2.60;
    public static final double MINERAL_WATER_PRICE = 0.95;
    public static final double COCA_COLA_PRICE = 3.30;

    public static int drinksCount = 0;
    public static double totalSum = 0;

    public static void makeDrink(DrinksMachine drink){
        switch (drink){
            case COFFEE:
                System.out.println("Готуємо каву...");
                totalSum += COFFEE_PRICE;
                drinksCount++;
                break;
            case TEA:
                System.out.println("Готуємо чай...");
                totalSum += TEA_PRICE;
                drinksCount++;
                break;
            case LEMONADE:
                System.out.println("Готуємо лимонад...");
                totalSum += LEMONADE_PRICE;
                drinksCount++;
                break;
            case MOJITO:
                System.out.println("Готуємо мохіто...");
                totalSum += MOJITO_PRICE;
                drinksCount++;
                break;
            case MINERAL_WATER:
                System.out.println("Наливаємо мінералку...");
                totalSum += MINERAL_WATER_PRICE;
                drinksCount++;
                break;
            case COCA_COLA:
                System.out.println("Наливаємо Coca-Cola...");
                totalSum += COCA_COLA_PRICE;
                drinksCount++;
                break;
            default:
                System.out.println("Невідомий напій");

            }
        }
    }

