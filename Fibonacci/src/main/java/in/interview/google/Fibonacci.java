package in.interview.google;

/**
 * Fibonacci numbers and series.
 * 
 * @author kuldeep
 */
public class Fibonacci {
	
	/**
	 * Nth fibonacci number.<br>
	 * 
	 * Note : it will work only for n less than 50,  for larger values of n number overflows.
	 * 
	 * @param n
	 * 			index of number in fibonacci series.
	 * @return	<b>n</b>th {@link Fibonacci} number.
	 */
	public static int number(int n) {
		
		double phi = (1 + Math.sqrt(5))/2;
		double sai = (1 - Math.sqrt(5))/2;
		
		double nthFibonacci = Math.pow(phi, n) - Math.pow(sai, n);
		nthFibonacci /= (phi - sai);
		return (int) nthFibonacci;
	}
	
}
