package jdominion;

import jdominion.card.Card;
import jdominion.state.State;

public interface GameMachine {

	public boolean areEndingConditionsSatisfied();

	public void buyCard(Card card);

	public void changePlayer();

	public void endTurn();

	public Player getCurrentPlayer();

	public State getState();

	public void playCardAtIndex(int cardIndex);

	public void setState(State state);

}
