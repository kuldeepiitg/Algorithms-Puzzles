package in.interview.microsoft;

/**
 * Palindrome utilities.
 * 
 * @author kuldeep
 */
public class PalindromeUtils {

	/**
	 * @param string
	 * 		input string to checked if palindrome
	 * @return	true if string is palindrome ignoring spaces
	 */
	public static boolean isPalindromIgnoreWhitespace(String string) {
		
		int i = 0, j = string.length() - 1;
		while (i < j) {
			
			while ((string.charAt(i) == ' ' || string.charAt(i) == '\t') && i < j) i++;
			while ((string.charAt(j) == ' ' || string.charAt(j) == '\t') && i < j) j--;
			
			if (string.charAt(i) != string.charAt(j)) return false;
			i++;
			j--;
		}
		
		return true;
	}
}
