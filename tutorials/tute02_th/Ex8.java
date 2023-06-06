package tute02_th;

import utils.DomainConstraint;

public class Ex8 {
	
	/**
	 * @overview <code>Counter</code> represents an integral counter, which
	 * 			 increments by one unit each time.
	 * @attributes
	 * 	val Integer
	 * @object
	 * 	A typical counter is c, where c is integer
	 * @abstract_properties
	 * 	mutable(val)=true /\ optional(val)=false /\ min(val)=0
	 * 
	 * @author dmle
	 * 
	 */
	class Counter {
		@DomainConstraint(type="Integer",min=0)
		private int val;
		
		/**
		 * Contructor method
		 * 
		 * @effects makes this contain 0
		 */
		public Counter() {
			val = 0;
		}
		
		/**
		 * @effects returns the value of <code>val</code>
		 */
		public int get() {
			return val;
		}
		
		/**
		 * @effects increments the value of <code>val</code>
		 */
		public void incr() {
			val++;
		}
	}
}
