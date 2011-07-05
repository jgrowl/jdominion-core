package jdominion.state;

import jdominion.GameMachine;
import jdominion.card.Card;

/**
 * Created by IntelliJ IDEA.
 * User: jonathan
 * Date: 2/28/11
 * Time: 8:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleState implements State {

    public void buyCard(GameMachine gameMachine, Card card) {
		throw new IllegalStateException(
				"Buying a card is not allowed at this time.");
	}

	public void playCardAtIndex(GameMachine gameMachine, int cardIndex) {
		throw new IllegalStateException(
				"Playing a card is not allowed at this time.");
	}

	public void endTurn(GameMachine gameMachine) {
		throw new IllegalStateException(
				"Ending the turn is not allowed at this time.");
	}
}

