package ua.hillel.barynova.lessons.lesson_3;

public class Parallelepiped {
    public static void main(String[] args) {

        int aLength = (int) ((Math.random() * 15) + 20);
        int bWidth = (int) ((Math.random() * 20) + 25);
        int hHeights = (int) ((Math.random() * 11) + 19);

        int volume = aLength * bWidth * hHeights;
        System.out.println("Volume : " + volume);

        int length = 4 * (aLength + bWidth + hHeights);
        System.out.println("Length : " + length);
    }
}
