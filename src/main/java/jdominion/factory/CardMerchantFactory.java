package jdominion.factory;

import jdominion.card.Card;
import jdominion.card.CardMerchant;
import jdominion.card.CardPile;

import java.util.Map;

/**
 * User: jonathan
 * Date: 3/27/11
 * Time: 10:06 PM
 */
public interface CardMerchantFactory {

    public CardMerchant createCardMerchant(Map<Card, CardPile> cardPiles);

}
