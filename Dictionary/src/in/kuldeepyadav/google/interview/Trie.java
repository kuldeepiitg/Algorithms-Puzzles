package in.kuldeepyadav.google.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Tire data structure.
 * 
 * {@link}
 * @author kuldeep
 */
public class Trie {

	/**
	 * Character to index map.
	 */
	private Map<Character, Integer> characterIndexMap;
	
	/**
	 * Index to character map.
	 */
	private char[] indexCharacterMap;
	
	/**
	 * The root node.
	 */
	private Node root;
	
	public Trie(char[] alphabet) {
		
		this.indexCharacterMap = alphabet;
		
		characterIndexMap = new HashMap<Character, Integer>();
		for (int i = 0; i < alphabet.length; i++) {
			this.characterIndexMap.put(alphabet[i], i);
		}
		Node.setAlphabetSize(alphabet.length);
		
		root = new Node();
	}
	
	public Trie(Map<Character, Integer> characterIndexMap) {
		
		this.characterIndexMap = characterIndexMap;
		this.indexCharacterMap = new char[characterIndexMap.size()];
		
		for(Entry<Character, Integer> entry : characterIndexMap.entrySet()) {
			indexCharacterMap[entry.getValue()] = entry.getKey();
		}
		Node.setAlphabetSize(characterIndexMap.size());
		
		root = new Node();
	}
	
	/**
	 * Insert a word.
	 * 
	 * @param word
	 * 			word to be inserted.
	 */
	public void insert(String word) {
		
		Node nodePtr = root;
		for(int i = 0; i < word.length(); i++) {
			
			if (nodePtr == null) {
				nodePtr = new Node();
			}
			int index = characterIndexMap.get(word.charAt(i));
			if (i == word.length() - 1) {
				nodePtr.getElementArray()[index].incrementWordCount();
			} else {
				if (nodePtr.getElementArray()[index].getNextNode() == null) {
					nodePtr.getElementArray()[index].setNextNode();
				}
				nodePtr = nodePtr.getElementArray()[index].getNextNode();
			}
		}
	}
	
	/**
	 * @param word
	 * 			word to be searched.
	 * @return count of instances of searched words.
	 */
	private int countInstances(String word) {
		Node nodePtr = root;
		for (int i = 0; i < word.length(); i++) {
			
			if (nodePtr == null) {
				return 0;
			}
			int index = characterIndexMap.get(word.charAt(i));
			if (i == word.length() - 1) {
				return nodePtr.getElementArray()[index].getWordCount();
			} else {
				nodePtr = nodePtr.getElementArray()[index].getNextNode(); 
			}
		}
		throw new RuntimeException("Should not reach here");
	}
	
	/**
	 * @param word
	 * 			word to be searched.
	 * @return true if the word exists in {@link Trie}.
	 */
	public boolean search(String word) {
		return countInstances(word) > 0;
	}
}
