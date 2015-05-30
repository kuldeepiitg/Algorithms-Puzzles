package com.housing.interview;
import java.util.Scanner;
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	
    	@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
    	int numTestCase = in.nextInt();
    	
    	for(int i = 0; i < numTestCase; i++) {
    		
    		int biggerJug = in.nextInt();
    		int smallerJug = in.nextInt();
    		
    		if (biggerJug < smallerJug) {
    			int temp = biggerJug;
    			biggerJug = smallerJug;
    			smallerJug = temp;
    		}
    		
    		int toFill = in.nextInt();
    		
    		boolean[] possibile = new boolean[biggerJug + 1];
    		possibile[biggerJug] = true;
    		possibile[smallerJug] = true;
    		
    		for(int j = biggerJug; j > 0; j--) {
    			
    			if (!possibile[j]) continue;
    			
    			for (int k = j-1; k > 0; k--) {
    				
    				if (!possibile[k]) continue;
    				
    				if(!possibile[j-k] && j-k > j-1)  {
    					possibile[j-k] = true;
    					k = j-k;
    				} else if (!possibile[j-k]) {
    					possibile[j - k] = true;
    				}
    			}
    		}
    		
    		if(possibile[toFill]) {
    			System.out.println("YES");
    		} else {
    			System.out.println("NO");
    		}
    	}
    	
    }
}