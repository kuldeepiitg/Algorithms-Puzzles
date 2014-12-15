package in.kuldeepyadav.google.interview;

/**
 * Search a key in given sorted array.
 * 
 * @author kuldeep
 */
public class BinarySearch {

	/**
	 * @param array domain
	 * @param key key to be searched in domain array
	 * @return index of key in domain array.
	 */
	public static int search (int[] array, int key) {
		
		int start = 0;
		int end = array.length - 1;
		
		while (start <= end) {
			
			int mid = (start + end)/2;
			if (key == array[mid]) {
				return mid;
			} else if (key < array[mid]) {
				end = mid -1;
			} else {
				start = mid + 1;
			}
		}
		
		return -1;
	}
}
