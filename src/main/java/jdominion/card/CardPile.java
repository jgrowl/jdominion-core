package jdominion.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a card pile.
 * 
 * @author jonathan
 * 
 */
public class CardPile implements Iterable<Card> {

	/**
	 * Contains all cards currently in the pile.
	 */
	protected List<Card> cards;

	/**
	 * Determines if a pile still has cards remaining in it.
	 * 
	 * @return true if the pile still has cards in it, false otherwise.
	 */
	public boolean hasCards() {
		return cards.isEmpty();
	}

	/**
	 * Constructor allows injection of a list of cards.
	 * 
	 * @param cards
	 *            The cards in the CardPile.
	 */
	public CardPile(List<Card> cards) {
		this.cards = cards;
	}

	/**
	 * Draws the first card on the top of the deck.
	 * 
	 * @return Card on the top of the deck.
	 */
	public Card drawCard() {
		return removeCard(0);
	}

	/**
	 * Draws a card from a specified position in the deck.
	 * 
	 * @param cardIndex
	 *            The index of the card to be drawn.
	 * @return A Card.
	 */
	public Card removeCard(int cardIndex) {
		return this.cards.remove(cardIndex);
	}

	/**
	 * Moves cards from a CardPile to this Cardpile.
	 * 
	 * Postconditions: Cards will be added to this CardPile, but will not remain
	 * in passed CardPile.
	 * 
	 * @param cards
	 */
	public void addCards(CardPile cards) {
		if (cards == null) {
			throw new NullPointerException("Cannot add null CardPile to deck.");
		}

		this.cards.addAll(cards.cards);
		this.cards.clear();
	}

	/**
	 * Adds a single card.
	 * 
	 * @param card
	 *            The card to be added.
	 */
	public void addCard(Card card) {
		if (card == null) {
			throw new NullPointerException("Cannot add null Card to deck.");
		}

		this.cards.add(card);
	}

	/**
	 * Shuffles the deck.
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	}

	@Override
	public String toString() {
		return "CardPile [cards=" + cards + "]";
	}

	/**
	 * Provides a way to use CardPile in a for each loop.
	 */
	public Iterator<Card> iterator() {
		return cards.iterator();
	}

}
