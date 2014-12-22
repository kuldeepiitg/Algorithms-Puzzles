package in.kuldeepyadav.amazon.interview;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link Inversions}.
 * 
 * @author kuldeep
 */
public class InversionsTest {

	@Test
	public void testSort() {
		
		assertEquals(0, Inversions.getInversionCount(new int[]{4,10,25}));
		assertEquals(6, Inversions.getInversionCount(new int[]{4,3,2,1}));
		assertEquals(1, Inversions.getInversionCount(new int[]{4,1}));
		assertEquals(41, Inversions.getInversionCount(new int[]{11,12,6,3,1,13,1,9,5,4,8,10,7}));
	}

}
