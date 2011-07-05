package jdominion.card;

/**
 * User: jonathan
 * Date: 3/23/11
 * Time: 9:48 PM
 */
public interface Card {

    public String name();

	public int cost();

	public int cards();

	public int actions();

	public int buys();

	public int coins();

	public int victoryPoints();

    public CardType getCardType();

}
