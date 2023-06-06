package tute04_2.progtrio.xref;

import java.util.List;
import java.util.Map;

import utils.NotPossibleException;

/**
 * @overview
 * 	Represents a document
 * 
 * @author Duc Minh Le (ducmle)
 * 
 * @version
 */
public class Document {
	
	// TODO: add @DomainConstraint
	private List<Line> lines;
	
	// TODO: add @DomainConstraint
	private String doc;
	
	// TODO: add @DomainConstraint
	private Map<Word,List<Line>> wordLocations;
	
	/**
	 * @effects
	 * 	if doc is not a text document
	 * 		throws NotPossibleException
	 * 	else
	 * 		initialise this with words in doc
	 */
	public Document(String doc) throws NotPossibleException {
		
	}
	
	/**
	 * @effects
	 * 	if this.wordLocations have not been extracted
	 * 		create a Map of words in this containing more than one letter and
	 * 		the lines where they appear (e.g. complier: 3, 17, 25,...)
	 * 		record result in this.wordLocations
	 * 
	 * 	return this.wordLocations
	 */
	public Map<Word,List<Line>> wordLocations() {
		
	}
	
}
