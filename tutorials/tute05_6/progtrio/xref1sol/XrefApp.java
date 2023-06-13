package tute05_6.progtrio.xref1sol;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import utils.fileio.FileHandler;

// import exer.ch14.fileio.FileHandler;

/**
 * @overview
 * 	A program that uses Xref
 * 
 * @author dmle
 */
public class XrefApp {
	/**
	 * @effects
	 * 	Read a document from file
	 * 	Initialise Xref
	 * 	Index the document
	 * 	Print the word index
	 */
	public static void main(String[] args) {
		// Read a document from file
		String docFileName = "complier.txt";
		String docFilePath = XrefApp.class.getResource(docFileName).getPath();
		
		String docStr = FileHandler.getFile(docFilePath);
		
		// Initialise Xref
		Xref xref = new Xref();
		
		// Index the document
		Map<String,List<Line>> wordIndex = xref.indexDocument(docStr);
		
		// Print the word index
		if (wordIndex == null) {
			// TODO: print "empty"
			System.out.println("Document is empty or does not contain indexable words");
		} else {
			// TODO: print each entry in wordIndex as required
			for (Entry<String,List<Line>> e : wordIndex.entrySet()) {
				String word = e.getKey();
				List<Line> lines = e.getValue();
				
				System.out.println(word + ": " + lines);
			}
		}
	}
}
