package tute05_6.progtrio.spellchecker2sol;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import utils.fileio.FileHandler;

//import exer.ch14.fileio.FileHandler;

/**
* @overview
* 	A program that uses SpellChecker
* 
* @author dmle
*/

public class SpellCheckerApp {
	
	/**
	 * @effects
	 * 	Read a document from file
	 * 	Initialise SpellChecker
	 * 	Check spelling the document
	 * 	Print the misspelled words (if any)
	 */
	public static void main(String[] args) {
		final String name = "English";
		
		// Read a document from file
		String docFileName = "complier.txt";
		String docFilePath = SpellCheckerApp.class.getResource(docFileName).getPath();
		
		String docStr = FileHandler.getFile(docFilePath);
		
		// Initialise Xref
		final Map<String,String> dictWords = getDictionaryWords();
		
		Dictionary dict = new Dictionary(name, dictWords);
		SpellChecker spellChecker = new SpellChecker(dict);
		
		// Check spelling dictionary
		Iterator<String> wrongWords = spellChecker.checkSpelling(docStr);
		
		// Print misspelled words (if any)
		if (wrongWords == null) {
			// TODO: print "empty
			System.out.println("No spelling errors");
		} else {
			// TODO: print each wrong word
			System.out.println("Words with spelling errors:\n---------------------------------");
			
			while (wrongWords.hasNext()) {
				String wd = wrongWords.next();
				System.out.println(wd);
			}
		}
	}
	
	/**
	 * @effects
	 * 	create and return a Map containing words and their definitions
	 */
	private static Map<String, String> getDictionaryWords() {
		Map<String,String> words = new HashMap();
		
		String[] wordsArr = {
			"Java", "complier", "is", "a", "complier", 
			"for", "the", "Java", "programming", "language", "JVM"
		};
		
		String def = "";
		for (String w : wordsArr) {
			words.put(w, def);
		}
		
		return words;
	}
}
