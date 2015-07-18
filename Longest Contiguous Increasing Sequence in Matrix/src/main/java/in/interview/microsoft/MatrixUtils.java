package in.interview.microsoft;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Matrix related utilities.
 * 
 * @author kuldeep
 */
public class MatrixUtils {

	/**
	 * @param matrix
	 * 			2-D array containing unique integers
	 * @return	longest contiguous increasing sequence length such that element in sequence are strictly increasing
	 */
	public static int longestIncreasingSequenceLength(int[][] matrix) {
		
		int rowCount = matrix.length;
		int coloumnCount = 0;
		if (rowCount > 0) {
			coloumnCount = matrix[0].length;
		}
		
		if (rowCount == 0 || coloumnCount == 0) {
			return 0;
		}
		
		int[][] lengthRecords = new int[rowCount][coloumnCount];
		
		int longestSequenceLength = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				int length = longestIncreasingSequenceLength(matrix, i, j, lengthRecords);
				if (length > longestSequenceLength) {
					longestSequenceLength = length;
				}
			}
		}
		
		return longestSequenceLength;
	}
	
	/**
	 * @param matrix
	 * 			2-D array containing unique integers
	 * @param x
	 * 			x (row number) coordinate of start point
	 * @param y
	 * 			y (column number) coordinate of start point
	 * @param lengthRecords
	 * 			matrix to store computed values to save time
	 * @return	length of longest increasing sequence starting from point (x,y).
	 */
	private static int longestIncreasingSequenceLength(int[][] matrix, int x, int y, int[][] lengthRecords) {
		
		if (lengthRecords[x][y] > 0) 
			return lengthRecords[x][y];
		
		if (x > matrix.length || y > matrix[0].length) {
			return 0;
		}
		
		int maxNeighbourLength = 0;
		if (x-1 >= 0 && matrix[x-1][y] > matrix[x][y]) {
			int aboveNeighbourLength = longestIncreasingSequenceLength(matrix, x-1, y, lengthRecords);
			maxNeighbourLength = Math.max(aboveNeighbourLength, maxNeighbourLength);
		}
		
		if (x+1 < matrix.length && matrix[x+1][y] > matrix[x][y]) {
			int belowNeighbourLength = longestIncreasingSequenceLength(matrix, x+1, y, lengthRecords);
			maxNeighbourLength = Math.max(belowNeighbourLength, maxNeighbourLength);
		}
		
		if (y-1 >= 0 && matrix[x][y-1] > matrix[x][y]) {
			int leftNeighbourLength = longestIncreasingSequenceLength(matrix, x, y-1, lengthRecords);
			maxNeighbourLength = Math.max(leftNeighbourLength, maxNeighbourLength);
		}
		
		if (y+1 < matrix[0].length && matrix[x][y+1] > matrix[x][y]) {
			int rightNeighbourLength = longestIncreasingSequenceLength(matrix, x, y+1, lengthRecords);
			maxNeighbourLength = Math.max(rightNeighbourLength, maxNeighbourLength);
		}
		
		lengthRecords[x][y] = maxNeighbourLength + 1;
		return lengthRecords[x][y];
	}
	
	/**
	 * @param matrix
	 * 		2-D array containing unique integers	
	 * @return coordinates of point in matrix which gives
	 * 		longest contiguous increasing sequence length 
	 * 		such that element in sequence are strictly increasing
	 */
	public static Pair<Integer, Integer> longestIncreasingSequencePoint(int[][] matrix) {
		
		int rowCount = matrix.length;
		int coloumnCount = 0;
		if (rowCount > 0) {
			coloumnCount = matrix[0].length;
		}
		
		if (rowCount == 0 || coloumnCount == 0) {
			throw new RuntimeException("matrix can't have size zero");
		}
		
		int[][] lengthRecords = new int[rowCount][coloumnCount];
		
		int longestSequenceLength = 0;
		int x = 0, y = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				int length = longestIncreasingSequenceLength(matrix, i, j, lengthRecords);
				if (length > longestSequenceLength) {
					longestSequenceLength = length;
					x = i;
					y = j;
				}
			}
		}
		
		return Pair.of(x, y);
	}
	
	/**
	 * @param matrix
	 * 			2-D array containing unique integers
	 * @return  longest contiguous increasing sequence 
	 * 			such that element are strictly increasing
	 */
	public static int[] longestIncreasingSequence(int[][] matrix) {
		
		int rowCount = matrix.length;
		int coloumnCount = 0;
		if (rowCount > 0) {
			coloumnCount = matrix[0].length;
		}
		
		if (rowCount == 0 || coloumnCount == 0) {
			throw new RuntimeException("matrix can't have size zero");
		}
		
		int[][] lengthRecords = new int[rowCount][coloumnCount];
		
		int longestSequenceLength = 0;
		int x = 0, y = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				int length = longestIncreasingSequenceLength(matrix, i, j, lengthRecords);
				if (length > longestSequenceLength) {
					longestSequenceLength = length;
					x = i;
					y = j;
				}
			}
		}
		
		List<Integer> sequence = new LinkedList<Integer>();
		while (lengthRecords[x][y] > 1) {
			sequence.add(matrix[x][y]);
			
			if (x-1 >= 0 && lengthRecords[x-1][y] == lengthRecords[x][y] - 1) {
				x--;
			} else if (x+1 < matrix.length && lengthRecords[x+1][y] == lengthRecords[x][y] - 1) {
				x++;
			} else if (y-1 >= matrix[0].length && lengthRecords[x][y-1] == lengthRecords[x][y] - 1) {
				y--;
			} else {
				y++;
			}
		}
		sequence.add(matrix[x][y]);
		
		return ArrayUtils.toPrimitive(sequence.toArray(new Integer[0]));
	}
	
}
