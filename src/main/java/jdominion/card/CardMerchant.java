package jdominion.card;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Maintains all getCards for sale.
 * 
 * @author jonathan
 * 
 */
public interface CardMerchant {

	/**
	 * Gets all available getCards currently in stock.
	 *
	 * @return
	 */
	public List<Card> getCardsInStock();

	/**
	 * Gets all available getCards currently in stock that could be bought for a
	 * given price.
	 *
	 * @param coins
	 *            The amount that is available to spend
	 *
	 * @return A list of getCards that could be bought given a specified maximum
	 *         amount.
	 */
	public List<Card> getCardsInStockForCoins(int coins);

	/**
	 * Buys a card
	 *
	 * @param card
	 *            The card to be bought.
	 *
	 * @return The card bought.
	 */
	public Card buyCard(Card card, int coins);

    /**
     * Calculates the number of piles depleted in the merchant.
     *
     * @return number of depleted card piles
     */
    public int getNumberOfDepletedPiles();

    /**
     * Gets a list of all getCards for sale at merchant.
     *
     * @return List of Cards for sale.
     */
    public List<Card> getCardsForSale();

}
