package in.interview.google;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Test;

/**
 * Junit test for {@link ArrayUtils}.
 * 
 * @author kuldeep
 */
public class ArrayUtilsTest {

	@Test
	public void testSort() {
		
		int[] array = new int[]{10, 2, 11, 5, 8, 0, 6, 10, 7, 2, 7, 5, 10, 4, 9, 12};
		ArrayUtils.sort(array);
		int[] expected = new int[]{0, 2, 2, 4, 5, 5, 6, 7, 7, 8, 9, 10, 10, 10, 11, 12};
		assertArrayEquals(expected , array);
		
		List<Integer> unsortedList = new ArrayList<Integer>();
		Random random = new Random(System.currentTimeMillis());
		int listSize = random.nextInt(1000000);
		int minimum = random.nextInt();
		System.out.println(listSize);
		System.out.println(minimum);
		for (int i = 0; i < listSize; i++) {
			unsortedList.add(random.nextInt(listSize) + minimum);
		}
		
		int[] sortedByLibrary = org.apache.commons.lang3.ArrayUtils.toPrimitive(unsortedList.toArray(new Integer[1]));
		long startTime = System.nanoTime();
		Arrays.sort(sortedByLibrary);
		long endTime = System.nanoTime();
		System.out.println("time taken by library : " + (endTime - startTime));
		
		int[] sortedByNativeMethod = org.apache.commons.lang3.ArrayUtils.toPrimitive(unsortedList.toArray(new Integer[1]));
		startTime = System.nanoTime();
		ArrayUtils.sort(sortedByNativeMethod);
		endTime = System.nanoTime();
		System.out.println("time taken by native  : " + (endTime - startTime));
		
		assertArrayEquals(sortedByLibrary, sortedByNativeMethod);
	}

}
