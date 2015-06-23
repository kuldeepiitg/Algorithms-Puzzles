package in.interview.limeroad;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link ArrayUtils}
 * 
 * @author kuldeep
 *
 */
public class ArrayUtilsTest {

	@Test
	public void testMissingPositiveNumber() {
		
		int actual = ArrayUtils.missingPositiveNumber(new int[]{-1, -2, -3, -4, 1, 2, 3});
		assertEquals(4, actual);
		
		actual = ArrayUtils.missingPositiveNumber(new int[]{-1, -2, -3, -4, 1, 2, 4});
		assertEquals(3, actual);
		
		actual = ArrayUtils.missingPositiveNumber(new int[]{1,4,5,1,4,2,2,3,6});
		assertEquals(7, actual);
	}

}
