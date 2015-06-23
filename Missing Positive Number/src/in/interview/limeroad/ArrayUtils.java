package in.interview.limeroad;

/**
 * Utilities related to arrays.
 * 
 * @author kuldeep
 *
 */
public class ArrayUtils {

	/**
	 * @param array
	 * 		array containing random integer values
	 * @return	first missing positive integer
	 */
	public static int missingPositiveNumber(int[] array) {
		
		boolean hasN = false;
		for (int i = 0; i < array.length; i++) {
			hasN |= (array[i] == array.length);
			if (array[i] < 0 || array[i] >= array.length) {
				array[i] = 0;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] <= 0) {
				continue;
			}
			
			int elementInHand = array[i];
			array[i] = 0;
			while (true) {
				if (array[elementInHand] > 0) {
					int temp = array[elementInHand];
					array[elementInHand] = -1;
					elementInHand = temp;
				} else {
					array[elementInHand] -= 1;
					break;
				}
			}
		}
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] >= 0) {
				return i;
			}
		}
		if (hasN) {
			return array.length + 1;
		}
		
		throw new RuntimeException("number must be from 1 to N");
	}
}
