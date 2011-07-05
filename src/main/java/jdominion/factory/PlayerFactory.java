package jdominion.factory;

import com.google.inject.assistedinject.Assisted;
import jdominion.Player;
import jdominion.card.CardPile;

/**
 * User: jonathan
 * Date: 4/4/11
 * Time: 8:51 PM
 */
public interface PlayerFactory {

    public Player createPlayer(@Assisted("deck") CardPile deck,
                               @Assisted("discardPile") CardPile discardPile,
                               @Assisted("hand") CardPile hand,
                               @Assisted("stage") CardPile stage);

}
