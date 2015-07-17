package in.interview.google;

/**
 * Specific utilities related to Numbers
 * 
 * @author kuldeep
 */
public class NumberUtils {
	
	/**
	 * @param number
	 * 		array representing number as digits sequence
	 * @return
	 * 		array number incremented by one
	 */
	public static int[] increment(int[] number) {
		
		if (number.length == 0)
			throw new RuntimeException("Number array must have atleast one element");
		
		number[number.length - 1]++;
		
		int leftMostCarry = 0;
		for (int i = number.length - 1; i >= 0 && number[i] >= 10; i--) {
			
			if (i == 0) {
				leftMostCarry = 1;
			} else {
				number[i - 1] += 1;
			}
			number[i] %= 10;
		}
		
		if (leftMostCarry > 0) {
			int[] newNumber = new int[number.length + 1];
			newNumber[0] = leftMostCarry;
			for (int i = 0; i < number.length; i++) {
				newNumber[i+1] = number[i];
			}
			number = newNumber;
		}
		
		return number;
	}

}
