package jdominion;

import jdominion.card.Card;
import jdominion.card.CardPile;

/**
 * Represents a dominion player
 * 
 * @author jonathan
 * 
 */
public interface Player {

    public void discard();

    public void discardCard(Card card);

    public int getTotalBuys();

    public int getTotalActions();

    public int getTotalCoins();

    public void playCard(int cardIndex);

    public void buyCard(Card card);

    public CardPile getDeck();

    public void setDeck(CardPile deck);

    public CardPile getDiscardPile();

    public void setDiscardPile(CardPile discardPile);

    public CardPile getHand();

    public void setHand(CardPile hand);

    public CardPile getStage();

    public void setStage(CardPile stage);

}
