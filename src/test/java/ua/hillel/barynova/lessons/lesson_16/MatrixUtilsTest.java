package ua.hillel.barynova.lessons.lesson_16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixUtilsTest {

    @Test
    public void testAverage(){
        int[] input = {1, 4, 6, 9};
        double expected = 5.0;

        double actual = MatrixUtils.average(input);

        System.out.println("Среднее арифметическое. Ожидали: " + expected + ", получили: " + actual);

        assertEquals(expected, actual);
    }

    @Test
    public void testIsSquareMatrix_true(){
        int[][] matrix = {
                {1,2},
                {4, 5}
        };

        boolean result = MatrixUtils.isSquareMatrix(matrix);

        System.out.println("Матрица квадратная. Ожидали: true, получили: " + result);

        assertTrue(result);
    }

    @Test
    public void testIsSquareMatrix_false(){
        int[][] matrix = {
                {3,4,1},
                {3,8}
        };

        boolean result = MatrixUtils.isSquareMatrix(matrix);

        System.out.println("Матрица квадратная. Ожидали: false, получили: " + result);

        assertFalse(result);
    }

}
