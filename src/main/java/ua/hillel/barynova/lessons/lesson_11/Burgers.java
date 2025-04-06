package ua.hillel.barynova.lessons.lesson_11;

public class Burgers {
    String bun;
    String meat;
    String cheese;
    String herbs;
    String mayonnaise;

    public Burgers() {
        bun = "bun";
        meat = "meat";
        cheese = "cheese";
        herbs = "herbs";
        mayonnaise = "mayonnaise";

        System.out.println("Regular burger: ");
        System.out.println("Ingredients of burger (" + bun + ", " + meat + ", " + cheese + ", " + herbs + ", " + mayonnaise + ")");
        System.out.println();
    }

    public Burgers(boolean isDiet){
        bun = "bun";
        meat = "meat";
        cheese = "cheese";
        herbs = "herbs";
        mayonnaise = "mayonnaise";
        System.out.println("Diet burger: ");
        System.out.println("Ingredients of burger (" + bun + ", " + meat + ", " + cheese + ", " + herbs + ")");
        System.out.println();
    }


    public Burgers(String doubleMeat){
        bun = "bun";
        meat = "meat";
        cheese = "cheese";
        herbs = "herbs";
        mayonnaise = "mayonnaise";
        System.out.println("Burger with double meat: ");
        System.out.println("Ingredients of burger (" + bun + ", " + meat + ", " + cheese + ", " + herbs + ", " + mayonnaise + ")");
    }

}
