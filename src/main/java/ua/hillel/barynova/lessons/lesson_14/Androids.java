package ua.hillel.barynova.lessons.lesson_14;

public class Androids implements Smartphones, LinuxOS{

    @Override
    public void call(String number) {
        System.out.println("Android звонит на номер " + number);

    }

    @Override
    public void sms( String message) {
        System.out.println("Android отправляет СМС " + message);

    }

    @Override
    public void internet() {
        System.out.println("Android подключается к интернету через Chrome \n");

    }

    @Override
    public void openSourceFeatures() {
        System.out.println("Доступ к ядру Linux: включён");

    }

    @Override
    public void customizeUI() {
        System.out.println("Настройка интерфейса Android: установка кастомной темы");

    }
}
