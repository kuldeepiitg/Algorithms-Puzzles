package in.kuldeepyadav.amazon.interview;

/**
 * Inversions in an array.
 * 
 * @author kuldeep
 */
public class Inversions {

	/**
	 * Count of inversions.
	 */
	private static int inversionCount = 0;
	
	/**
	 * Partial sort of array
	 * 
	 * @param array
	 * 			given array.
	 * @param start
	 * 			starting index of the part to be sorted.
	 * @param end
	 * 			ending index of the part to be sorted.
	 * @return sorted subarray.
	 */
	private static int[] sort(int[] array, int start, int end) {
		
		if (start == end) {
			return new int[]{array[start]};
		}
		
		int[] firstHalf = sort(array, start, (start+end)/2);
		int[] secondHalf = sort(array, (start+end)/2 + 1, end);
		
		int[] sortedArray = new int[firstHalf.length + secondHalf.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < firstHalf.length && j < secondHalf.length) {
			if(firstHalf[i] <= secondHalf[j]) {
				sortedArray[k] = firstHalf[i];
				i++;
			} else {
				sortedArray[k] = secondHalf[j];
				j++;
				inversionCount += (firstHalf.length - i);
			}
			k++;
		}
		
		while (i < firstHalf.length) {
			sortedArray[k] = firstHalf[i];
			i++;
			k++;
		}
		
		while (j < secondHalf.length) {
			sortedArray[k] = secondHalf[j];
			j++;
			k++;
		}
		
		return sortedArray;
	}
	
	/**
	 * @param array
	 * @return sorted copy of array.
	 */
	private static int[] sort(int[] array) {
		inversionCount = 0;
		return sort(array, 0, array.length-1);
	}
	
	/**
	 * @return count of inversions in array.
	 */
	public static int getInversionCount(int[] array){
		sort(array);
		return inversionCount;
	}
}
