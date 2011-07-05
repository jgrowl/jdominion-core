package jdominion.condition;

import jdominion.card.Card;
import jdominion.card.CardMerchant;

/**
 * User: jonathan
 * Date: 4/2/11
 * Time: 5:48 PM
 */
public class DepletedPileCondition implements Condition {

    private CardMerchant cardMerchant;

    private Card card;

    public DepletedPileCondition(CardMerchant cardMerchant, Card card) {
        this.cardMerchant = cardMerchant;
        this.card = card;
    }

    public boolean isSatisfied() {
        return this.cardMerchant.getCardsInStock().contains(card);
    }
}
