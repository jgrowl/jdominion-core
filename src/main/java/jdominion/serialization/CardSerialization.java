package jdominion.serialization;

import jdominion.card.Card;

import java.io.Reader;


public class CardSerialization {

	public static Card deserializeCard(Reader cardReader,
			Serialization serialization) throws Exception {
		return serialization.deserialize(Card.class, cardReader);
	}

}
