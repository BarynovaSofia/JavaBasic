package ua.hillel.barynova.lessons.lesson_12;

public class User {

    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final String number;

    private final int age;

    private String surname;
    private double weight;
    private String pressure;
    private int steps;

    public User (String name, int birthDay, int birthMonth, int birthYear,
                 String email, String number, String surname, double weight,
                 String pressure, int steps) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.number = number;
        this.age = 2025 - birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void printAccountInfo(){
        System.out.println("------User Information------");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Birthday: " + birthDay + "." + birthMonth + "." + birthYear);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Number: " + number);
        System.out.println("Pressure: " + pressure);
        System.out.println("Weight: " + weight);
        System.out.println("Steps today: " + steps);


    }


}
