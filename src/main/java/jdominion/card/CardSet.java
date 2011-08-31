package jdominion.card;

import java.util.List;

/**
 * User: jonathan
 * Date: 7/30/11
 * Time: 10:27 PM
 */
public interface CardSet {

    public String getName();

    public void setName(String name);

    public List<Card> getCards();

    public void setCards(List<Card> cards);
}
