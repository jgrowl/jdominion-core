package jdominion.state;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import jdominion.GameMachine;
import jdominion.Player;
import jdominion.card.Card;
import jdominion.card.CardMerchant;
import jdominion.card.CardPile;
import jdominion.util.CardHelper;

public class BuyPhaseState extends PhaseState {

	private int coinsSpent;

    @Inject
	public BuyPhaseState(@Assisted Player currentPlayer, @Assisted CardMerchant cardMerchant) {
		super(currentPlayer, cardMerchant);
		coinsSpent = 0;
	}

	@Override
	public void buyCard(GameMachine gameMachine, Card card) {
		if (currentPlayer.getTotalBuys() <= 0) {
			throw new IllegalStateException(
					"Card cannot be bought when there are no more getBuys left.");
		}

		coinsSpent += card.getCost();
		Card purchasedCard = cardMerchant.buyCard(card, getCoinsLeft());

		currentPlayer.discardCard(purchasedCard);

		super.buyCard(gameMachine, card);
	}

	@Override
	public void endPhase(GameMachine gameMachine) {
		gameMachine.endTurn();
	}

	@Override
	public boolean hasCards(CardPile cardPile) {
		return false;
	}

	@Override
	public boolean hasPlays(CardPile cardPile) {
		return getRemaining(CardHelper.getNumberOfBuys(cardPile)) > 0;
	}

	@Override
	public boolean areEndPhaseConditionsMet() {
		return !hasPlays(currentPlayer.getStage())
				|| !hasCards(currentPlayer.getHand());
	}

	private int getCoinsLeft() {
		return currentPlayer.getTotalCoins() - coinsSpent;
	}
}
