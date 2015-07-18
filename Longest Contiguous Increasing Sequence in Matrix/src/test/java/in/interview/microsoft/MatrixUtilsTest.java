package in.interview.microsoft;

import static org.junit.Assert.*;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;

/**
 * Junit test for {@link MatrixUtils}.
 * 
 * @author kuldeep
 */
public class MatrixUtilsTest {

	@Test
	public void testLongestIncreasingSequencePoint() {
		
		int[][] matrix = {{10, 15, 2, 5},
				   			{4, 23, 6, 19},
				   			{1, 8, 9, 21}};
		
		int length = MatrixUtils.longestIncreasingSequenceLength(matrix);
		assertEquals(5, length);
		
		Pair<Integer, Integer> startPoint = MatrixUtils.longestIncreasingSequencePoint(matrix);
		assertEquals(Pair.of(2, 0), startPoint);
		
		int[] sequence = MatrixUtils.longestIncreasingSequence(matrix);
		assertArrayEquals(new int[]{1,4,10,15,23}, sequence);
	}

}
