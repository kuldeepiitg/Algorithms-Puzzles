package in.interview.google;

/**
 * Common maths functions.
 * 
 * @author kuldeep
 */
public class MathUtils {
	
	/**
	 * @param firstNumber
	 * @param secondNumber
	 * @return Greatest Common Divisor of given two integers
	 */
	public static int gcd(int firstNumber, int secondNumber) {
		
		while(firstNumber%secondNumber != 0) {
			int temp = secondNumber;
			secondNumber = firstNumber%secondNumber;
			firstNumber = temp;
		}
		
		return secondNumber;
	}
	
}
