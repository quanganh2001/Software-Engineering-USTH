/* Line.java */
package tute04.progtrio.xref;

import java.util.Iterator;
import java.util.List;

import utils.AttrRef;
import utils.DOpt;
import utils.OptType;

public class Line {
	private int lineNo;
	
	private List<Word> words;
	
	public Line(int lineNo) {
		this.lineNo = lineNo;
	}
	
	@DOpt(type=OptType.MutatorAdd)
	public void addWord() {
		
	}
	
	@DOpt(type=OptType.MutatorRemove)
	public void removeWord() {
		
	}
	
	@DOpt(type=OptType.ObserverIterator)
	public Iterator<Word> words() {
		
	}
	
	@DOpt(type=OptType.Observer)
	@AttrRef("lineNo")
	public int getLineNo() {
		return lineNo;
	}
}
