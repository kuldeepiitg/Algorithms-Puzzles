package in.kuldeepyadav.google.interview;

/**
 * Group the digits.
 * 
 * @author kuldeep
 */
public class Grouping {

	/**
	 * Best scores for first i+1 digits will be stored at ith index.
	 */
	private int[] best;
	
	/**
	 * Group the phone number digits to give best score.
	 * 
	 * @param phoneNumber
	 * 			phone number string
	 */
	private void group(String phoneNumber){
		
		best = new int[phoneNumber.length()];
		if(phoneNumber.length() < 2) return;
		best[1] = scoreForLastTwoDigits(phoneNumber, 1);
		if(phoneNumber.length() < 3) return;
		best[2] = scoreForLastThreeDigits(phoneNumber, 2);
		if(phoneNumber.length() < 4) return;
		best[3] = scoreForLastTwoDigits(phoneNumber, 3) + best[1];
	}
	
	/**
	 * 
	 * @param phoneNumber
	 * 			phone number string
	 * @param index 
	 * 			substring of two characters will end at index(inclusive).
	 * @return score for last two digits.
	 */
	private int scoreForLastTwoDigits(String phoneNumber, int index){
		
		if (phoneNumber.charAt(index-1) == phoneNumber.charAt(index)) {
			return 2;
		} else {
			return 0;
		}
	}
	
	/**
	 * 
	 * @param phoneNumber 
	 * 			phone number string
	 * @param index 
	 * 			substring of three characters will end at index(inclusive).
	 * @return score for last three digits.
	 */
	private int scoreForLastThreeDigits(String phoneNumber, int index) {
		
		if (phoneNumber.charAt(index - 2) == phoneNumber.charAt(index - 1) && 
				phoneNumber.charAt(index - 1) == phoneNumber.charAt(index)) {
			return 2;
		} else if (phoneNumber.charAt(index - 2) == phoneNumber.charAt(index - 1) ||
				phoneNumber.charAt(index - 1) == phoneNumber.charAt(index) ||
				phoneNumber.charAt(index - 2) == phoneNumber.charAt(index)) {
			return 1;
		} else {
			return 0;
		}
	}
	
	/**
	 * 
	 * @param phoneNumber
	 * 			phone number string
	 * @return
	 * 			best score for given phone number
	 */
	public int bestGroupingScore (String phoneNumber) {
		
		group(phoneNumber);
		int i;
		for (i = 4; i < phoneNumber.length(); i++) {
			best[i] = Math.max(scoreForLastTwoDigits(phoneNumber, i) + best[i-2], 
							scoreForLastThreeDigits(phoneNumber, i) + best[i-3]);
		}
		
		return best[i];
	}
}
