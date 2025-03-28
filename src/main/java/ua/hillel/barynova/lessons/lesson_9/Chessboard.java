package ua.hillel.barynova.lessons.lesson_9;

public class Chessboard {
    public static void main(String[] args) {

        char[][] chess = new char[8][8];

        for (int i = 0; i < chess.length ; i++) {
            for (int j = 0; j < chess[i].length ; j++) {
                if ((i + j) % 2 == 0) {
                    chess[i][j] = 'B';
                } else {
                    chess[i][j] = 'W';
                }
            }

        }

        for (int i = 0; i < chess.length ; i++) {
            for (int j = 0; j < chess[i].length ; j++) {
                System.out.print(chess[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
