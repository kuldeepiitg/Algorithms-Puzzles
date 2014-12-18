package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link RotatedBinarySearch}.
 * 
 * @author kuldeep
 */
public class RotatedBinarySearchTest {

	@Test
	public void testSearch() {
		
		assertEquals(6, RotatedBinarySearch.search(new int[] {4,5,6,7,8,9,1,2,3}, 1));
		assertEquals(1, RotatedBinarySearch.search(new int[] {4,5,6,7,8,9,1,2,3}, 5));
		assertEquals(4, RotatedBinarySearch.search(new int[] {1,2,3,4,5,6,7,8,9}, 5));
		
		assertEquals(6, NewRotatedBinarySearch.search(new int[] {4,5,6,7,8,9,1,2,3}, 1));
		assertEquals(1, NewRotatedBinarySearch.search(new int[] {4,5,6,7,8,9,1,2,3}, 5));
		assertEquals(4, NewRotatedBinarySearch.search(new int[] {1,2,3,4,5,6,7,8,9}, 5));
	}
}
