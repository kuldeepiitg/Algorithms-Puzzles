package in.interview.ola;

import java.util.Arrays;

/**
 * Bot on Grid. It can move in any of 4 directions.
 * 
 * @author kuldeep
 */
public class BotOnGrid {
	
	/**
	 * Probability of robot getting death.
	 * 
	 * @param length
	 * 			length of grid
	 * @param breadth
	 * 			breadth of grid
	 * @param botX
	 * 			initial x-coordinate of bot i.e. offset along length from (0,0)
	 * @param botY
	 * 			initial y-coordinate of bot i.e. offset along breadth from (0,0)
	 * @param battery
	 * 			battery strength of bot
	 * @return	probability of robot getting dead.
	 */
	public static double deathProbability(int length, int breadth, int botX,
			int botY, int battery) {

		double[][][] store = new double[battery][][];

		for (int i = 0; i < battery; i++) {
			store[i] = new double[length][];
			for (int j = 0; j < length; j++) {
				store[i][j] = new double[breadth];
				Arrays.fill(store[i][j], -1);
			}
		}

		double probability = 0;
		probability += 0.25 * deathProbability(botX - 1, botY, battery - 1,
				store, length, breadth);
		probability += 0.25 * deathProbability(botX + 1, botY, battery - 1,
				store, length, breadth);
		probability += 0.25 * deathProbability(botX, botY - 1, battery - 1,
				store, length, breadth);
		probability += 0.25 * deathProbability(botX, botY + 1, battery - 1,
				store, length, breadth);

		return probability;
	}

	/**
	 * Probability of death of robot in given state.
	 * 
	 * @param botX
	 * 			x-coordinate of bot
	 * @param botY
	 * 			y-coordinate of bot
	 * @param battery
	 * 			battery strength of bot
	 * @param store
	 * 			store to save probability
	 * @param length
	 * 			length of grid
	 * @param breadth
	 * 			breadth of grid
	 * @return	probability of bot getting dead at given state.
	 */
	private static double deathProbability(int botX, int botY, int battery,
			double[][][] store, int length, int breadth) {

		if (botX < 0 || botY < 0 || botX >= length || botY >= breadth) {
			return 1;
		} else {
			if (battery == 0) {
				return 0;
			} else {
				double probability = store[battery - 1][botX][botY];
				if (probability < 0) {
					probability = 0;
					probability += 0.25 * deathProbability(botX - 1, botY,
							battery - 1, store, length, breadth);
					probability += 0.25 * deathProbability(botX + 1, botY,
							battery - 1, store, length, breadth);
					probability += 0.25 * deathProbability(botX, botY - 1,
							battery - 1, store, length, breadth);
					probability += 0.25 * deathProbability(botX, botY + 1,
							battery - 1, store, length, breadth);
					store[battery - 1][botX][botY] = probability;
				}
				return probability;
			}
		}

	}
	
}
