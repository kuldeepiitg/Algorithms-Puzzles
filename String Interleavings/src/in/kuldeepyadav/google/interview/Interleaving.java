package in.kuldeepyadav.google.interview;

/**
 * Interleaving of two strings.
 * 
 * @author kuldeep
 */
public class Interleaving {

	/**
	 * @param first first string
	 * @param second second string 
	 * @param interleaved 
	 */
	public static void print(String first, String second, String interleaved) {
		
		if (first.length() == 0) {
			System.out.print(interleaved);
			System.out.println(second);
			return;
		} else if (second.length() == 0) { 
			System.out.print(interleaved);
			System.out.println(first);
			return;
		}
		
		interleaved += first.charAt(0);
		print(first.substring(1), second, interleaved);
		interleaved = interleaved.substring(0, interleaved.length()-1);
		interleaved += second.charAt(0);
		print(first, second.substring(1), interleaved);
	}
}
