package in.kuldeepyadav.amazon.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Order of alphabets used in dictionary.
 * 
 * @author kuldeep
 */
public class Order {

	/**
	 * Map containing immediate children of a character.
	 */
	public HashMap<Character, Set<Character>> children;
	
	/**
	 * Map containing immediate parent element.
	 */
	public HashMap<Character, Character> parents;
	
	
	public  List<Character> alphabetOrder(List<String> dictionary){
		
		List<Character> alphabets = new ArrayList<Character>();
		
		for (int i = 1; i < dictionary.size(); i++) {
			
			String topString = dictionary.get(i-1);
			String bottomString = dictionary.get(i);
			
			int j = 0;
			while(j < topString.length() && j < bottomString.length()) {
				
				char topChar = topString.charAt(j);
				char bottomChar = bottomString.charAt(j);
				if (topChar != bottomChar) {
					
					
					
				}
				
			}
			
		}
		
		return alphabets;
	}
	
	/**
	 * 
	 * @param root root of the subtree.
	 * @param toSearch element to be searched 
	 * @return true if element is at lower level.
	 */
	private  boolean isAtLowerLevel(char root, char toSearch) {
		
		Set<Character> set = new HashSet<Character>(Arrays.asList(root));
		List<Character> queue = new LinkedList<Character>(Arrays.asList(root));
		
		while(!queue.isEmpty()) {
			char frontChar = queue.remove(0);
			
			Set<Character> frontCharChildren = children.get(frontChar);
			for (Character child : frontCharChildren) {
				if (child == toSearch) {
					return true;
				}
				if (!set.contains(child)) {
					set.add(child);
					queue.add(child);
				}
			}
		}
		
		return false;
	}
	
	
}
