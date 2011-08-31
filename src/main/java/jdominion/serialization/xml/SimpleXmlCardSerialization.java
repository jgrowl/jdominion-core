package jdominion.serialization.xml;

import jdominion.card.Card;
import jdominion.serialization.CardSerialization;
import jdominion.serialization.Serialization;

import java.io.File;

/**
 * User: jonathan
 * Date: 8/28/11
 * Time: 5:43 PM
 */
public class SimpleXmlCardSerialization implements CardSerialization {

    private Serialization serialization = new SimpleXmlSerialization();

    public void serializeCard(File file) throws Exception {
        serialization.serialize(SimpleXmlSerializableCard.class, file);
    }

    public Card deserializeCard(File file) throws Exception {
        return serialization.deserialize(SimpleXmlSerializableCard.class, file);
    }

}
