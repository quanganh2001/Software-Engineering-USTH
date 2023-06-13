package tute05_6.progtrio.xref1sol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.DomainConstraint;

/**
 * @overview
 * 	Represent a text document
 * 
 * @attributes
 * 	wmap Map<String,List<Line>>
 * 
 * @object
 * 
 * @abstract_properties
 * 	mutable(wmap) = true /\ optional(wmap) = true /\
 * 	size(wmap) > 0 ->
 * 		(for each (w,l) in map.
 * 			w.length > 1 /\
 * 			l is List<Line> /\ size(l) > 0 /\
 * 		(for all (w,l), (w',l') in wmap. equals(w,w') = false)
 * 
 * @author dmle
 *
 */
public class Document {
	@DomainConstraint(type="Map",mutable=true,optional=true)
	private Map<String,List<Line>> wmap;
	
	/**
	 * @requires
	 * 	doc != null
	 * @effects
	 * 	if doc is empty
	 * 		initialise this.wmap to contain all entries (w,l) where
	 * 			w.length > 1 AND size(l) > 0 AND
	 * 			for all Line i in l. w appears at line ith in document
	 */
	public Document(String doc) {
		// TODO: implement this
		doc = doc.trim();
		final String linesep = System.getProperty("line.separator");
		final String wordsep = "\\s";
		if (!doc.isEmpty()) {
			
			String[] lines = doc.split(linesep);
			String line; Line lineObj;
			String[] words;
			String w;
			for (int lineno = 0; lineno < lines.length; lineno++) {
				line = lines[lineno].trim();
				if (line.isEmpty()) // empty line
					continue;
				
				int llineno = lineno+1; // line numbers start from 1
				lineObj = new Line(llineno);
				
				words = line.split(wordsep);
				
				for (int j = 0; j < words.length; j++) {
					w = words[j];
					if (w.length() == 1) // single char
						continue;
					w = canon(w);
					if (wmap == null)
						wmap = new HashMap<>();
					List<Line> wlines = wmap.get(w);
					if (wlines == null) {
						wlines = new ArrayList<>();
						wmap.put(w, wlines);
					}
					if (!wlines.contains(lineObj)) // unique
						wlines.add(lineObj);
				}
			}
		}
	}
	
	/**
	 * @effects returns the canonicalised form of w
	 */
	private String canon(String w) {
		String[] specials = {",", ".", ":", ";", "!", "?", "[", "]", "(", ")"};
		w = w.trim();
		
		for (String s : specials) {
			if (w.startsWith(s))
				w = w.substring(1);
			if (w.endsWith(s))
				w = w.substring(0,w.length()-1);
		}
		
		return w;
	}
	
	/**
	 * @effects
	 * 	if wmap is null
	 * 		return null
	 * 	else
	 * 		return Map<String,List<Line>> in wmap
	 */
	public Map<String,List<Line>> wordLocations() {
		//TODO: implement this
		return wmap;
	}
}
