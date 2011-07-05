package jdominion.util;

import jdominion.condition.CompoundCondition;
import jdominion.condition.Condition;
import jdominion.condition.ExceededAllowedNumberOfDepletedPilesCondition;
import jdominion.card.CardMerchant;

import java.util.ArrayList;
import java.util.List;

/**
 * User: jonathan
 * Date: 4/2/11
 * Time: 6:03 PM
 */
public class GameHelper {

    private static int DEPLETED_PILE_LIMIT = 3;

    public static CompoundCondition getStandardEndingCondition(CardMerchant cardMerchant) {
        List<Condition> conditions = new ArrayList<Condition>(2);
        conditions.add(new ExceededAllowedNumberOfDepletedPilesCondition(cardMerchant, DEPLETED_PILE_LIMIT));
//        conditions.add(new DepleetedPileCondition(cardMerchant, null));

        return new CompoundCondition(conditions);
    }
}
