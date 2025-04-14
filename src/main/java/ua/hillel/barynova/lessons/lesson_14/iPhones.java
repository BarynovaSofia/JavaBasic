package ua.hillel.barynova.lessons.lesson_14;

public class iPhones implements Smartphones, iOS{

    @Override
    public void call(String number) {
        System.out.println("iPhone звонит на номер " + number);

    }

    @Override
    public void sms(String message) {
        System.out.println("iPhone отправляет iMessage " + message);

    }

    @Override
    public void internet() {
        System.out.println("iPhone подключается к интернету через Safari \n");

    }

    @Override
    public void useFaceTime() {
        System.out.println("Видеозвонок через FaceTime запущен");

    }

    @Override
    public void accessAppStore() {
        System.out.println("Открыт App Store для загрузки приложений");

    }
}
