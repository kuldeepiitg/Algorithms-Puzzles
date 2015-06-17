package in.interview.ola;

/**
 * Utilities to find count of islands in ocean.
 * 
 * @author kuldeep
 */
public class Islands {

	/**
	 * @param ocean
	 * 		Ocean is a 2-D matrix, contains false where there is water.
	 * 		true, if land exists at some coordinate.
	 * @return count of islands
	 */
	public static int count(boolean[][] ocean){
		
		int count = 0;
		for (int i = 0; i < ocean.length; i++) {
			for (int j = 0; j < ocean[0].length; j++) {
				
				if (ocean[i][j]) {
					count++;
					submergeIsland(i, j, ocean);
				}
			}
		}
		return count;
	}
	
	/**
	 * @param x
	 * 		x-coordinate of the point in island
	 * @param y
	 * 		y-coordinate of the point in island
	 * @param ocean
	 */
	private static void submergeIsland(int x, int y, boolean[][] ocean){
		
		if (!ocean[x][y]) {
			return;
		}
		
		ocean[x][y] = false;
		int lengthAlongX = ocean.length;
		int lengthAlongY = ocean[0].length;
		if (x + 1 < lengthAlongX) {
			submergeIsland(x+1, y, ocean);
		}
		if (x - 1 >= 0) {
			submergeIsland(x-1, y, ocean);
		}
		if (y + 1 < lengthAlongY) {
			submergeIsland(x, y + 1, ocean);
		}
		if (y -1 >= 0) {
			submergeIsland(x, y-1, ocean);
		}
	}
	
}
