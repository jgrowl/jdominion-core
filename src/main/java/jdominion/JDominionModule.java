package jdominion;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import jdominion.card.Card;
import jdominion.card.CardMerchant;
import jdominion.card.StandardCard;
import jdominion.card.StandardCardMerchant;
import jdominion.factory.*;
import jdominion.state.ActionPhaseState;
import jdominion.state.BuyPhaseState;

/**
 * Created by IntelliJ IDEA.
 * User: jonathan
 * Date: 2/28/11
 * Time: 8:28 PM
 */
public class JDominionModule extends AbstractModule {

    @Override
    protected void configure() {

        install(new FactoryModuleBuilder()
                .implement(Card.class, StandardCard.class)
                .build(CardFactory.class));

        install(new FactoryModuleBuilder()
                .implement(ActionPhaseState.class, ActionPhaseState.class)
                .implement(BuyPhaseState.class, BuyPhaseState.class)
                .build(StateFactory.class));

        install(new FactoryModuleBuilder()
                .implement(GameMachine.class, StandardGameMachine.class)
                .build(GameMachineFactory.class));

        install(new FactoryModuleBuilder()
                .implement(CardMerchant.class, StandardCardMerchant.class)
                .build(CardMerchantFactory.class));

        install(new FactoryModuleBuilder()
                .implement(Player.class, StandardPlayer.class)
                .build(PlayerFactory.class));

    }

}
