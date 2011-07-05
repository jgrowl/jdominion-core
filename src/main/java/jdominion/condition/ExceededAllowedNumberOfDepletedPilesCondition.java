package jdominion.condition;

import jdominion.card.CardMerchant;

/**
 * User: jonathan
 * Date: 3/29/11
 * Time: 9:45 PM
 */
public class ExceededAllowedNumberOfDepletedPilesCondition implements Condition {

    private CardMerchant cardMerchant;

    private int depletedPileLimit;

    public ExceededAllowedNumberOfDepletedPilesCondition(CardMerchant cardMerchant, int depletedPileLimit) {
        this.cardMerchant = cardMerchant;
        this.depletedPileLimit = depletedPileLimit;
    }

    public boolean isSatisfied() {
        return cardMerchant.getNumberOfDepletedPiles() >= depletedPileLimit;
    }

}
