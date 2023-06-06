//========== RATIONAL CLASS (Rat.java) ==========

package tute01a_design.ex8;
import utils.DomainConstraint;
import utils.NotPossibleException;

public class Rat {
	@DomainConstraint(type="Integer",optional=false)
	private int num;
	
	@DomainConstraint(type="Integer",optional=false)
	private int denom;
	
	// not formal attributes, added because of reduce()
	private Integer rNum; // reduced value of num
	private Integer rDenom; // reduced value of denom
	
	public Rat(int n, int d) throws NotPossibleException
	
	public void add(Rat r)
	
	public void sub(Rat r)
	
	public boolean equals(Rat r)
	
	private void reduce()
	
	private int gcd(int x, int y)
	
	@Override
	public String toString()
	
	public boolean repOK()
	
	private boolean validateDenom(int denom)
}
