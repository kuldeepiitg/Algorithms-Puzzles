package in.kuldeepyadav.google.interview;

/**
 * @algorithm :  
 * Take two points on circle to make a chrod. This cord will divide circle into two 
 * convex connected loops which can further be considered as circles. Find number of ways for 
 * these smaller circles and use them to find total.  
 * Recurrence equation: C(n) = ∑C(k)*C(n-1-k), where k is such that k < n and n-1-k >= 0 
 * Use dynamic programming. We must divide circle such that both of the newly formed circles have even points.
 * If not, then either we won't have n chords or we will end up in intersection of a chord in to our dividing chord. 
 * 
 * Pseudo code: 
 * 	Make a look up table. 
 * 
 * 	to compute C(n),
 * 		sum of P(k) for k between 0 to n-1 : 
 * 			compute C(k) and C(n-1-k), and save if they are not in table 
 * 			otherwise pick them from table	
 * 			P(k) = C(k)*C(n-1-k)	
 * 	
 * @author kuldeep
 *
 */
public class NonIntersectingChordsCounter {
	
	/**
	 * Number of pairs of points.
	 */
	private int numberOfPairs;
	
	/**
	 * Table to save already computed entries.
	 */
	private int[] table;

	public NonIntersectingChordsCounter(int numberOfPairs) {
		super();
		this.numberOfPairs = numberOfPairs;
		this.table = new int[numberOfPairs + 1];
	}
	
	/**
	 * @return number of ways of drawing chords on a circle with n pairs of points.
	 */
	private int countWays(int n) {
		
		if (n == 0) {
			return 1;
		} else if (table[n] <= 0) {
			int count = 0;
			for (int i = 0; i < n; i++) {
				count += countWays(i)*countWays(n-1-i);
			}
			table[n] = count;
		}
		return table[n];
	}
	
	/**
	 * @return number of ways of drawing chords on the circle.
	 */
	public int countWays(){
		return countWays(numberOfPairs);
	}
	
}
