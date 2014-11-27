package in.kuldeepyadav.google.interview;

/**
 * Count of strings which don't have any consecutive zeros.
 * 
 * @author kuldeep
 */
public class NonConsecutiveZeroStrings {

	/**
	 * @param n length of strings.
	 * 
	 * @return count of strings which doesn't have consecutive zeros.
	 */
	public static int count(int n) {
		
		if (n == 1) {
			return 2;
		} else if (n == 2) {
			return 3;
		} else {
			return count(n - 2) + count(n -1);
		}
	}
}
