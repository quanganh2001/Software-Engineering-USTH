//========== INT QUEUE CLASS DESIGN (IntQueue.java) ==========

package tute01a_design.ex7;

import java.util.Vector;

import utils.DomainConstraint;
import utils.DOpt;
import utils.NotPossibleException;
import utils.OptType;

public class IntQueue {
	@DomainConstraint(type="Vector",optional=false)
	private Vector<Integer> elements;
	
	@DomainConstraint(type="Integer",mutable=false,optional=false,min=1)
	private int maxSize;
	
	public IntQueue(int n) throws NotPossibleException
	
	@DOpt(type=OptType.MutatorAdd)
	public boolean enq(int x)
	
	@DOpt(type=OptType.MutatorRemove)
	public Integer deq()
	
	@DOpt(type=OptType.ObserverSize)
	public int size()
	
	public boolean isEmpty()
	
	public boolean isFull()
	
	public void clear()
	
	@Override
	public String toString()
	
	public boolean repOK()
}
