package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link FibonacciRepersentation}.
 * 
 * @author kuldeep
 */
public class FibonacciRepersentationTest {

	@Test
	public void testRepresent() {
		
		assertEquals("100010", FibonacciRepersentation.represent(15));
	}

}
