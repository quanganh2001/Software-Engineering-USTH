package tute04_1_progtrio.xref.i2;

import java.util.List;
import java.util.Map;

import utils.NotPossibleException;

/**
 * @overview Represents a program that index a document to determine the lines in which each word appears
 *
 * @author Duc Minh Le (ducmle)
 * 
 * @version
 */
public class Xref {
	
	/**
	 * @effects starts an Xref running
	 */
	public static void main(String[] args);
	
	/**
	 * @effects
	 * 	if doc is not a text document
	 * 		throws NotPossbileException
	 * 	else
	 * 		for each word containing more than one letter,
	 * 		record the lines in which it appears (e.g. complier: 3, 17, 25)/
	 * 		Return the result.
	 * @pseudocode (validation of the design)
	 * 	initialise d = Document(doc)
	 * 	Map<Word,List<Line>> wm = d.wordLocations()
	 * 	convert wm to Map<Word,List<Integer>>
	 * 	return the result
	 */
	Map<Word, List<Integer>> indexDocument(String doc) throws NotPossibleException;
}
