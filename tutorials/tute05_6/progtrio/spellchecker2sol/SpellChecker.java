package tute05_6.progtrio.spellchecker2sol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import utils.DomainConstraint;
import utils.NotPossibleException;

/**
 * @overview
 * 		A program that check mis-spelled words of a text document using
 * 		a dictionary
 * 
 * @attributes
 * 	dict	Dictionary
 * 
 * @object
 * 
 * @abstract_properties
 * 	mutable(dict)=true /\ optional(dict) = false
 * 
 * @author dmle
 */
public class SpellChecker {
	@DomainConstraint(type="Dictionary",mutable=true,optional=false)
	private Dictionary dict;
	
	/**
	 * @effects
	 * 	if dict is valid
	 * 		initialise this to contain dict
	 * 	else
	 * 		throws NotPossibleException
	 */
	public SpellChecker(Dictionary dict) throws NotPossibleException {
		// TODO: implement this
		if (dict == null) {
			throw new NotPossibleException("Dictionary must be specified");
		}
		
		this.dict = dict;
	}
	
	/**
	 * @requires
	 * 	lang is not null /\ doc is not null
	 * @effects
	 * 		for each word w in doc
	 * 			look up w in this.dict
	 * 		
	 * 		if some words not found in this.dict
	 * 			return all such words in an Iterator
	 * 		else
	 * 			return null
	 */
	public Iterator<String> checkSpelling(String doc) {
		// TODO: implement this
		Doc d = new Doc(doc);
		
		String[] words = d.words();
		List<String> nonWords = new ArrayList<>();
		for (String w : words) {
			if (!dict.lookUp(w)) {
				nonWords.add(w);
			}
		}
		
		if (nonWords.isEmpty()) {
			return null;
		} else {
			return nonWords.iterator();
		}
	}
}

