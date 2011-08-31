package jdominion;

import jdominion.card.Card;
import jdominion.state.State;

/**
 * User: jonathan
 * Date: 8/28/11
 * Time: 7:04 PM
 */
public class GameMachineWrapper {

    private GameMachine gameMachine;

    public GameMachineWrapper(GameMachine gameMachine) {
        this.gameMachine = gameMachine;
    }

    public boolean areEndingConditionsSatisfied() {
        return gameMachine.areEndingConditionsSatisfied();
    }

    public void buyCard(Card card) {
        gameMachine.buyCard(card);
    }

    public void changePlayer() {
        gameMachine.changePlayer();
    }

    public void endTurn() {
        gameMachine.endTurn();
    }

    public Player getCurrentPlayer() {
        return gameMachine.getCurrentPlayer();
    }

    public State getState() {
        return gameMachine.getState();
    }

    public void playCardAtIndex(int cardIndex) {
        gameMachine.playCardAtIndex(cardIndex);
    }

}
