package tute02_th;

import java.util.ArrayList;

import utils.Tool;

/**
 * @overview Implements a sub-type of <code>List</code> that has methods for
 * 			returning smallest and largest elements of the list
 * 
 * @author dmle
 */
public class Ex1SolutionA {
	/**
	 * A method to run the exercise
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Tool.print("Exercise " + Ex1SolutionA.class.getSimpleName());
		
		int[] nums = { 1, 5, 3, 2, 7, 9, 10, 4 }; // {8};
		Tool.printArray("nums", nums);
		
		// create list
		MaxMinIntList l = new MaxMinIntList();
		
		for (int i = 0; i < nums.length; i++) {
			l.add(new Integer(nums[i]));
		}
		
		Tool.print("l", l);
		Tool.print("rep? ", l.repOK());
		Tool.print("card", l.size());
		Tool.print("max", l.getLargest());
		Tool.print("min", l.getSmallest());
	}
}

/**
 * @overview MaxMinIntList is a sub-type of ArrayList
 * 			 that has methods to return the smallest and largest elements of a 
 * 			 list.
 * @attributes
 * 	smallest	Integer
 * 	largest		Integer
 * 
 * @abstract_properties
 * 	P_ArrayList /\
 * 	  mutable(smallest)=false /\ optional(smallest)=true /\
 * 	  mutable(largest)=false /\ optional(smallest)=true /\
 * 	  size(super.elements) > 0 ->
 * 		for all x in super.elements. x is Integer
 * 	  smallest is in super.elements /\
 * 	  largest is in super.elements /\
 *    size(super.elements) > 0 ->
 *    	(for all x in super.elements. (smallest <= x /\ x <= largest))
 *    
 * @author dmle
 * 
 */
class MaxMinIntList extends ArrayList {
	private Integer smallest;
	private Integer largest;
	
	// constructor: may be omitted
	public MaxMinIntList() {
	}
	
	/**
	 * @requires <code>x</code> is <code>Integer</code>
	 */
	@Override
	public boolean add(Object x) {
		boolean ok = super.add(x);
		
		if (ok) {
			// update largest, smallest
			updateMinMax((Integer) x);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @requires <code>x</code> is <code>Integer</code>
	 */
	@Override
	public boolean remove(Object x) {
		boolean ok = super.remove(x);
		
		if (ok) {
			// update largest, smallest
			updateMinMax((Integer) x);
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public Object remove(int index) {
		Object removed = super.remove(index);
		
		if (removed != null) {
			updateMinMax((Integer) removed);
		}
		
		return removed;
	}
	
	/**
	 * @effects
	 * 	update smallest and largest based on x
	 * @requires x != null
	 */
	private void updateMinMax(Integer x) {
		if (smallest == null || smallest.compareTo(x) > 0)
			smallest = x;
		
		if (largest == null || largest.compareTo(x) < 0)
			largest = x;
	}
	
	/**
	 * @effects
	 * 	return smallest
	 */
	public Integer getSmallest() {
		return smallest;
	}
	
	/**
	 * @effects
	 * 	return largest
	 */
	public Integer getLargest() {
		return largest;
	}
	
	/**
	 * @effects
	 * 	if this satisfies abstract properties
	 * 		return true
	 * 	else
	 * 		return false
	 */
	public boolean repOK() {
		int sz = size();
		// if (size() == 0)
		//   return false;
		
		if (sz > 0 && (smallest == null || largest == null))
			return false;
		
		boolean minCheck = false;
		boolean maxCheck = false;
		
		// Could also use a for loop using index
		// check existence of min, max
		for (Object f : this) {
			if (!minCheck && f.equals(smallest))
				minCheck = true;
			
			if (!maxCheck && f.equals(largest))
				maxCheck = true;
			
			if (minCheck && maxCheck)
				break;
		} // end while
		
		if ((smallest != null && !minCheck) ||
		    (largest != null && !maxCheck))
		    return false;
		
		// check min, max
		Integer c;
		for (Object f : this) {
			if (!(f instanceof Integer))
				return false;
			
			c = (Integer) f;
			if (c.compareTo(smallest) < 0)
				return false;
			
			if (c.compareTo(largest) > 0)
				return false;
		}
		
		return true;
	}
	
} // end MaxMinIntList
