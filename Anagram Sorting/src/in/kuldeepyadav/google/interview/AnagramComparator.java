package in.kuldeepyadav.google.interview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * {@link Comparator} for comparing two strings,
 * they are equal if they are anagrams.
 * 
 * otherwise they will be compared lexicographical.
 * 
 * @author kuldeep
 */
public class AnagramComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		if (areAnagrams(s1, s2)) {
			return 0;
		}
		
		return compareLexicographically(s1, s2);
	}
	
	/**
	 * @param s1 first string.
	 * @param s2 second string.
	 * @return return true if given two strings are anagram.
	 */
	private boolean areAnagrams(String s1, String s2) {
		
		if (s1.length() != s2.length()) {
			return false;
		}
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s1.length(); i++) {
			
			char stringOneChar = s1.charAt(i);
			int count = 1;
			if (map.containsKey(stringOneChar)) {
				count += map.get(stringOneChar);
			}
			map.put(stringOneChar, count);
			
			char stringTwoChar = s2.charAt(i);
			count = -1;
			if (map.containsKey(stringTwoChar)) {
				count += map.get(stringTwoChar);
			}
			map.put(stringTwoChar, count);
		}
		
		for (Iterator<Character> iterator = map.keySet().iterator(); iterator.hasNext();){
			Object key = iterator.next();
			if (map.get(key) != 0) {
				return false;
			}
		}
		
		return true;
	}

	/**
	 * Compare two strings lexicographically.
	 * 
	 * @param s1 first string.
	 * @param s2 second string.
	 * @return positive number if first string falls after second,
	 * 			negative number if first string falls before second,
	 * 			otherwise zero.
	 */
	private int compareLexicographically(String s1, String s2) {
		
		int i = 0;
		while (i < s1.length() && i < s2.length()) {
			int difference = s1.charAt(i) - s2.charAt(i);
			if (difference == 0) {
				i++;
				continue;
			}
			return difference;
		}

		if (i < s1.length()) {
			return 1;
		}
		
		if (i < s2.length()) {
			return -1;
		}
		
		return 0;
	}
}
