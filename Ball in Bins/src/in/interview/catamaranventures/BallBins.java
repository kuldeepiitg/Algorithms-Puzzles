package in.interview.catamaranventures;

import java.util.Scanner;


/**
 * Took 40 minutes :(
 * 
 * @author kuldeep
 *
 */
public class BallBins {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// W B S
		
		int[] array = new int[9];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		
		int total = 0;
		char[] ballOrderArray = new char[3];
		
		int maxIndex = maxAtIndex(array);
		setBallOrder(maxIndex, ballOrderArray);
		for (int i = 0; i < array.length; i++) {
			if (i%3 == maxIndex%3) {
				if (i != maxIndex) {
					total += array[i];
				}
				array[i] = -1;
			}
		}
		
		maxIndex = maxAtIndex(array);
		setBallOrder(maxIndex, ballOrderArray);
		for (int i = 0; i < array.length; i++) {
			if (i%3 == maxIndex%3) {
				if (i != maxIndex) {
					total += array[i];
				}
				array[i] = -1;
			}
		}
		
		maxIndex = maxAtIndex(array);
		setBallOrder(maxIndex, ballOrderArray);
		for (int i = 0; i < array.length; i++) {
			if (i%3 == maxIndex%3) {
				if (i != maxIndex) {
					total += array[i];
				}
				array[i] = -1;
			}
		}
		
		System.out.println(new String(ballOrderArray) + " " + total);
	}
	
	private static void setBallOrder(int maxIndex, char[] ballOrderArray) {
		if (maxIndex%3 == 0) {
			ballOrderArray[maxIndex/3] = 'W';
		} else if (maxIndex%3 == 1) {
			ballOrderArray[maxIndex/3] = 'B';
		} else {
			ballOrderArray[maxIndex/3] = 'S';
		}
	}
	
	private static int maxAtIndex(int[] array) {
		int j = 0;
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				j = i;
				max = array[i];
			}
		}
		return j;
	}

}
