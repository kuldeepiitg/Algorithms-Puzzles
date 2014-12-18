package in.kuldeepyadav.google.interview;

/**
 * Binary Search in rotated array.
 * 
 * @author kuldeep
 */
public class NewRotatedBinarySearch {

	/**
	 * 
	 * @param rotatedArray the domain array.
	 * @param key element to be searched.
	 * @return index of key in domain array.
	 */
	public static int search(int[] rotatedArray, int key) {
		
		int start = 0;
		int end = rotatedArray.length - 1;
		while (start < end) {
			
			int mid = (start + end)/2;
			if (rotatedArray[mid] == key) {
				return mid;
			}
			
			if (rotatedArray[mid] < rotatedArray[start]) {
				if (rotatedArray[mid] < key && key < rotatedArray[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else if (rotatedArray[mid] > rotatedArray[end]) {
				if (rotatedArray[start] < key && key < rotatedArray[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (key < rotatedArray[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
