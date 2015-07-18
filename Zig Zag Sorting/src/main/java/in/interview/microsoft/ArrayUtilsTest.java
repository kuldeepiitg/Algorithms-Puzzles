package in.interview.microsoft;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

/**
 * Junit test for {@link ArrayUtils}
 * 
 * @author kuldeep
 */
public class ArrayUtilsTest {

	@Test
	public void testZigZagSort() {

		int[] array = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		ArrayUtils.zigZagSort(array);
		for (int i = 1; i < array.length; i++) {
			assertTrue((i % 2 == 1 && array[i] >= array[i - 1]) || (i % 2 == 0 && array[i] <= array[i - 1]));
		}

		Random random = new Random(System.currentTimeMillis());
		int listSize = random.nextInt(200000);
		int minimum = random.nextInt();
		
		System.out.println(listSize);
		System.out.println(minimum);
		
		array = new int[listSize];
		for (int i = 0; i < listSize; i++) {
			array[i] = random.nextInt(listSize) + minimum;
		}
		ArrayUtils.zigZagSort(array);
		for (int i = 1; i < array.length; i++) {
			assertTrue((i % 2 == 1 && array[i] >= array[i - 1]) || (i % 2 == 0 && array[i] <= array[i - 1]));
		}
	}

}
