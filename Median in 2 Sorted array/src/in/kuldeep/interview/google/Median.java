package in.kuldeep.interview.google;

/**
 * Median of two sorted arrays.
 * 
 * @author kuldeep
 */
public class Median {

	public static int findMedian(int[] firstSortedArray, int[] secondSortedArray) {

		int firstArrayStart = 0;
		int secondArrayStart = 0;
		int firstArrayEnd = firstSortedArray.length - 1;
		int secondArrayEnd = secondSortedArray.length - 1;
		
		while (true) {
			if (firstArrayStart == firstArrayEnd && secondArrayStart == secondArrayEnd) {
				return firstSortedArray[firstArrayStart];
			}
			
			int firstArrayMedian = firstSortedArray[(firstArrayStart+firstArrayEnd)/2];
			int secondArrayMedian = secondSortedArray[(secondArrayStart + secondArrayEnd)/2];
			
			if (firstArrayMedian == secondArrayMedian) {
				return firstArrayMedian;
			} else if (firstArrayMedian < secondArrayMedian) {
				if (firstArrayStart != firstArrayEnd) {
					firstArrayStart = (firstArrayStart + firstArrayEnd)/2 + 1;
				}
				if (secondArrayStart != secondArrayEnd) {
					secondArrayEnd = (secondArrayStart + secondArrayEnd)/2 - 1;
				}
			} else {
				if (firstArrayStart != firstArrayEnd) {
					firstArrayEnd = (firstArrayStart + firstArrayEnd)/2 - 1;
				}
				if (secondArrayStart != secondArrayEnd) {
					secondArrayStart = (secondArrayStart + secondArrayEnd)/2 + 1;
				}
			}
		}
	}
	
}
