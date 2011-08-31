package jdominion.card;

/**
 * User: jonathan
 * Date: 8/7/11
 * Time: 3:16 PM
 */
public class CardWrapper implements Card {

    protected Card card;

    public CardType getCardType() {
        return this.card.getCardType();
    }

    public void setCardType(CardType cardType) {
        this.card.setCardType(cardType);
    }

    public String getName() {
        return card.getName();
    }

    public void setName(String name) {
        card.setName(name);
    }

    public int getCost() {
        return card.getCost();
    }

    public void setCost(int cost) {
        card.setCost(cost);
    }

    public int getCards() {
        return card.getCards();
    }

    public void setCards(int cards) {
        card.setCards(cards);
    }

    public int getActions() {
        return card.getActions();
    }

    public void setActions(int actions) {
        card.setActions(actions);
    }

    public int getBuys() {
        return card.getBuys();
    }

    public void setBuys(int buys) {
        card.setBuys(buys);
    }

    public int getCoins() {
        return card.getCoins();
    }

    public void setCoins(int coins) {
        card.setCoins(coins);
    }

    public int getVictoryPoints() {
        return card.getVictoryPoints();
    }

    public void setVictoryPoints(int victoryPoints) {
        card.setVictoryPoints(victoryPoints);
    }

    @Override
    public boolean equals(Object o) {
        return o.equals(card);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("CardWrapper");
        sb.append("{card=").append(card);
        sb.append('}');
        return sb.toString();
    }

}
