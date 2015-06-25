package in.interview.google;

import java.util.Arrays;


/**
 * Utilities related to arrays.
 * 
 * @author kuldeep
 */
public class ArrayUtils {
	
	/**
	 * Sort the array.
	 * 
	 * @param array
	 * 		array containing integers
	 */
	public static void sort(int[] array) {
		
		int min = array[0], max = array[0];
		
		for (int value : array) {
			if (value < min) {
				min = value;
				continue;
			}
			if (value > max) {
				max = value;
			}
		}
		
		if (max - min + 1 > array.length) {
			Arrays.sort(array);
			return;
		}
		
		for (int i = 0; i < array.length; i++) {
			 array[i] -= min;
		}
		sortInPlace(array);
		for (int i = 0; i < array.length; i++) {
			array[i] += min;
		}
		return;
	}
	
	/**
	 * Sort array.
	 * It doesn't use extra space and do it in linear time.
	 * 
	 * @param array
	 * 		array containing values from 0 to N-1, where N is length of array
	 */
	private static void sortInPlace(int[] array) {
		
		populateCountsFromArray(array);
		populateArrayFromCounts(array);
		return;
	}

	/**
	 * @param array
	 * 		array containing values which are with in range from 0 to length of array
	 * @param min
	 * 		minimum value present in array
	 */
	private static void populateCountsFromArray(int[] array) {
		
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < 0) {
				continue;
			}
			
			int elementInHand = array[i];
			array[i] = 0;
			while (true) {
				int temp = array[elementInHand];
				if (temp < 0 || (temp == 0 && elementInHand <= i)) {
					array[elementInHand] -= 1;
					break;
				} else {
					array[elementInHand] = -1;
					elementInHand = temp;
				}
			}
		}
	}

	/**
	 * Populate sorted array using the counts given in array.
	 * 
	 * It doesn't use extra space, same array is modified.
	 * 
	 * @param array
	 * 			array keeping count at indices i.e. if index <b>i</b> have value <b>-n</b>
	 * 			then there are <b>n</b> occurrences of <b>i</b> in array.
	 */
	private static void populateArrayFromCounts(int[] array) {
		int nextNegative = 0;
		int count = 0;
		outerloop:
		for (int i = 0; i < array.length; i++) {
			while (nextNegative <= i || array[nextNegative] >= 0) {
				nextNegative++;
				if (nextNegative >= array.length) break outerloop;
			}
			count++;
			count += array[i];
			if (count > 0) {
				array[i] = nextNegative;
				array[nextNegative]++;
				count--;
			}
		}
		
		int lastNegative = array.length - 1;
		count = 0;
		outerloop:
		for (int i = array.length - 1; i>= 0; i--) {
			
			if (array[i] > 0) continue;
			
			while (lastNegative >= i || array[lastNegative] >= 0) {
				lastNegative--;
				if (lastNegative < 0) break outerloop;
			}
			count++;
			count += array[i];
			if (count > 0) {
				array[i] = lastNegative;
				array[lastNegative]++;
				count--;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == -1) {
				array[i] = i;
			}
		}
	}

}
