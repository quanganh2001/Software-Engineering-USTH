package tute04_1_progtrio.xref.i1;
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
	private List<line> lines;
	
	/**
	 * @effects
	 * 	if doc is not a text document
	 * 		throw NotPossibleException
	 * 	else
	 * 		initialise this with words in doc
	 */
	public Document(String doc) throws NotPossibleException;
	
	/**
	 * @effects
	 * 	return a Set of words in this containing more than one letter and
	 * 	the lines where they appear
	 * 	(e.g. complier: 3, 17, 25...)
	 */
	public Set wordLocations();
}
