package tute05_6.progtrio.spellchecker2sol;

import java.util.Map;

import utils.DomainConstraint;
import utils.NotPossibleException;

/**
 * @overview
 * 	Represents a dictionary in some language.
 * 
 * @attributes
 * 	name	String
 * 	words	Map<String,String>
 * 
 * @object
 * 
 * @abstract_properties
 * 	mutable(name)=false /\ optional(name)=false /\
 * 	mutable(words)=true /\ optional(words)=false
 * 
 * @author dmle
 */
public class Dictionary {
	@DomainConstraint(type="String",mutable=false,optional=false)
	private String name;
	@DomainConstraint(type="Map",mutable=true,optional=false)
	private Map<String,String> words;
	
	/**
	 * @effects
	 * 	if name and words are valid
	 * 		set this.name = lang
	 * 		add words to this.words
	 * 	else
	 * 		throws NotPossibleException
	 */
	public Dictionary(String name, Map<String,String> words) throws NotPossibleException {
		// TODO: implement this
		this.name = name;
		this.words = words;
	}
	
	/**
	 * @effects
	 * 	if w is found in this
	 * 		return true
	 * 	else
	 * 		return false
	 */
	public boolean lookUp(String w) {
		// TODO: implement this
		return words.containsKey(w);
	}
}
