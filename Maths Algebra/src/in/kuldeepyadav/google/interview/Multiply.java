package in.kuldeepyadav.google.interview;

public class Multiply {

	/**
	 * @param multiplicand first number.
	 * @param multiplier second number.
	 * @return product of two number.
	 */
	private static int multiplyUnsigned(int multiplicand, int multiplier){
		
		int carry = 0;
		int product = 0;
		int bitPlace = 0;
		while(multiplier > 0) {
			
			if((multiplier & 1) == 1) {
				carry += multiplicand;
			}
			
			product = product + ((carry & 1) << bitPlace);
			carry >>= 1;
			bitPlace++;
			
			multiplier >>= 1;
		}
		product += (carry << bitPlace);
		return product;
	}
	
//	public static int multiply(int multiplicand, int multiplier) {
//		
//		
//	}
	
//	public static int power(int number, int power) {
//		
//	}
}
