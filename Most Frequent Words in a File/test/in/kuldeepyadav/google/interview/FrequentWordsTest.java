package in.kuldeepyadav.google.interview;

import in.kuldeepyadav.google.interview.FrequentWords.WordFrequency;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.junit.Test;

/**
 * Junit test for {@link FrequentWords}.
 * 
 * @author kuldeep
 */
public class FrequentWordsTest {

	@Test
	public void testGetMostFrequentWords() throws IOException {
		
		char[] alphabet = getAlphabet();
		FrequentWords frequentWords = new FrequentWords(alphabet, 10);
		
		BufferedWriter wr = new BufferedWriter(new FileWriter("dump"));
		wr.write("Hello world\n how are you doing?");
		wr.close();
		
		@SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(new FileReader("wordsEn.txt"));
		Iterator<String> lines = bufferedReader.lines().iterator();
		while(lines.hasNext()) {
			frequentWords.insert(lines.next());
		}
		
		for(WordFrequency wordFrequency : frequentWords.getMostFrequentWords()) {
			System.out.println(wordFrequency.getWord());
		}
	}
	
	private char[] getAlphabet() {
		char[] alphabet = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l',
				'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		return alphabet;
	}

}
