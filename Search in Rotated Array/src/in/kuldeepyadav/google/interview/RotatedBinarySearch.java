package in.kuldeepyadav.google.interview;

/**
 * Binary Search in a rotated array.
 * 
 * @author kuldeep
 */
public class RotatedBinarySearch {

	/**
	 * Search key in rotated array.
	 * 
	 * @param rotatedArray initial sorted array which is rotated by few index.
	 * @param key key to be searched.
	 * @return index of key in domain array.
	 */
	public static int search(int[] rotatedArray, int key) {
		
		int pivot = PivotUtil.getPivotIndex(rotatedArray);
		int index = BinarySearch.search(rotatedArray, key, 0, pivot - 1);
		if (index != -1) {
			return index;
		}
		index = BinarySearch.search(rotatedArray, key, pivot, rotatedArray.length - 1);
		return index;
	}
}
