package in.kuldeepyadav.google.interview;

import java.util.Iterator;

/**
 * Fibonacci series.
 * 
 * @author kuldeep
 */
public class FibonacciSeries implements Iterator<Integer>{

	/**
	 * Previous fibonacci number.
	 */
	private int previousFibonacciNumber = 1;
	
	/**
	 * Previous to previous Fibonacci number.
	 */
	private int secondPreviousFibonacciNumber = -1;
	
	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub

		int nextFibonacci = secondPreviousFibonacciNumber + previousFibonacciNumber;
		secondPreviousFibonacciNumber = previousFibonacciNumber;
		previousFibonacciNumber = nextFibonacci;
		
		return nextFibonacci;
	}

	/**
	 * Previous fibonacci number and take iterator back by one step.
	 * 
	 * @return previous fibonacci number.
	 */
	public Integer previous() {
		int previousFibonacci = previousFibonacciNumber;
		previousFibonacciNumber = secondPreviousFibonacciNumber;
		secondPreviousFibonacciNumber = previousFibonacci - previousFibonacciNumber;
		return previousFibonacci;
	}
	
	/**
	 * @param n index of number in fibonacci series.
	 * @return nth fibonacci number.
	 */
	public int get(int n) {
		
		double nthFibonacciNumber = (Math.pow(((1 + Math.sqrt(5))/2),n) - Math.pow(((1 - Math.sqrt(5))/2),n))/Math.sqrt(5);
		return (int) Math.round(nthFibonacciNumber);
	}
	
	
}
