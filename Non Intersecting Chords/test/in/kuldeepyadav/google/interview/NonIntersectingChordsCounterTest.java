package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link NonIntersectingChordsCounter}. 
 * 
 * @author kuldeep
 *
 */
public class NonIntersectingChordsCounterTest {

	@Test
	public void testCountWays() {
		
		NonIntersectingChordsCounter nonIntersectingChordsCounter = new NonIntersectingChordsCounter(0);
		assertEquals(1, nonIntersectingChordsCounter.countWays());
		
		nonIntersectingChordsCounter = new NonIntersectingChordsCounter(1);
		assertEquals(1, nonIntersectingChordsCounter.countWays());
		
		nonIntersectingChordsCounter = new NonIntersectingChordsCounter(2);
		assertEquals(2, nonIntersectingChordsCounter.countWays());
		
		nonIntersectingChordsCounter = new NonIntersectingChordsCounter(3);
		assertEquals(5, nonIntersectingChordsCounter.countWays());
		
		nonIntersectingChordsCounter = new NonIntersectingChordsCounter(4);
		System.out.println(nonIntersectingChordsCounter.countWays());
		
		nonIntersectingChordsCounter = new NonIntersectingChordsCounter(5);
		System.out.println(nonIntersectingChordsCounter.countWays());
		
		nonIntersectingChordsCounter = new NonIntersectingChordsCounter(6);
		System.out.println(nonIntersectingChordsCounter.countWays());
	}

}
