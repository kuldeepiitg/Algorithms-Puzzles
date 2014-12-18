package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link PivotUtil}.
 * 
 * @author kuldeep
 */
public class PivotUtilTest {

	@Test
	public void testGetPivotIndex() {
		
		assertEquals(0, PivotUtil.getPivotIndex(new int[]{1,2,3,4,5,6}));
		assertEquals(0, PivotUtil.getPivotIndex(new int[]{1,}));
		assertEquals(0, PivotUtil.getPivotIndex(new int[]{1,2}));
		assertEquals(1, PivotUtil.getPivotIndex(new int[]{2,1}));
		assertEquals(2, PivotUtil.getPivotIndex(new int[]{2,3,1}));
		assertEquals(1, PivotUtil.getPivotIndex(new int[]{3,1,2}));
		assertEquals(4, PivotUtil.getPivotIndex(new int[]{3,4,5,6,1,2}));
		
	}

}
