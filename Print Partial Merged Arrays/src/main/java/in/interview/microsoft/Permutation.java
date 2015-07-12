package in.interview.microsoft;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.google.common.primitives.Ints;

/**
 * Permutations of two sorted integers arrays
 * 
 * Go thorough ALGORITHM.md for more information.
 * 
 * @author kuldeep
 */
public class Permutation {
	
	private List<int[]> permutations;
	
	private LinkedList<Integer> permutationInMaking;
	
	public Permutation() {
		super();
		this.permutationInMaking = new LinkedList<Integer>();
	}

	/**
	 * Permute arrays such that permutations are in sorted order and 
	 * elements come alternatively from both arrays.
	 * 
	 * @param firstArray
	 * 		first array of sorted integers
	 * @param secondArray
	 * 		second array of sorted integers
	 * @return list of all permutations
	 */
	public List<int[]> permute (int[] firstArray, int[] secondArray) {
		
		permutations = new LinkedList<int[]>();
		LinkedList<Integer> firstList = new LinkedList<Integer>(Ints.asList(firstArray));
		LinkedList<Integer> secondList = new LinkedList<Integer>(Ints.asList(secondArray));
		permute(firstList, secondList);
		return permutations;
	}
	
	/**
	 * Permute lists such that permutations are in sorted order and 
	 * elements come alternatively from both arrays.
	 * 
	 * First element into resultant permutation will come from first list.
	 * 
	 * @param firstList
	 * 		first list of sorted integers
	 * @param secondList
	 * 		second list of sorted integers
	 */
	private void permute (LinkedList<Integer> firstList, LinkedList<Integer> secondList) {
		
		if (firstList.isEmpty()) {
			Integer[] array = permutationInMaking.toArray(new Integer[0]);
			permutations.add(ArrayUtils.toPrimitive(array));
			return;
		}
		
		if(!permutationInMaking.isEmpty()) {
			Integer lastElementInPermutation = permutationInMaking.getLast();
			while (!firstList.isEmpty() && firstList.peek() < lastElementInPermutation) {
				firstList.poll();
			}
		}
		Integer firstElement = firstList.poll();
		
		permute(firstList, secondList);
		permutationInMaking.add(firstElement);
		permute(secondList, firstList);
		permutationInMaking.removeLast();
	}
	
}
