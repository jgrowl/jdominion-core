package jdominion.state;

import jdominion.GameMachine;
import jdominion.Player;
import jdominion.card.CardMerchant;
import jdominion.factory.JDominionFactory;

public abstract class PlayState extends SimpleState {

	protected Player currentPlayer;

	protected CardMerchant cardMerchant;

	public PlayState(Player currPlayer, CardMerchant cardMerchant) {
		this.currentPlayer = currPlayer;
		this.cardMerchant = cardMerchant;
	}

	@Override
	public void endTurn(GameMachine gameMachine) {
		if (gameMachine.areEndingConditionsSatisfied()) {
			gameMachine.setState(new FinishedState());
		} else {
			currentPlayer.discard();
			gameMachine.changePlayer();
			gameMachine.setState(JDominionFactory.createBuyPhaseState(gameMachine
					.getCurrentPlayer(), cardMerchant));
		}
	}

}
