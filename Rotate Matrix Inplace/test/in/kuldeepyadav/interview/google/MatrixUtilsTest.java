package in.kuldeepyadav.interview.google;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit test for MatrixUtils
 *
 * Created by kuldeep on 04/05/16.
 */
public class MatrixUtilsTest {

    @Test
    public void testRotate() throws Exception {

        MatrixUtils matrixUtils = new MatrixUtils();
        int[][] matrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = i * 4 + j;
            }
        }
        matrixUtils.print(matrix);
        matrixUtils.rotate(matrix);
        System.out.println();
        matrixUtils.print(matrix);
        System.out.println();

        matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = i * 5 + j;
            }
        }
        matrixUtils.print(matrix);
        matrixUtils.rotate(matrix);
        System.out.println();
        matrixUtils.print(matrix);
        System.out.println();

    }
}