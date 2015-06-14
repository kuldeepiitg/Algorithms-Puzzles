package in.interview.ixigo;

import static org.junit.Assert.*;
import in.interview.ixigo.Pairs.Pair;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Junit test for {@link Pairs}
 * 
 * @author kuldeep
 *
 */
public class PairsTest {

	@Test
	public void test() {
		
		List<Pair<Integer>> pairs = Pairs.getSumPairs(new int[]{1,2,3,4,5,6,7,8,9,10}, 5);
		List<Pair<Integer>> expected = new ArrayList<Pairs.Pair<Integer>>();
		expected.add(new Pair<Integer>(1,4));
		expected.add(new Pair<Integer>(1,9));
		expected.add(new Pair<Integer>(2,3));
		expected.add(new Pair<Integer>(2,8));
		expected.add(new Pair<Integer>(5,10));
		expected.add(new Pair<Integer>(6,4));
		expected.add(new Pair<Integer>(6,9));
		expected.add(new Pair<Integer>(7,3));
		expected.add(new Pair<Integer>(7,8));
		
		assertEquals(expected.size(), pairs.size());
		for (Pair<Integer> pair : expected) {
			assertTrue(pairs.contains(pair));
		}
	}

}
