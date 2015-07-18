package in.interview.microsoft;

/**
 * Array related utilities.
 * 
 * @author kuldeep
 *
 */
public class ArrayUtils {
	
	/**
	 * Sort an array in zig-zag pattern 
	 * 	i.e. second element is larger than first,
	 * 		third is smaller than second,
	 * 		fourth is larger than third,
	 * 		and so on ...
	 * @param array
	 * 		input array
	 * @return	zig-zag sorted array
	 */
	public static int[] zigZagSort(int[] array) {
		
		for (int i = 1; i < array.length; i++) {
			if ((i % 2 == 1 && array[i] < array[i - 1]) || (i % 2 == 0 && array[i] > array[i - 1])) {
				int temp = array[i];
				array[i] = array[i - 1];
				array[i - 1] = temp;
			}
		}
		
		return array;
	}

}
