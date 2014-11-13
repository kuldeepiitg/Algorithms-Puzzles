package com.kuldeep.google.interview;

/**
 * Given an array which tells how many max steps we can jump from
 * that place. We have to find maximum number of jumps to reach end
 * from start.
 * 
 * @algorithm
 * 	make an array where number of jumps to reach from start to that
 * point will be stored, let's say I am standing at index 'i' from this point 
 * I can jump maximum 'n' steps. So from the farthest point which is accessible 
 * at this point to this point check if number of steps required are more than 
 * update it.
 * 
 * @author kuldeep
 */
public class Jump {

	/**
	 * The walk array.
	 */
	private int[] walk;
	
	public Jump(int[] walk) {
		super();
		this.walk = walk;
	}

	public int jump(){
		
		int[] jumps = new int[walk.length];
		for(int i = 0; i < walk.length; i++) {
			int maxJumpsRequired;
			if (i == 0) {
				maxJumpsRequired = 1;
			} else {
				maxJumpsRequired = jumps[i] + 1;
			}
			for(int j = walk.length > i + walk[i] ? i + walk[i] : walk.length - 1; j > i; j--) {
				if(jumps[j] == 0 || jumps[j] > maxJumpsRequired) {
					jumps[j] = maxJumpsRequired;
				} else {
					break;
				}
			}
		}
		return jumps[jumps.length-1];
	}
}
