package in.interview.microsoft;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link Aggregation}.
 * 
 * @author kuldeep
 */
public class AggregationTest {

	@Test
	public void testAggregate() {
		
		int[] array = new int[]{1,0,2,0,3,0,0,4,5,6,7,0,0,0};
		
		int[] expected = new int[]{1,2,3,4,5,6,7,0,0,0,0,0,0,0};
		Aggregation.aggregate(array);
		assertArrayEquals(expected, array);
		
		array = Aggregation.aggregate(new int[]{0,0,0,0,1,2,3,7,5,3,0,0,0});
		assertArrayEquals(new int[]{1,2,3,7,5,3,0,0,0,0,0,0,0}, array);
	}

}
