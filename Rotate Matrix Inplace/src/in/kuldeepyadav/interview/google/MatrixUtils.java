package in.kuldeepyadav.interview.google;

/**
 * Matrix utilities
 *
 * Created by kuldeep on 04/05/16.
 */
public class MatrixUtils {

    /**
     * Rotate matrix by 90 degree clockwise
     *
     * @param matrix original configuration
     */
    public void rotate(int[][] matrix){

        int temp;
        for (int y = 0; y <= matrix.length/2 - 1; y++) {
            for (int x = 0; x <= (matrix.length - 1)/2; x++) {
                Position nextPosition = getRotatedPosition(x, y, matrix.length);
                temp = matrix[nextPosition.y][nextPosition.x];
                matrix[nextPosition.y][nextPosition.x] = matrix[y][x];
                nextPosition = getRotatedPosition(nextPosition, matrix.length);
                int temp2 = matrix[nextPosition.y][nextPosition.x];
                matrix[nextPosition.y][nextPosition.x] = temp;
                nextPosition = getRotatedPosition(nextPosition, matrix.length);
                temp = matrix[nextPosition.y][nextPosition.x];
                matrix[nextPosition.y][nextPosition.x] = temp2;
                matrix[y][x] = temp;
            }
        }
    }

    /**
     * Print matrix to console.
     *
     * @param matrix 2D array to be printed
     */
    public void print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * |--------|--------|
     * |First   | Second |
     * |        |        |
     * |--------|--------|
     * |Fourth  |Third   |
     * |        |        |
     * |--------|--------|
     *
     *
     *
     * @param x x coordinate of point
     * @param y y coordinate of point
     * @param width width of matrix
     *
     * @return Position of point after 90 degree clockwise rotation.
     */
    private Position getRotatedPosition(int x, int y, int width){

        if(2*x < width) {
            if(2*y < width) {
                // First Quadrant
                return new Position(width - 1 - y, x);
            } else {
                // Fourth quadrant
                return new Position(width - 1 - y, x);
            }
        } else {
            if(2*y < width) {
                // Second Quadrant
                return new Position(width - 1 - y, x);
            } else {
                // Third Quadrant
                return new Position(width - 1 - y, x);
            }
        }
    }

    /**
     * @param position (x,y) coordinate in 2D array.
     * @param width width of matrix
     * @return next position, rotated by 90 degree.
     */
    private Position getRotatedPosition(Position position, int width) {
        return getRotatedPosition(position.x, position.y, width);
    }

    /**
     * (x,y) coordinates in 2D array
     */
    private class Position {

        public int x,y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
