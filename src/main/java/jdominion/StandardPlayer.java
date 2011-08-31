package jdominion;

import com.google.inject.assistedinject.Assisted;
import jdominion.card.Card;
import jdominion.card.CardPile;

import javax.inject.Inject;

/**
 * User: jonathan
 * Date: 3/27/11
 * Time: 9:52 PM
 */
public class StandardPlayer implements Player {

    private CardPile deck;

    private CardPile discardPile;

    private CardPile hand;

    private CardPile stage;

    @Inject
    protected StandardPlayer(@Assisted("deck") CardPile deck,
                             @Assisted("discardPile") CardPile discardPile,
                             @Assisted("hand") CardPile hand,
                             @Assisted("stage") CardPile stage) {
        this.deck = deck;
        this.discardPile = discardPile;
        this.hand = hand;
        this.stage = stage;
    }

    public void discard() {
        discardPile.addCards(hand);
    }

    /**
     * Adds a given card to the players discard pile
     *
     * @param card
     */
    public void discardCard(Card card) {
        discardPile.addCard(card);
    }

    public int getTotalBuys() {
        int totalBuys = 1;
        for (Card card : hand) {
            totalBuys += card.getBuys();
        }

        return totalBuys;
    }

    public int getTotalActions() {
        int totalActions = 1;
        for (Card card : hand) {
            totalActions += card.getActions();
        }

        return totalActions;
    }

    public int getTotalCoins() {
        int totalCoins = 0;
        for (Card card : hand) {
            totalCoins += card.getCoins();
        }

        return totalCoins;
    }

    public void playCard(int cardIndex) {
        discardPile.addCard(hand.removeCard(cardIndex));
    }

    public void buyCard(Card card) {
        discardPile.addCard(card);
    }

    public CardPile getDeck() {
        return deck;
    }

    public void setDeck(CardPile deck) {
        this.deck = deck;
    }

    public CardPile getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(CardPile discardPile) {
        this.discardPile = discardPile;
    }

    public CardPile getHand() {
        return hand;
    }

    public void setHand(CardPile hand) {
        this.hand = hand;
    }

    public CardPile getStage() {
        return stage;
    }

    public void setStage(CardPile stage) {
        this.stage = stage;
    }

}
