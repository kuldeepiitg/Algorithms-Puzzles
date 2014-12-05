package in.kuldeepyadav.google.interview;

/**
 * Given n identical books(objects), find number of ways of choosing r non-consecutive books.
 * 
 * @algorithm
 * select first object and find r-1 objects in last n-2 objects. We can't consider next object
 * in domain of remaining selection otherwise it will give us consecutive selection. 
 * 
 * @author kuldeep
 */
public class NonConsecutiveSelection {

	/**
	 * Table to store already computed values.
	 */
	private int[][] table;
	
	/**
	 * @param total the domain i.e. total number of objects.
	 * @param toChoose count of objects to be chosen.
	 * @return number of ways to choose.
	 */
	private int choose(int total, int toChoose) {
		
		if (table[total][toChoose] > 0) {
			return table[total][toChoose];
		}
		
		if (toChoose == 1) {
			return total;
		} else if (toChoose > total) {
			return 0;
		} else {
			table[total][toChoose] = choose(total - 2, toChoose - 1) + choose(total - 1, toChoose);
			return table[total][toChoose];
		}
	}
	
	/**
	 * @param total the domain i.e. total number of objects.
	 * @param toChoose count of objects to be chosen.
	 * @return number of ways to choose.
	 */
	public int select(int total, int toChoose) {
		
		table = new int[total + 1][toChoose + 1];
		return choose(total, toChoose);
	}
}
