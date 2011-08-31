package jdominion.serialization;

import jdominion.card.Card;

import java.io.File;
import java.io.Reader;
import java.io.Writer;


public class CardSerializationHelper {

    public static Card deserializeCard(Class<? extends Card> cardClass,
                                       Reader cardReader,
                                       Serialization serialization) throws Exception {
        return serialization.deserialize(Card.class, cardReader);
    }

    public static Card deserializeCard(Class<? extends Card> cardClass,
                                       File cardFile,
                                       Serialization serialization) throws Exception {
        return serialization.deserialize(cardClass, cardFile);
    }


    public static void serializeCard(Card card,
                                     Writer cardWriter,
                                     Serialization serialization) throws Exception {
        serialization.serialize(card, cardWriter);
    }

    public static void serializeCard(Card card,
                                     File cardFile,
                                     Serialization serialization) throws Exception {
       serialization.serialize(card, cardFile);
    }

}
