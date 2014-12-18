package in.kuldeepyadav.google.interview;

/**
 * Utilities related to pivots.
 * 
 * @author kuldeep
 */
public class PivotUtil {

	/**
	 * Find the index of element which would have been 
	 * zeroth index in normal(unrotated) sorted array.
	 * Consider all numbers to be unique.
	 * 
	 * @param rotatedArray array which is rotated.
	 * @return the index of pivot element.
	 */
	public static int getPivotIndex(int[] rotatedArray) {
		
		int start = 0;
		int end = rotatedArray.length - 1;
		int pivot = 0;
		
		while(end - start > 1) {
			int mid = (start + end)/2;
			if (rotatedArray[start] > rotatedArray[mid]) {
				end = mid;
			} else if (rotatedArray[end] < rotatedArray[mid]) {
				start = mid;
			} else {
				break;
			}
		}
		
		if (end == start + 1 && rotatedArray[start] > rotatedArray[end]) {
			pivot = end;
		}
		return pivot;
	}
}
