package jdominion.factory;

import com.google.inject.Inject;
import com.google.inject.Injector;
import jdominion.condition.Condition;
import jdominion.GameMachine;
import jdominion.Player;
import jdominion.card.Card;
import jdominion.card.CardMerchant;
import jdominion.card.CardPile;
import jdominion.state.ActionPhaseState;
import jdominion.state.BuyPhaseState;

import java.util.List;
import java.util.Map;

/**
 * User: jonathan
 * Date: 3/6/11
 * Time: 4:48 PM
 */
public class JDominionFactory {

    @Inject
    private static StateFactory stateFactory;

    @Inject
    private static GameMachineFactory gameMachineFactory;

    @Inject
    private static CardMerchantFactory cardMerchantFactory;

    @Inject
    private static PlayerFactory playerFactory;

    @Inject
    private static CardFactory cardFactory;

    static {
        Injector injector = InjectorFactory.getInjector();
        stateFactory = injector.getInstance(StateFactory.class);
        gameMachineFactory = injector.getInstance(GameMachineFactory.class);
        cardMerchantFactory = injector.getInstance(CardMerchantFactory.class);
        playerFactory = injector.getInstance(PlayerFactory.class);
        cardFactory = injector.getInstance(CardFactory.class);
    }

    public static ActionPhaseState createActionPhaseState(Player currentPlayer,
                                                          CardMerchant cardMerchant) {
        return stateFactory.createActionPhaseState(currentPlayer, cardMerchant);
    }

    public static BuyPhaseState createBuyPhaseState(Player currentPlayer,
                                                    CardMerchant cardMerchant) {
        return stateFactory.createBuyPhaseState(currentPlayer, cardMerchant);
    }
//
//    public static FinishedState createFinishedState() {
//        return null;
//
//    }

    public static GameMachine createGameMachine(List<Player> players,
                                                CardMerchant cardMerchant,
                                                Condition endingConditions,
                                                CardPile startingCardPile) {
        return gameMachineFactory.create(players, cardMerchant, endingConditions, startingCardPile);
    }

    public static CardMerchant createCardMerchant(Map<Card, CardPile> cardPiles) {
        return cardMerchantFactory.createCardMerchant(cardPiles);
    }

    public static Player createPlayer(CardPile deck,
                                      CardPile discardPile,
                                      CardPile hand,
                                      CardPile stage) {
        return playerFactory.createPlayer(deck, discardPile, hand, stage);
    }

    public static Card createCard(String path, String cardName) {
        return cardFactory.createCard(path, cardName);
    }

}
