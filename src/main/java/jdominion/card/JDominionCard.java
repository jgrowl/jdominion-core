package jdominion.card;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import jdominion.serialization.CardSerialization;

import java.io.File;

/**
 * The point of this class is to construct what represents a logically complete
 * Dominion card. It will include the underlying card data (coins, buys,
 * actions, etc.) and an optional script associated with the card that performs
 * special abilities.
 *
 * User: jonathan
 * Date: 8/2/11
 * Time: 10:18 PM
 *
 */
public class JDominionCard extends CardWrapper {

    private static final String CARD_DESCRIPTION_FILE_NAME = "card";
    private static final String CARD_EFFECT_FILE_NAME = "effect";

    @Inject
    public JDominionCard(@Assisted File cardFolder, CardSerialization
            cardSerialization) throws Exception {

        File cardFile = new File(cardFolder, CARD_DESCRIPTION_FILE_NAME);
        card = cardSerialization.deserializeCard(cardFile);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("JDominionCard{");
        sb.append("CardWrapper");
        sb.append("{card=").append(card);
        sb.append('}');
        sb.append('}');
        return sb.toString();
    }

}
