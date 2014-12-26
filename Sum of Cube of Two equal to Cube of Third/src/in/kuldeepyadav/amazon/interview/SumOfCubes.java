package in.kuldeepyadav.amazon.interview;

/**
 * Sum of Cube of two numbers equal to cube of third.
 * 
 * @author kuldeep
 */
public class SumOfCubes {

	/**
	 * 
	 * @param N
	 */
	public static void printCubeTupples(int N){
		
		long[] cubes = new long[N+1];
		
		for (int i = 0; i < N+1; i++) {
			cubes[i] = i;
			cubes[i] *= i;
			cubes[i] *= i;
		}
		
		for (int i = 0; i < N+1; i++) {
			
			long iCube = cubes[i];
			int j = 1;
			int k = i;
			while (j < k) {
				long jCube = cubes[j];
				long kCube = cubes[k];
				
				if (jCube + kCube == iCube) {
					System.out.println(""+j+", "+k+", "+i);
					j++;
				} else if (jCube + kCube > iCube) {
					k--;
				} else if (jCube + kCube < iCube) {
					j++;
				}
			}
		}
		
	}
}
