package jdominion.card;

/**
 * User: jonathan
 * Date: 3/23/11
 * Time: 9:48 PM
 */
public interface Card {

    public String getName();

    public void setName(String name);

	public int getCost();

    public void setCost(int cost);

	public int getCards();

    public void setCards(int cards);

	public int getActions();

    public void setActions(int actions);

	public int getBuys();

    public void setBuys(int buys);

	public int getCoins();

    public void setCoins(int coins);

	public int getVictoryPoints();

    public void setVictoryPoints(int victoryPoints);

    public CardType getCardType();

    public void setCardType(CardType cardType);

}
