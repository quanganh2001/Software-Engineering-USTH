//========== STRING INT MAP CLASS DESIGN (StringIntMap.java) ==========
package tute01a_design.ex6;

import java.util.Vector;

import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType;
import utils.collections.Collection;

public class StringIntMap implements Collection {
	@DomainConstraint(type="Vector",optional=false)
	private Vector<Object[]> entries;
	
	public StringIntMap()
	
	@DOpt(type=OptType.MutatorAdd)
	public boolean add(String s, int i)
	
	@DOpt(type=OptType.MutatorRemove)
	public boolean remove(String s, int i)
	
	public StringIntMap lookup(String s, int i)
	
	public StringIntMap lookup(String s)
	
	public StringIntMap lookup(int i)
	
	@DOpt(type=OptType.ObserverContains)
	public boolean isIn(String s, int i)
	
	@DOpt(type=OptType.Observer)
	public Object[][] getEntries()
	
	@DOpt(type=OptType.ObserverSize)
	public int size()
	
	@Override
	public String toString()
	
	@Override
	public boolean equals(Object o)
	
	public boolean repOK()
}
