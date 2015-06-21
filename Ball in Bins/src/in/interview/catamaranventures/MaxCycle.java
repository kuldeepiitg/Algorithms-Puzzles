package in.interview.catamaranventures;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kuldeep
 */
public class MaxCycle {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		
		// TODO : required array size is needed to be 
		// Approximated well to improve complexity
		int[] store = new int[end * end];
		Arrays.fill(store, Integer.MIN_VALUE);
		
		int max = -1;
		while (start <= end) {
			
			int seqLength = fillStore(start, store);
			if (max < seqLength) {
				max = seqLength;
			}
			start++;
		}
		
		System.out.println(max);
	}
	
	private static int fillStore(int n, int[] store) {
		
		if (n == 1) {
			store[1] = 1;
			return 1;
		}
		
		if (store[n] == Integer.MIN_VALUE) {
			int temp = 1;
			if (n%2 == 1) {
				temp += fillStore(n*3 + 1, store);
			} else {
				temp += fillStore(n/2, store);
			}
			store[n] = temp;
		}
		return store[n];
	}

}
