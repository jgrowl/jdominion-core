package jdominion;

import jdominion.card.Card;
import jdominion.state.State;

import java.util.Observable;

/**
 * User: jonathan
 * Date: 3/19/11
 * Time: 8:13 PM
 */
public class ObservableGameMachine extends Observable implements GameMachine {

    private GameMachine mGameMachine;

    public ObservableGameMachine(GameMachine gameMachine) {
        mGameMachine = gameMachine;
    }

    public boolean areEndingConditionsSatisfied() {
        return mGameMachine.areEndingConditionsSatisfied();
    }

    public void buyCard(Card card) {
        mGameMachine.buyCard(card);
    }

    public void changePlayer() {
        mGameMachine.changePlayer();
    }

    public void endTurn() {
        mGameMachine.endTurn();
    }

    public Player getCurrentPlayer() {
        return mGameMachine.getCurrentPlayer();
    }

    public State getState() {
        return mGameMachine.getState();
    }

    public void playCardAtIndex(int cardIndex) {
        mGameMachine.playCardAtIndex(cardIndex);
    }

    public void setState(State state) {
        mGameMachine.setState(state);
        setChanged();
        notifyObservers(state);
    }

}
