package tute05_6.progtrio.xref1sol;

import java.util.List;
import java.util.Map;

/**
 * @overview A program to index a document listing its words and the lines where 
 * 			they appear.
 * 
 * @attributes
 * 
 * @object
 * 
 * @abstract_properties
 * 
 * @author dmle
 * 
 */
public class Xref {
	public Xref() {
		//
	}
	
	/**
	 * @effects
	 * 	if doc is empty
	 * 		return null
	 * 	else
	 * 		for each word w containing more than one letter
	 * 			find the lines of doc where w appears
	 * 		return words and lines in a Set
	 */
	public Map<String,List<Line>> indexDocument(String docStr) {
		// TODO: implement this
		Document doc = new Document(docStr);
		
		return doc.wordLocations();
	}
}
