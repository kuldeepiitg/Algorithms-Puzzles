package in.kuldeepyadav.google.interview;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Merge sort.
 * 
 * @author kuldeep
 */
public class Sort<C> {

	/**
	 * The {@link Comparator}.
	 */
	private Comparator<C> comparator;
	
	public Sort(Comparator<C> comparator) {
		super();
		this.comparator = comparator;
	}

	/**
	 * sort the array.
	 * @param array to sort
	 * @param start first index of array
	 * @param end last index of array
	 */
	private void sort(C[] array, int start, int end) {
		
		if (start - end == 0) {
			return;
		}
		
		sort(array, start, (start+end)/2);
		sort(array, (start+end)/2+1, end);
		
		List<C> temp = new LinkedList<C>();
		
		int i = start, j = (start+end)/2 + 1;
		while (i <= (start+end)/2 && j <= end) {
			if (comparator.compare(array[j], array[i]) < 0) {
				temp.add(array[j]);
				j++;
			} else {
				temp.add(array[i]);
				i++;
			}
		}
		
		while (i <= (start+end)/2) {
			temp.add(array[i]);
			i++;
		}
		while (j <= end) {
			temp.add(array[j]);
			j++;
		}
		
		i = start;
		for (Iterator<C> iterator = temp.iterator(); iterator.hasNext();) {
			C c = (C) iterator.next();
			array[i] = c;
			i++;
		}
		
		
		return;
	}
	
	/**
	 * @param array to sort.
	 */
	public void sort(C[] array) {
		sort(array, 0, array.length-1);
	}
}
