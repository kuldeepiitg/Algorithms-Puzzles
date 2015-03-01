package in.kuldeepyadav.google.interview;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Most frequent words.
 * 
 * @author kuldeep
 */
public class FrequentWords extends Trie{

	/**
	 * Most frequent words seen.
	 */
	private LinkedList<WordFrequency> mostFrequentWords;
	
	/**
	 * Maximum count of words to watch.
	 */
	private int maximumWordsToWatch;
	
	public FrequentWords(char[] alphabet, int maximumWordsToWatch) {
		super(alphabet);
		this.mostFrequentWords = new LinkedList<FrequentWords.WordFrequency>();
		this.maximumWordsToWatch = maximumWordsToWatch;
	}

	@Override
	public int insert(String word) {
		
		int frequency = super.insert(word);
		WordFrequency wordFrequency = new WordFrequency(word, frequency);
		
		for (ListIterator<WordFrequency> iterator = mostFrequentWords.listIterator(); iterator.hasNext();) {
			WordFrequency nextWordFrequency = iterator.next();
			if(frequency > nextWordFrequency.getFrequency() && 
					nextWordFrequency.getWord().equals(word)) {
				iterator.previous();
				iterator.add(wordFrequency);
			} else if (frequency < nextWordFrequency.getFrequency() && 
					nextWordFrequency.getWord().equals(word)) {
				wordFrequency.setFrequency(frequency);
			} else if (frequency == nextWordFrequency.getFrequency() &&
					mostFrequentWords.size() < maximumWordsToWatch) {
				iterator.add(wordFrequency);
			}
			if (mostFrequentWords.size() > maximumWordsToWatch) {
				mostFrequentWords.removeLast();
			}
		}
		if(mostFrequentWords.isEmpty()) {
			mostFrequentWords.add(wordFrequency);
		}
		return frequency;
	}
	
	/**
	 * @return the mostFrequentWords
	 */
	public LinkedList<WordFrequency> getMostFrequentWords() {
		return mostFrequentWords;
	}

	/**
	 * Word and its frequency.
	 * 
	 * @author kuldeep
	 */
	public class WordFrequency {
		
		/**
		 * Concerned word.
		 */
		private String word;
		
		/**
		 * Frequency of the word.
		 */
		private int frequency;

		public WordFrequency(String word, int frequency) {
			super();
			this.word = word;
			this.frequency = frequency;
		}
		
		/**
		 * @return the word
		 */
		public String getWord() {
			return word;
		}

		/**
		 * @return the frequency
		 */
		public int getFrequency() {
			return frequency;
		}

		/**
		 * @param frequency the frequency to set
		 */
		public void setFrequency(int frequency) {
			this.frequency = frequency;
		}
	}
}
