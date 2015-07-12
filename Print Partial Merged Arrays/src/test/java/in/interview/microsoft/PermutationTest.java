package in.interview.microsoft;

import java.util.List;

import org.junit.Test;

/**
 * Junit test for {@link Permutation}.
 * 
 * @author kuldeep
 */
public class PermutationTest {

	@Test
	public void testPermute() {
		
		int[] firstArray = new int[]{4,7,10,15,17};
		int[] secondArray = new int[]{5,9,11,16};
		
		Permutation permutation = new Permutation();
		List<int[]> list = permutation.permute(firstArray, secondArray);
		System.out.println(list);
	}

}
