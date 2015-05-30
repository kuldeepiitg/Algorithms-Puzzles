package in.interview.housing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JugsTest {

	@Test
	public void testIsPossible() {
		
		assertEquals(true, Jugs.isPossible(5, 3, 4));
		assertEquals(true, Jugs.isPossible(3, 5, 4));
		assertEquals(false, Jugs.isPossible(3, 5, 8));
	}
}
