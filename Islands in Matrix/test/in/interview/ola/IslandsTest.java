package in.interview.ola;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Junit test for {@link Islands}
 * 
 * @author kuldeep
 */
public class IslandsTest {

	@Test
	public void testCount() {
		
		boolean[][] ocean = 
				new boolean[][]{
					{false, false, false, false, false, false, false, false, false, false},
					{false, false,  true, false, false, false, false, false, false,  true},
					{false, false,  true,  true,  true, false, false, false, false, false},
					{false, false, false, false, false, false, false, false, false, false},
					{false,  true, false, false, false, false, false, false, false, false},
					{ true,  true, false, false, false, false, false, false,  true, false},
					{false, false, false, false, false,  true, false, false,  true, false},
					{false, false, false, false, false, false, false, false,  true, false},
					{false, false,  true,  true,  true, false, false, false, false, false},
					{ true, false, false, false, false, false, false, false, false, false},
				};
		
		int count = Islands.count(ocean);
		assertEquals(7, count);
	}

}
