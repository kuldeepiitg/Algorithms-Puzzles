package in.interview.ixigo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Sum of Pair in Array Divisible by Given Number
 * 
 * Divide all elements by 'k' and get remainder for each element. 
 * Now check for pairs which give me sum equal to 0 or 'k'. 
 * That can be done by making a map with keys 0 to 'k-1'.
 * 
 * @author kuldeep
 */
public class Pairs {

	public static List<Pair<Integer>> getSumPairs(int[] array, int k) {
		
		Map<Integer, Set<Integer>> remainderMap = new HashMap<Integer, Set<Integer>>();
		
		for (int i = 0; i < array.length; i++) {
	        int remainder = array[i]%k;
	        if (remainderMap.containsKey(remainder)) {
	            Set<Integer> elementsWithSameRemainder = remainderMap.get(remainder);
	            elementsWithSameRemainder.add(array[i]);
	            remainderMap.put(remainder, elementsWithSameRemainder);
	        } else {
	        	Set<Integer> elementsWithSameRemainder = new HashSet<Integer>();
	        	elementsWithSameRemainder.add(array[i]);
	        	remainderMap.put(remainder, elementsWithSameRemainder);
	        }
	    }
	    
	    List<Pair<Integer>> pairs = new ArrayList<Pair<Integer>>();
	    List<Integer> elementsWithRemainderZero = new ArrayList<Integer>(remainderMap.get(0));
	    for (int i = 0; i < elementsWithRemainderZero.size(); i++) {
	        for (int j = i+1; j < elementsWithRemainderZero.size(); j++) {
	            pairs.add(new Pair<Integer>(elementsWithRemainderZero.get(i),
						elementsWithRemainderZero.get(j)));
	        }
	    }
	    
	    Set<Integer> keySet = remainderMap.keySet();
	    List<Integer> keys = new ArrayList<Integer>(keySet);
	    
		for (int key : keys) {
	    	if (!remainderMap.containsKey(key)) {
	    		continue;
	    	}
	        int complementKey = k - key;
	        
	        Set<Integer> complementElementsSet = remainderMap.get(complementKey);
	        if (complementElementsSet == null) {
	            remainderMap.remove(key);
	            continue;
	        }
	        for (int element : remainderMap.get(key)) {
	            for (Integer complementElement : complementElementsSet) {
	                if (element != complementElement)
	                    pairs.add(new Pair<Integer>(element, complementElement));
	            }
	        }
	        remainderMap.remove(key);
	        remainderMap.remove(complementKey);
	    }
	    
	    return pairs;
	}
	
	/**
	 * Pair of objects of type T
	 * 
	 * @author kuldeep
	 *
	 * @param <T>
	 */
	public static class Pair<T> {
		
		private T first; 
		private T second;
		
		public Pair (T first, T second){
			this.first = first;
			this.second = second;
		}
		
		/**
		 * @return the first
		 */
		public T getFirst() {
			return first;
		}

		/**
		 * @return the second
		 */
		public T getSecond() {
			return second;
		}

		@Override
		public String toString(){
			return "(" + first + ", " + second + "),  ";
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public boolean equals(Object p){
			return first.equals(((Pair<T>)p).getFirst()) && second.equals(((Pair<T>)p).getSecond());
		}
	}
}
