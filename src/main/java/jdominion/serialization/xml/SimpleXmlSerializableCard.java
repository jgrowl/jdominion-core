package jdominion.serialization.xml;

import jdominion.card.Card;
import jdominion.card.CardType;
import jdominion.card.CardWrapper;
import jdominion.card.StandardCard;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Root;

import java.io.File;

/**
 * User: jonathan
 * Date: 4/6/11
 * Time: 8:45 PM
 */
@Root(name = "card")
@Default(DefaultType.PROPERTY)
public class SimpleXmlSerializableCard extends CardWrapper {

    public SimpleXmlSerializableCard(File cardFile) {

    }

    public SimpleXmlSerializableCard() {
        card = new StandardCard();
    }

    @Override
    public String toString() {
        return "SimpleXmlSerializableCard{" +
                "card=" + card +
                '}';
    }
}
