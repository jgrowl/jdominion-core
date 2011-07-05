package jdominion;

import jdominion.card.CardMerchant;
import jdominion.condition.ExceededAllowedNumberOfDepletedPilesCondition;
import jdominion.factory.JDominionFactory;
import org.junit.Test;
import static org.junit.Assert.*;

import static jdominion.TestHelper.*;

/**
 * User: jonathan
 * Date: 4/4/11
 * Time: 8:18 PM
 */
public class GameMachineTest {

    @Test(expected = IllegalArgumentException.class)
    public void cannotCreateGameMachineWithNoPlayers() {
        JDominionFactory.createGameMachine(getAnonymousPlayers(0),
                getAnonymousCardMerchant(),
                getAnonymousCondition(),
                getAnonymousCardPile());
    }

    @Test
    public void gameEndsWhenNumberOfAllowedDepletedPilesIsExceeded() {
        CardMerchant depletedCardMerchant = getDepletedCardMerchant();

        GameMachine gameMachine = JDominionFactory.createGameMachine(getAnonymousPlayers(),
                depletedCardMerchant,
                new ExceededAllowedNumberOfDepletedPilesCondition(depletedCardMerchant, 0),
                getEmptyCardPile());
        assertTrue(gameMachine.areEndingConditionsSatisfied());
    }

    @Test
    public void gameDoesNotEndWhenNumberOfAllowedDepletedPilesIsNotExceeded() {
        CardMerchant anonymousCardMerchant = getAnonymousCardMerchant();

        GameMachine gameMachine = JDominionFactory.createGameMachine(getAnonymousPlayers(),
                anonymousCardMerchant,
                new ExceededAllowedNumberOfDepletedPilesCondition(anonymousCardMerchant, 1),
                getEmptyCardPile());

        assertFalse(gameMachine.areEndingConditionsSatisfied());
    }

    @Test(expected = IllegalArgumentException.class)
    public void cannotCreateCardMerchantWithEmptyCardPileMap() {
        JDominionFactory.createCardMerchant(getEmptyCardPileMap());
    }

}
