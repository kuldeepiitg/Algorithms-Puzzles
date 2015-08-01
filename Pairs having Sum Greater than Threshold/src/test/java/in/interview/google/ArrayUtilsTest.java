package in.interview.google;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Junit test for {@link ArrayUtils}.
 * 
 * @author kuldeep
 */
public class ArrayUtilsTest {

	@Test
	public void testCountPairs() {
		
		int[] array = new int[]{1,2,4,5,8,10,23,34,56,57,58,59,60};
		int threshold = 50;
		assertEquals(countPairs(array, threshold), ArrayUtils.countPairs(array, threshold));
	}
	
	/**
	 * Brute force way of counting pairs.
	 * 
	 * @param array
	 * @param threshold
	 * @return
	 */
	private int countPairs(int[] array, int threshold) {
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] >= threshold) {
					count++;
				}
			}
		}
		return count;
	}

}
