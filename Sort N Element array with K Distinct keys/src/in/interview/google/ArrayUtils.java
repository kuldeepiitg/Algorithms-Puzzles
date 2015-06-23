package in.interview.google;

import java.util.Arrays;


/**
 * 
 * @author kuldeep
 *
 */
public class ArrayUtils {
	
	public static void sort(int[] array) {
		
		int min = array[0], max = array[0];
		
		for (int value : array) {
			if (value < min) {
				min = value;
				continue;
			}
			if (value > max) {
				max = value;
			}
		}
		
		if (max - min + 1 > array.length) {
			Arrays.sort(array);
			return;
		}
		
		
		
	}
	
	private static void sort(int[] array, int min) {
		
		for (int i = 0; i < array.length; i++) {
			 array[i] -= min;
		}
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < 0) {
				continue;
			}
			
			int elementInHand = array[i];
			while (true) {
				int temp = array[elementInHand];
				if (temp < 0) {
					array[elementInHand] -= 1;
					break;
				} else {
					array[elementInHand] = -1;
					elementInHand = temp;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			
		}
	}
	
	private static void setElements(int[] array) {
		
	}

}
