package in.interview.google;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Junit test for {@link MathUtils}
 * 
 * @author kuldeep
 */
public class MathUtilsTest {

	@Test
	public void testGcd() {
		
		assertEquals(4, MathUtils.gcd(12, 8));
		assertEquals(4, MathUtils.gcd(8, 12));
	}

}
