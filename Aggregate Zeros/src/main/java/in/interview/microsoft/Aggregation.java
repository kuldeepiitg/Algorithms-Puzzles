package in.interview.microsoft;

/**
 * Aggregate all zeros in end.
 * 
 * @author kuldeep
 */
public class Aggregation {

	/**
	 * Aggregate all zeros in end of array.
	 * 
	 * @param array
	 * 		original array
	 * @return original array with all zeros in last
	 */
	public static int[] aggregate(int[] array){
		
// 		without using temp variable
//		int j = 0;
//		while (array[j] != 0) j++;
//		
//		for (int i = j; i < array.length; i++) {
//			if (array[i] != 0) {
//				array[j] = array[i];
//				array[i] = 0;
//				j++;
//			}
//		}
		
		for(int i = 0, j = 0; j < array.length; j++) {
			if (array[j] != 0) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				i++;
			}
		}
		
		return array;
	}
}
