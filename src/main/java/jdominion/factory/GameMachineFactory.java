package jdominion.factory;

import jdominion.card.CardPile;
import jdominion.condition.Condition;
import jdominion.GameMachine;
import jdominion.Player;
import jdominion.card.CardMerchant;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jonathan
 * Date: 3/6/11
 * Time: 5:07 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GameMachineFactory {

    public GameMachine create(List<Player> players,
                              CardMerchant cardMerchant,
                              Condition endingConditions,
                              CardPile startingCardPile);

}
