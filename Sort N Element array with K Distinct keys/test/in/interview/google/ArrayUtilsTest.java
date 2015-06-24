package in.interview.google;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayUtilsTest {

	@Test
	public void testSort() {
		
		int[] array = new int[]{10, 2, 11, 5, 8, 0, 6, 10, 7, 2, 7, 5, 10, 4, 9, 12};
		ArrayUtils.sort(array);
//		System.out.println(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}
