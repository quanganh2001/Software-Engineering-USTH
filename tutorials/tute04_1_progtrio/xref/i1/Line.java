package tute04_1_progtrio.xref.i1;

import java.util.List;

import utils.DOpt;
import utils.OptType;

/**
 * @overview
 * 	Represents a line in a document
 * 
 * @author Duc Minh Le (ducmle)
 * 
 * @version
 */
public class Line {
	// TODO: add @DomainConstraint
	private int lineNo;
	
	// TODO: add @DomainConstraint
	private List<Word> words;
	
	@DOpt(type = OptType.MutatorAdd)
	public void addWord();
	
	@DOpt(type = OptType.MutatorRemove)
	public void removeWord();
	
	// TODO: add other essential methods (observercontains, observersize, ...)
}
