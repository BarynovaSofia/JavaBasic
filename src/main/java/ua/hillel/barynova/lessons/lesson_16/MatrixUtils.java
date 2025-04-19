package ua.hillel.barynova.lessons.lesson_16;

public class MatrixUtils {

    public static double average(int[] array) {
        int sum = 0;
        for( int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] matrix){
        int rowCount = matrix.length;

        for (int[] row : matrix){
            if (row.length != matrix.length){
                return false;
            }
        }

        return true;
    }

}
