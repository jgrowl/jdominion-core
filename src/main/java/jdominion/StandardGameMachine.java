package jdominion;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import jdominion.card.Card;
import jdominion.card.CardMerchant;
import jdominion.condition.Condition;
import jdominion.state.State;

import java.util.List;

public class StandardGameMachine implements GameMachine {

	private State state;

	private CardMerchant cardMerchant;

	private List<Player> players;

	private int currentPlayerIndex;

    private Condition endingConditions;

    @Inject
	private StandardGameMachine(@Assisted List<Player> players,
                                @Assisted CardMerchant cardMerchant,
                                @Assisted Condition endingConditions) {
        if(players.size() <= 0) {
            throw new IllegalArgumentException("Cannot create a game with no players.");
        }
		this.cardMerchant = cardMerchant;
		this.players = players;
        this.endingConditions = endingConditions;
	}

	public boolean areEndingConditionsSatisfied() {
		return endingConditions.isSatisfied();
	}

	public void buyCard(Card card) {
		state.buyCard(this, card);
	}

	public void changePlayer() {
		currentPlayerIndex = getNextPlayerIndex();
	}

	public int getNextPlayerIndex() {
		int nextPlayerIndex = currentPlayerIndex + 1;
		return nextPlayerIndex >= players.size() ? 0 : nextPlayerIndex;
	}

	public void endTurn() {
		state.endTurn(this);
	}

	public Player getCurrentPlayer() {
		return players.get(currentPlayerIndex);
	}

	public State getState() {
		return state;
	}

	public void playCardAtIndex(int cardIndex) {
		state.playCardAtIndex(this, cardIndex);
	}

	public void setState(State state) {
		this.state = state;
	}

}
