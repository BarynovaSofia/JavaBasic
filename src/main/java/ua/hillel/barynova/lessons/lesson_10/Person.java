package ua.hillel.barynova.lessons.lesson_10;

public class Person {

    static String personInfo(String name, String surname, String city, String telephoneNumber){
        return "Call a citizen: " + name + " " + surname + " from the city " + city +
        "by the number " + telephoneNumber;
    }

    public static void main(String[] args) {

        String person1 = personInfo("Will", "Smith", "New York", "2936729462846");
        String person2 = personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        String person3 = personInfo("Sherlock", "Holmes", "London", "37742123513");

        System.out.print(person1 + "\n" + person2 + "\n" + person3);
    }
}
