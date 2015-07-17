package in.interview.google;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link NumberUtils}.
 * 
 * @author kuldeep
 */
public class NumberUtilsTest {

	@Test
	public void testIncrement() {
		
		int[] number = new int[]{5,4,3,6};
		NumberUtils.increment(number);
		assertArrayEquals(new int[]{5,4,3,7}, number);
		
		number = new int[]{9,9,9};
		number = NumberUtils.increment(number);
		assertArrayEquals(new int[]{1,0,0,0}, number);
	}

}
