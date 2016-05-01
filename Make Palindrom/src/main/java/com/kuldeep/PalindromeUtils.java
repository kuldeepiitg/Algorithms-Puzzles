package com.kuldeep;

/**
 * Palindrome utilities
 * <p>
 * Created by kuldeep on 01/05/16.
 */
public class PalindromeUtils {

    /**
     * @param input input
     * @return count of insertions needed to be made in order to make input string palindrome.
     */
    public static int countInsertions(String input) {

        if (input.length() == 1 || input.length() == 0) {
            return 0;
        } else {
            int min = Integer.MAX_VALUE;
            if (input.length() > 1 && input.charAt(0) == input.charAt(input.length() - 1)) {
                min = Math.min(min, countInsertions(input.substring(1, input.length() - 1)));
            }
            min = Math.min(min, countInsertions(input.substring(0, input.length() - 1)) + 1);
            min = Math.min(min, countInsertions(input.substring(1, input.length())) + 1);
            return min;
        }
    }

    /**
     * @param input string
     * @return count of insertions needed to be made in order to make input string palindrome
     */
    public int countInsertionsDP(String input) {

        Integer[][] insertions = new Integer[input.length()][input.length()];
        return countInsertions(input, 0, input.length() - 1, insertions);
    }

    private int countInsertions(String input, int start, int end, Integer[][] insertions) {

        if (start == end || end < start) {
            return 0;
        } else {
            if (insertions[start][end] != null) {
                return insertions[start][end];
            }
            int min = Integer.MAX_VALUE;
            if (end > start && input.charAt(start) == input.charAt(end)) {
                min = Math.min(min, countInsertions(input, start + 1, end - 1, insertions));
            }
            min = Math.min(min, countInsertions(input, start, end - 1, insertions) + 1);
            min = Math.min(min, countInsertions(input, start + 1, end, insertions) + 1);
            insertions[start][end] = min;
            return min;
        }
    }
}
