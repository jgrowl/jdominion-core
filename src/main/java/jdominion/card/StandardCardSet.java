package jdominion.card;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * User: jonathan
 * Date: 7/30/11
 * Time: 10:02 PM
 */
public abstract class StandardCardSet implements CardSet {

    private String name;

    private List<Card> cards;

    @Inject
    public StandardCardSet(@Assisted File cardSetFolder) {
        cards = new ArrayList<Card>();
        name = cardSetFolder.getName();

        File[] cardFolders = cardSetFolder.listFiles();
        for(File cardFolder : cardFolders) {
            cards.add(createCard(cardFolder));
        }
    }

    protected abstract Card createCard(File cardFolder);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

}
