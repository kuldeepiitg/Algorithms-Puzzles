package in.kuldeepyadav.google.interview;

/**
 * Fibonacci representation of a number.
 * 
 * @author kuldeep
 */
public class FibonacciRepersentation {
	
	/**
	 * @param number 
	 * 		number to be represented as sum of fibonacci numbers.
	 * @return integer whose binary representation will give ...
	 */
	public static int repersent(int number) {
		
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		
		// skip 0th and 1st number. start series with 1,2,3,5,8 ...
		fibonacciSeries.next();
		fibonacciSeries.next();
		
		int n = 1;
		int repersentation = 0;
		while(fibonacciSeries.next() < number) {
			n *= 2;
		}
		
		int previous = fibonacciSeries.previous();
		while (previous > 0) {
			if (previous <= number) {
				repersentation += n;
				number -= previous;
			}
			n /= 2;
			previous = fibonacciSeries.previous();
		}
		return repersentation;
	}
	
	/**
	 * @param number
	 * 		number to be represented as sum of fibonacci numbers.
	 * @return binary representation.
	 */
	public static String represent(int number){
		
		return Integer.toBinaryString(repersent(number));
	}
}
