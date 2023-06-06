package tute04_1_progtrio.xref.i2;

/**
 * @overview
 * 	Represents a word
 * 
 * @author Duc Minh Le (ducmle)
 * 
 * @version
 */
public class Word {
	
	// TODO: add @DomainConstraint
	private String label;
	
	/**
	 * @effects
	 * 	if content is valid (i.e. length > 1)
	 * 		initialise this with content
	 * 	else
	 * 		throw NotPossibleException
	 */
	public Word(String content) throws NotPossibleException;
}
