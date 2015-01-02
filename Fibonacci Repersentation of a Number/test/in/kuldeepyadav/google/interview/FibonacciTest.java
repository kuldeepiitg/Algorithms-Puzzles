package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link FibonacciSeries}.
 * 
 * @author kuldeep
 */
public class FibonacciTest {

	@Test
	public void testNext() {
		
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		int next = fibonacciSeries.next();
		assertEquals(0, next);
		next = fibonacciSeries.next();
		assertEquals(1, next);
		next = fibonacciSeries.next();
		assertEquals(1, next);
		next = fibonacciSeries.next();
		assertEquals(2, next);
		next = fibonacciSeries.next();
		assertEquals(3, next);
		next = fibonacciSeries.next();
		assertEquals(5, next);
		
	}

	@Test
	public void testGet() {
		
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		assertEquals(55, fibonacciSeries.get(10));
	}

}
