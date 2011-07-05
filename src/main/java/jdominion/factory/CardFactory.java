package jdominion.factory;

import jdominion.card.Card;

/**
 * User: jonathan
 * Date: 3/28/11
 * Time: 9:35 PM
 */
public interface CardFactory {

    /**
     * Creates a card by a given card name.
     *
     * @param cardName
     * @return
     */
    public Card createCard(String path, String cardName);

}
