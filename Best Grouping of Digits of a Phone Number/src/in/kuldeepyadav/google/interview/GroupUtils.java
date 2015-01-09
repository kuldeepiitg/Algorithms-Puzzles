package in.kuldeepyadav.google.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * More methods about Grouping.
 * 
 * @algorithm
 * 	similar to fibonacci number computation, other than dynamic programming.
 * 
 * @author kuldeep
 *
 */
public class GroupUtils {
	
	/**
	 * Delimiter to be used in grouping.
	 */
	public static final String delimiter = "  ";

	/**
	 * @param phoneNumber 
	 * 			phone number
	 * @return best grouping of phone number digits.
	 */
	public static String getBestGroup(String phoneNumber) {
		
		if (phoneNumber.length() < 4) {
			throw new RuntimeException("phone number is too small");
		}
		
		String last = phoneNumber.substring(0,2) + delimiter + phoneNumber.substring(2, 4);
		String secondLast = phoneNumber.substring(0,3);
		String thirdLast = phoneNumber.substring(0,2);
		
		int lastScore = score(phoneNumber.substring(0, 2)) + score(phoneNumber.substring(2, 4));
		int secondLastScore = score(phoneNumber.substring(0,3));
		int thirdLastScore = score(phoneNumber.substring(0, 2));
		
		for (int i = 4; i < phoneNumber.length(); i++) {
			
			int scoreOfLastTwoDigits = score(phoneNumber.substring(i-1, i+1));
			int scoreOfLastThreeDigits = score(phoneNumber.substring(i-2, i+1));
			
			int totalScoreByGroupingLastTwo = scoreOfLastTwoDigits + secondLastScore;
			int totalScoreByGroupingLastThree = scoreOfLastThreeDigits + thirdLastScore;
			
			int currentScore;
			String current;
			if (totalScoreByGroupingLastTwo >= totalScoreByGroupingLastThree) {
				
				currentScore = totalScoreByGroupingLastTwo;
				current = secondLast + delimiter + phoneNumber.substring(i-1, i+1);
			} else {
				
				currentScore = totalScoreByGroupingLastThree;
				current = thirdLast + delimiter + phoneNumber.substring(i-2, i+1);
			}
			
			thirdLast = secondLast;
			secondLast = last;
			last = current;
			
			thirdLastScore = secondLastScore;
			secondLastScore = lastScore;
			lastScore = currentScore;
		}
		
		return last;
	}
	
	/**
	 * @param group 
	 * 			group of contiguous digits
	 * @return grouping score
	 */
	private static int score(String group) {
		
		Map<Character, Integer> digitCountMap = new HashMap<Character, Integer>();
		
		for (char digit : group.toCharArray()) {
			if(digitCountMap.containsKey(digit)) {
				int count = digitCountMap.get(digit);
				digitCountMap.put(digit, count + 1);
			} else {
				digitCountMap.put(digit, 1);
			}
		}
		
		if (group.length() == 2) {
			for (int digitCount : digitCountMap.values()) {
				if (digitCount == 2) {
					return 2;
				}
			}
			return 0;
		} else if (group.length() == 3) {
			for (int digitCount : digitCountMap.values()) {
				if (digitCount == 3) {
					return 2;
				} else if (digitCount == 2) {
					return 1;
				}
			}
			return 0;
		} else {
			throw new RuntimeException("Group must be having length 2 or 3");
		}
	}
	
	/**
	 * @param groupedPhoneNumber phone number after grouping.
	 * @return total score of grouped string.
	 */
	public static int getScore(String groupedPhoneNumber) {
		
		String[] groups = groupedPhoneNumber.split(delimiter);
		int totalScore = 0;
		for (String group : groups) {
			totalScore += score(group);
		}
		return totalScore;
	}
	
}
