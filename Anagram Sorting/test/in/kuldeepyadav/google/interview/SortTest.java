package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.Test;

/**
 * Junit test for {@link Sort}.
 * 
 * @author kuldeep
 */
public class SortTest {

	@Test
	public void testSort() {
		
		Integer[] array = new Integer[]{5,3,6,1,7,8,3,6,0,2};
		Integer[] sortedOrder = new Integer[]{0,1,2,3,3,5,6,6,7,8};
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};
		
		Sort<Integer> sort = new Sort<Integer>(comparator);
		
		sort.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			assertEquals(sortedOrder[i], array[i]);
		}
	}

}
