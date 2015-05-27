package in.interview.housing;

import in.interview.google.MathUtils;

/**
 * Two jugs 
 * 
 * @author kuldeep
 */
public class Jugs {

	public boolean isPossible(int firstJugCapacity, int secondJugCapacity, int fillUpTo) {
		
		int gcd = MathUtils.gcd(firstJugCapacity, secondJugCapacity);
		if(fillUpTo%gcd == 0) return true;
		else return false;
	}
}
