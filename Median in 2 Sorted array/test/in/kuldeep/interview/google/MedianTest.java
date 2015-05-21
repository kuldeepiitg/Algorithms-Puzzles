package in.kuldeep.interview.google;

import org.junit.Test;

public class MedianTest {

	@Test
	public void testFindMedian() {
		
		int[] firstSortedArray = new int[]{7,8,9,10,11,12};
		int[] secondSortedArray = new int[]{1,2,3,4,5,6};
		int median = Median.findMedian(firstSortedArray, secondSortedArray);
		System.out.println(median);
	}

}
