package in.interview.google;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link Repetition}
 * 
 * @author kuldeep
 */
public class RepetitionTest {

	@Test
	public void testSearch() {
		
		int repetition = Repetition.search(new int[]{5,2,1,4,1,3});
		assertEquals(1, repetition);
		
		repetition = Repetition.search(new int[]{7,3,6,13,11,12,2,4,3,4,5,9,10,8});
		assertEquals(3, repetition);
	}

}
