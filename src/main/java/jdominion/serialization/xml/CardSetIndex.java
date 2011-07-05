package jdominion.serialization.xml;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
public class CardSetIndex {
	
	@ElementList
	private List<CardSets> cardSets;

	public List<CardSets> getCardSets() {
		return cardSets;
	}

	public void setCardSets(List<CardSets> cardSets) {
		this.cardSets = cardSets;
	}
	
}
