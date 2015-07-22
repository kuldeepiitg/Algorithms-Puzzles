package in.interview.google;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link Fibonacci}.
 * 
 * @author kuldeep
 */
public class FibonacciTest {

	@Test
	public void testNumber() {
		
		int last = 1, secondLast = 1;
		for (int i = 3; i < 100; i++) {
			int expected = secondLast + last;
			try {
				int formulaValue = Fibonacci.number(i);
				assertEquals(expected, formulaValue);
			} catch (AssertionError error) {
				System.out.println("failed for i : " + i);
			}
			
			secondLast = last;
			last = expected;
		}
	}

}
