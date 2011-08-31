package jdominion.card;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * User: jonathan
 * Date: 3/27/11
 * Time: 10:03 PM
 */
public class StandardCardMerchant implements CardMerchant {

    /**
     * The card piles available.
     */
    private Map<Card, CardPile> cardPiles;

    /**
     * Constructor requires injection of the card piles.
     *
     * @param cardPiles
     */
    @Inject
    private StandardCardMerchant(@Assisted Map<Card, CardPile> cardPiles) {
        if(cardPiles.isEmpty()) {
            throw new IllegalArgumentException("Cannot create empty card merchant.");
        }
        this.cardPiles = cardPiles;
    }

    /**
     * Gets all available getCards currently in stock.
     *
     * @return
     */
    public List<Card> getCardsInStock() {
        return getCardsInStockForCoins(Integer.MAX_VALUE);
    }

    /**
     * Gets all available getCards currently in stock that could be bought for a
     * given price.
     *
     * @param coins
     *            The amount that is available to spend
     *
     * @return A list of getCards that could be bought given a specified maximum
     *         amount.
     */
    public List<Card> getCardsInStockForCoins(int coins) {
        List<Card> cardsInStock = new ArrayList<Card>();
        for (Card cardForSale : getCardsForSale()) {
            if (cardForSale.getCost() <= coins) {
                cardsInStock.add(cardForSale);
            }
        }

        return cardsInStock;
    }

    /**
     * Buys a card
     *
     * @param card
     *            The card to be bought.
     *
     * @return The card bought.
     */
    public Card buyCard(Card card, int coins) {
        if (coins < card.getCost()) {
            throw new IllegalArgumentException(
                    "Card cannot be bought when there are not enough getCoins left.");
        }

        return cardPiles.get(card).drawCard();
    }

    public List<Card> getCardsForSale() {
        List<Card> cards = new ArrayList<Card>();
        for (Map.Entry<Card, CardPile> entry : cardPiles.entrySet()) {
            CardPile cardPiles = entry.getValue();
            Card card = entry.getKey();
            if (cardPiles.hasCards()) {
                cards.add(card);
            }
        }

        return cards;
    }

    public int getNumberOfDepletedPiles() {
        return getCardsForSale().size() - getCardsInStock().size();
    }
}
