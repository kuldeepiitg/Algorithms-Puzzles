package in.kuldeepyadav.google.interview;

/**
 * 
 * @author kuldeep
 *
 */
public class Search {

	public static int doesExists(int[] array, int key) {
		
		int start = 0;
		int end = array.length - 1;
		
		while (start != end) {
			
			int mid = (start+end)/2;
			if (key == array[mid]) {
				return mid;
			}
			
			if (array[start] < array[mid]) {
				if (key < array[mid]) {
					if (key > array[start]) {
						end = mid - 1;
					} else if (key < array[start]) {
						start = mid + 1;
					}
				} else if (key > array[mid]) {
					start = mid + 1;
				}
			} else if (array[start] > array[mid]) {
				if (key < array[mid]) {
					end = mid - 1;
				} else if (key > array[mid]) {
					if (key < array[start]) {
						end = mid - 1;
					} else if (key > array[start]) {
						start = mid + 1;
					}
				}
			} else {
				return -1;
			}
			
		}
		return -1;
	}
}
