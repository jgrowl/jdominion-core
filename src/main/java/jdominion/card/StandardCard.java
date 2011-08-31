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

	public String getName() {
		return name;
	}

    public void setName(String name) {
        this.name = name;
    }

    public String description() {
        return description;
    }

	public int getCost() {
		return cost;
	}

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCards() {
		return cards;
	}

    public void setCards(int cards) {
        this.cards = cards;
    }

    public int getActions() {
		return actions;
	}

    public void setActions(int actions) {
        this.actions = actions;
    }

    public int getBuys() {
		return buys;
	}

    public void setBuys(int buys) {
        this.buys = buys;
    }

    public int getCoins() {
		return coins;
	}

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getVictoryPoints() {
		return victoryPoints;
	}

    public void setVictoryPoints(int victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StandardCard that = (StandardCard) o;

        if (actions != that.actions) return false;
        if (buys != that.buys) return false;
        if (cards != that.cards) return false;
        if (coins != that.coins) return false;
        if (cost != that.cost) return false;
        if (victoryPoints != that.victoryPoints) return false;
        if (cardType != that.cardType) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + cost;
        result = 31 * result + cards;
        result = 31 * result + actions;
        result = 31 * result + buys;
        result = 31 * result + coins;
        result = 31 * result + victoryPoints;
        result = 31 * result + (cardType != null ? cardType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StandardCard{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                ", cards=" + cards +
                ", actions=" + actions +
                ", buys=" + buys +
                ", coins=" + coins +
                ", victoryPoints=" + victoryPoints +
                ", cardType=" + cardType +
                '}';
    }

}
