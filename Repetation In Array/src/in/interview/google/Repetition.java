package in.interview.google;

/**
 * Repetition in array.
 * 
 * @author kuldeep
 */
public class Repetition {

	/**
	 * @param array
	 * 			array of size n+1 containing elements from 1 to n
	 * @return smallest repeated element in array
	 */
	public static int search(int[] array) {
		
		for (int element : array) {
			if (element < 1 || element > array.length - 1) {
				throw new RuntimeException("element outside domain");
			}
		}
		
		int elementAtHand;
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > 0) {
				elementAtHand = array[i];
				array[i] = 0;
				while (true) {
					if (array[elementAtHand] > 0) {
						int temp = array[elementAtHand];
						array[elementAtHand] = -1;
						elementAtHand = temp;
					} else {
						array[elementAtHand] -= 1;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < -1) {
				return i;
			}
		}
		
		throw new RuntimeException("No repetition in array, how is it possible");
	}
}
