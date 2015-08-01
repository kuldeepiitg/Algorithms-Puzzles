package in.interview.google;

/**
 * Utilities related to arrays.
 * 
 * @author kuldeep
 */
public class ArrayUtils {
	
	/**
	 * @param array
	 * 			sorted array
	 * @param threshold
	 * 			threshold sum
	 * @return count of unique pairs in the array which have sum above threshold
	 */
	public static int countPairs(int[] array, int threshold) {
		
		int start = 0;
		int end = array.length - 1;
		int count = 0;
		while (start < array.length - 1) {
			
			if (start < end) {
				while (array[end] + array[start] >= threshold) {
					end--;
				}
				count += (array.length - 1 - end);
			} else {
				count += (array.length - 1 - start);
			}
			start++;
		}
		
		return count;
	}
	
}
