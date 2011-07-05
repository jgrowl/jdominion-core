package jdominion.serialization;

import jdominion.card.Card;
import jdominion.card.CardType;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Root;

import java.io.File;
import java.io.Reader;

/**
 * User: jonathan
 * Date: 4/6/11
 * Time: 8:45 PM
 */
@Root(name = "card")
@Default(DefaultType.PROPERTY)
public class SimpleXmlSerializableCard implements Card {

    private Card card;

    public SimpleXmlSerializableCard(Card card) {
        this.card = card;
    }

    public CardType getCardType() {
        return this.card.getCardType();
    }

    public String name() {
        return card.name();
    }

    public int cost() {
        return card.cost();
    }

    public int cards() {
        return card.cards();
    }

    public int actions() {
        return card.actions();
    }

    public int buys() {
        return card.buys();
    }

    public int coins() {
        return card.coins();
    }

    public int victoryPoints() {
        return card.victoryPoints();
    }

}
