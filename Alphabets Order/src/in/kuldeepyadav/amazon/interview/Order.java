package in.kuldeepyadav.amazon.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Order of alphabets used in dictionary.
 * 
 * @author kuldeep
 */
public class Order {
	
	/**
	 * @param dictionary list of all words.
	 * @return number of distinct characters in all the words of dictionary.
	 */
	private Map<Character, Integer> getAlphabetIndex(List<String> dictionary) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int counter = 0;
		
		for (String word : dictionary) {
			for(char character : word.toCharArray()) {
				if (!map.containsKey(character)) {
					map.put(character, counter);
					counter++;
				}
			}
		}
		
		return map;
	}
	
	
	/**
	 * Get alphabets in ascending order
	 * @param dictionary set of words
	 * @return list containing characters in order.
	 */
	@SuppressWarnings("unchecked")
	public List<Character> getAlphabetInOrder(List<String> dictionary) {
		
		Map<Character, Integer> alphabetIndexMap = getAlphabetIndex(dictionary);
		
		// make index to character map
		char[] indexAlphabetMap = new char[alphabetIndexMap.size()];
		Iterator<Character> it = alphabetIndexMap.keySet().iterator();
		while(it.hasNext()) {
			 char character = (Character) it.next();
			 int index = alphabetIndexMap.get(character);
			 indexAlphabetMap[index] = character;
		}
		
		// make directed graph
		Set<Character>[] graph = new HashSet[alphabetIndexMap.size()];
		int[] incomingEdgeCounts = new int[alphabetIndexMap.size()];
		for (int i = 1; i < dictionary.size(); i++) {
			String firstWord = dictionary.get(i-1);
			String secondWord = dictionary.get(i);
			
			int j = 0;
			while (j < firstWord.length() && j < secondWord.length()) {
				char topCharacter = firstWord.charAt(j);
				char bottomCharacter = secondWord.charAt(j);
				
				if (topCharacter != bottomCharacter) {
					int topCharacterIndex = alphabetIndexMap.get(topCharacter);
					if (graph[topCharacterIndex] == null) {
						graph[topCharacterIndex] = new HashSet<Character>();
					}
					if (!graph[topCharacterIndex].contains(bottomCharacter)) {
						graph[topCharacterIndex].add(bottomCharacter);

						int bottomCharacterIndex = alphabetIndexMap
								.get(bottomCharacter);
						incomingEdgeCounts[bottomCharacterIndex]++;
					}
					break;
				}
				j++;
			}
		}
		
		// collect nodes in graph with zero incoming edges.
		List<Integer> zeroIncomingNodes = new LinkedList<Integer>();
		for (int i = 0; i < incomingEdgeCounts.length; i++) {
			if (incomingEdgeCounts[i] == 0) {
				zeroIncomingNodes.add(i);
			}
		}
		
		// Go on iterating nodes in topological order.
		List<Character> orderedAlphabet = new LinkedList<Character>();
		while(!zeroIncomingNodes.isEmpty()) {
			Integer zeroIncomingNodeIndex = zeroIncomingNodes.remove(0);
			orderedAlphabet.add(indexAlphabetMap[zeroIncomingNodeIndex]);
			
			Set<Character> children = graph[zeroIncomingNodeIndex];
			if(children == null) {
				continue;
			}
			for (Character child : children) {
				int childIndex = alphabetIndexMap.get(child);
				incomingEdgeCounts[childIndex]--;
				if (incomingEdgeCounts[childIndex] == 0) {
					zeroIncomingNodes.add(childIndex);
				}
			}
		}
		
		return orderedAlphabet;
	}
	
	
}
