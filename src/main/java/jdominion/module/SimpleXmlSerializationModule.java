package jdominion.module;

import com.google.inject.AbstractModule;
import jdominion.card.Card;
import jdominion.serialization.CardSerialization;
import jdominion.serialization.Serialization;
import jdominion.serialization.xml.SimpleXmlCardSerialization;
import jdominion.serialization.xml.SimpleXmlSerializableCard;
import jdominion.serialization.xml.SimpleXmlSerialization;

/**
 * User: jonathan
 * Date: 2/28/11
 * Time: 8:28 PM
 */
public class SimpleXmlSerializationModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Card.class).to(SimpleXmlSerializableCard.class);
        bind(Serialization.class).to(SimpleXmlSerialization.class);
        bind(CardSerialization.class).to(SimpleXmlCardSerialization.class);
    }

}
