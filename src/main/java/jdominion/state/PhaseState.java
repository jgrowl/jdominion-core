package jdominion.state;

import jdominion.GameMachine;
import jdominion.Player;
import jdominion.card.Card;
import jdominion.card.CardMerchant;
import jdominion.card.CardPile;

public abstract class PhaseState extends PlayState {

	/**
	 * Represents the phase units used.
	 */
	protected int used;

	public abstract void endPhase(GameMachine gameMachine);

	public abstract boolean areEndPhaseConditionsMet();

	public abstract boolean hasPlays(CardPile cardPile);

	public abstract boolean hasCards(CardPile cardPile);

	public PhaseState(Player currentPlayer, CardMerchant cardMerchant) {
		super(currentPlayer, cardMerchant);
	}

	private void endPhaseIfEndPhaseConditionsMet(GameMachine gameMachine) {
		if (areEndPhaseConditionsMet()) {
			endPhase(gameMachine);
		}
	}

	@Override
	public void playCardAtIndex(GameMachine gameMachine, int cardIndex) {
		endPhaseIfEndPhaseConditionsMet(gameMachine);
	}

	@Override
	public void buyCard(GameMachine gameMachine, Card card) {
		endPhaseIfEndPhaseConditionsMet(gameMachine);
	}

	/**
	 * 
	 * @param total
	 * @return The remaining phase units left.
	 */
	protected int getRemaining(int total) {
		return total - used;
	}

}
