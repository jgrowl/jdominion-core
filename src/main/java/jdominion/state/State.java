package jdominion.state;

import jdominion.GameMachine;
import jdominion.card.Card;

/**
 * Represents the dominion game state.
 * 
 * @author jonathan
 * 
 */
public interface State {

	public void buyCard(GameMachine gameMachine, Card card);

	public void playCardAtIndex(GameMachine gameMachine, int cardIndex);

	public void endTurn(GameMachine gameMachine);

}
