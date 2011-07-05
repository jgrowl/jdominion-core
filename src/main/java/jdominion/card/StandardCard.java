package jdominion.card;

public class StandardCard implements Card {

	protected String name;

    protected String description;

	protected int cost;

	protected int cards;

	protected int actions;

	protected int buys;

	protected int coins;

	protected int victoryPoints;

    protected CardType cardType;

	public String name() {
		return name;
	}

    public String description() {
        return description;
    }

	public int cost() {
		return cost;
	}

	public int cards() {
		return cards;
	}

	public int actions() {
		return actions;
	}

	public int buys() {
		return buys;
	}

	public int coins() {
		return coins;
	}

	public int victoryPoints() {
		return victoryPoints;
	}

    public CardType getCardType() {
        return cardType;
    }

}
