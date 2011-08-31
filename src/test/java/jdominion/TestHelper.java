package jdominion;

import com.google.inject.Injector;
import jdominion.card.*;
import jdominion.condition.Condition;
import jdominion.factory.JDominionFactory;
import jdominion.serialization.Serialization;
import jdominion.serialization.xml.SimpleXmlSerialization;
import jdominion.util.CardHelper;
import jdominion.util.GameHelper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: jonathan
 * Date: 3/6/11
 * Time: 12:00 AM
 */
public class TestHelper {

    private static int DEFAULT_NUMBER_OF_PLAYERS = 2;
    private static int DEFAULT_NUMBER_OF_CARDS = 2;
    private static int DEFAULT_NUMBER_OF_CARDS_PILES = 2;

    public static CardMerchant getAnonymousCardMerchant() {
        return JDominionFactory.createCardMerchant(getAnonymousCardPileMap());
    }

    public static Card getUniqueCard() {
        Card card = new StandardCard();

        return card;
    }

    public static CardMerchant getEmptyCardMerchant() {
        return JDominionFactory.createCardMerchant(getAnonymousCardPileMap());
    }

    public static CardPile getAnonymousCardPile() {
        return getEmptyCardPile();
    }

    public static CardMerchant getDepletedCardMerchant() {
        CardMerchant cardMerchant = getAnonymousCardMerchant();
        while(cardMerchant.getCardsForSale().size() > 0) {
            Card card = cardMerchant.getCardsForSale().get(0);
            cardMerchant.buyCard(card, card.getCost());
        }

        return cardMerchant;
    }

    public static Map<Card, CardPile> getAnonymousCardPileMap() {
        return getAnonymousCardPileMap(DEFAULT_NUMBER_OF_CARDS_PILES, DEFAULT_NUMBER_OF_CARDS);
    }

    public static Map<Card, CardPile> getAnonymousCardPileMap(int numberOfCardPiles, int numberOfCardsPerPile) {
        Map<Card, CardPile> anonymousCardPileMap = new HashMap<Card, CardPile>();

        for(int i = 0; i < numberOfCardPiles; i++) {
            Card uniqueCard = getUniqueCard();
            anonymousCardPileMap.put(uniqueCard, new CardPile(CardHelper.duplicateCard(uniqueCard, numberOfCardsPerPile)));
        }

        return anonymousCardPileMap;
    }

    public static Map<Card, CardPile> getEmptyCardPileMap() {
        return new HashMap<Card, CardPile>();
    }

    public static List<Player> getAnonymousPlayers(int numberOfPlayers) {
        List<Player> players = new ArrayList<Player>(numberOfPlayers);
        for(int i=0; i<numberOfPlayers; i++) {
            players.add(getUniquePlayer());
        }

        return players;
    }

    public static List<Player> getAnonymousPlayers() {
        return getAnonymousPlayers(DEFAULT_NUMBER_OF_PLAYERS);
    }

    public static Player getUniquePlayer() {
        return JDominionFactory.createPlayer(CardHelper.createEmptyCardPile(),
                CardHelper.createEmptyCardPile(),
                CardHelper.createEmptyCardPile(),
                CardHelper.createEmptyCardPile());
    }

    public static Condition getAnonymousCondition() {
        return GameHelper.getStandardEndingCondition(getAnonymousCardMerchant());
    }

    public static CardPile getAnonymousIdenticalCardPile() {
        return new CardPile(CardHelper.duplicateCard(getAnonymousCard(), DEFAULT_NUMBER_OF_CARDS));
    }

    public static Card getAnonymousCard() {
        return getUniqueCard();
    }

    public static CardPile getEmptyCardPile() {
        return new CardPile(new ArrayList<Card>(0));
    }

    public static File getAnonymousFile() throws IOException {
        final String PREFIX = "anonymous-file";
        final String SUFFIX = ".tmp";

        return File.createTempFile(PREFIX, SUFFIX);
    }

    public static File getAnonymousFolder() throws IOException {
        File anonymousFolder = getAnonymousFile();
        anonymousFolder.delete();
        anonymousFolder.mkdir();

        return anonymousFolder;
    }

    public static Card getAnonymousCard(Injector injector) {
        Card card = injector.getInstance(Card.class);
        card.setCardType(CardType.VICTORY);
        card.setName("fake-card");

        return card;
    }

}
