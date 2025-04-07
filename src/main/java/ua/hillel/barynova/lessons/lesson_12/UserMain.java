package ua.hillel.barynova.lessons.lesson_12;

public class UserMain {
    public static void main(String[] args) {

        User user1 = new User("John", 16, 9, 2000, "John356@gmail.com", "574839392",
                "Dee", 80.2, "120/90", 2000);
        User user2 = new User("Alice", 12, 10, 2004,"AliceSw@gmail.com", "8274648020",
                "Switch", 60.6, "140/90", 3000);
        User user3 = new User("Daniel", 6, 6, 1995,"DanBalan@gmail.com", "574838392",
                "Joel", 85.2, "110/80", 5000);

        user1.printAccountInfo();

        System.out.println();

        user2.printAccountInfo();

        user2.setSurname("Robert");
        user2.setWeight(65.3);

        user3.setSteps(9000);

        System.out.println("\nUpdated User2 Info: ");
        user2.printAccountInfo();

        System.out.println("\nUpdate User3 Info: ");
        user3.printAccountInfo();

    }
}
