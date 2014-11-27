package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link NonConsecutiveZeroStrings}.
 * 
 * @author kuldeep
 */
public class NonConsecutiveZeroStringsTest {

	@Test
	public void testCount() {
		
		assertEquals(8,NonConsecutiveZeroStrings.count(4));
		assertEquals(13,NonConsecutiveZeroStrings.count(5));
	}

}
