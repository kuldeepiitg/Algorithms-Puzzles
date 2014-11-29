package in.kuldeepyadav.google.interview;

import java.util.Comparator;

import org.apache.commons.lang3.ArrayUtils;

/**
 * {@link Comparator} for comparing two strings,
 * they are equal if they are anagrams.
 * 
 * otherwise they will be compared lexicographical.
 * 
 * @author kuldeep
 */
public class AnagramComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		Character[] array1 = ArrayUtils.toObject(s1.toCharArray());
		Character[] array2 = ArrayUtils.toObject(s2.toCharArray());
		
		Sort<Character> sort = new Sort<Character>(new Comparator<Character>() {

			@Override
			public int compare(Character s1, Character s2) {
				return s1-s2;
			}
		});
		
		sort.sort(array1);
		sort.sort(array2);
		
		int i = 0;
		while (i < array1.length && i < array2.length) {
			int difference = array1[i] - array2[i];
			if (difference != 0) {
				return difference;
			}
			i++;
		}
		
		if (i < array1.length) {
			return -1;
		} else if ( i < array2.length) {
			return 1;
		}
		return 0;
	}

}
