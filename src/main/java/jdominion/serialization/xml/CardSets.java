package jdominion.serialization.xml;

import org.simpleframework.xml.ElementMap;

import java.util.Map;


public class CardSets {
	
	@ElementMap
	private Map<String, CardSet> cards;
	
}
