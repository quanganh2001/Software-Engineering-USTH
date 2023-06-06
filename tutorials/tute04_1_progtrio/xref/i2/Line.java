package tute04_1_progtrio.xref.i2;

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
	
	/**
	 * @effects
	 * 
	 * @version
	 */
	public Line(int lineNo) {
		this.lineNo = lineNo;
	}
	
	@DOpt(type = OptType.MutatorAdd)
	public void addWord();
	
	@DOpt(type = OptType.MutatorRemove)
	public void removeWord();
	
	// TODO: add other essential methods (observercontains, observersize, ...)
	
	/**
	 * TODO
	 * @effects
	 * 
	 */
	@DOpt(type = OptType.ObserverIterator)
	public Iterator<Word> words;
	
	/**
	 * @effects return LineNo
	 */
	@DOpt(type = OptType.Observer) @AttrRef("lineNo")
	public int getLineNo() {
		return lineNo;
	}
}
