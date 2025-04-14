package ua.hillel.barynova.lessons.lesson_14;

public class Main {
    public static void main(String[] args) {

        Smartphones[] smartphones = {new Androids(), new iPhones()};

        for (Smartphones smartphone : smartphones){
            smartphone.call("911");
            smartphone.sms("Hello World!!!");
            smartphone.internet();

            if (smartphone instanceof Androids androids){
                androids.customizeUI();
                androids.openSourceFeatures();
            } else if (smartphone instanceof iPhones iphones){
                iphones.useFaceTime();
                iphones.accessAppStore();
            }

            System.out.println();
        }
    }
}
