package jdominion.state;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import jdominion.GameMachine;
import jdominion.Player;
import jdominion.card.CardMerchant;
import jdominion.card.CardPile;
import jdominion.factory.JDominionFactory;
import jdominion.util.CardHelper;

public class ActionPhaseState extends PhaseState {

    @Inject
	public ActionPhaseState(@Assisted Player currentPlayer, @Assisted CardMerchant cardMerchant) {
		super(currentPlayer, cardMerchant);
	}

	@Override
	public void playCardAtIndex(GameMachine gameMachine, int cardIndex) {
		if (getRemaining(gameMachine.getCurrentPlayer().getTotalActions()) <= 0) {
			throw new IllegalStateException(
					"Card cannot be played when there are no more getActions left.");
		}
		// throw error if the card is not an action card

		currentPlayer.playCard(cardIndex);
		used++;
		super.playCardAtIndex(gameMachine, cardIndex);
	}

	@Override
	public void endPhase(GameMachine gameMachine) {
		gameMachine.setState(JDominionFactory.createActionPhaseState(currentPlayer, cardMerchant));
	}

	@Override
	public boolean hasCards(CardPile cardPile) {
		return CardHelper.getNumberOfActionCards(cardPile) > 0;
	}

	@Override
	public boolean hasPlays(CardPile cardPile) {
		return getRemaining(CardHelper.getNumberOfActions(cardPile)) > 0;
	}

	@Override
	public boolean areEndPhaseConditionsMet() {
		return !hasPlays(currentPlayer.getStage())
				|| !hasCards(currentPlayer.getHand());
	}

}
