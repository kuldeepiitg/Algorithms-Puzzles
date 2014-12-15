package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link BinarySearch}
 * 
 * @author kuldeep
 */
public class BinarySearchTest {

	@Test
	public void testSearch() {
		
		assertEquals(18, BinarySearch.search(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,4,5,6,7,8,9,10}, 6));
		assertTrue(0 <= BinarySearch.search(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,4,5,6,7,8,9,10}, 1));
		assertTrue(14 > BinarySearch.search(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,4,5,6,7,8,9,10}, 1));
	}

}
