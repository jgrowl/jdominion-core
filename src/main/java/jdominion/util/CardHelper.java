package jdominion.util;

import jdominion.card.Card;
import jdominion.card.CardPile;
import jdominion.card.CardProperties;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CardHelper {

	private CardHelper() {
	}

    public static CardPile createEmptyCardPile() {
        return new CardPile(new ArrayList<Card>());
    }

//	public static List<Card> getCards(List<String> relativePaths,
//			Serialization serialization) throws Exception {
//		List<Card> cards = new ArrayList<Card>();
//
//		for (String relativePath : relativePaths) {
//			cards.add(getCard("/" + relativePath, serialization));
//		}
//
//		return cards;
//	}

//	public static Card getCard(String relativePath, Serialization serialization)
//			throws Exception {
//		return CardSerialization.deserializeCard(ResourceHelper
//                .getResource(relativePath), serialization);
//	}

	public static List<String> getCardRelativePaths(String cardSet)
			throws IOException {
		List<String> cardRelativePaths = new ArrayList<String>();

		final String CARD_SET_RELATIVE_PATH = CardProperties
				.getCardSetsDirPath()
				+ "/" + cardSet + "/" + CardProperties.getCardsDirName();
		List<String> cardNames = ResourceHelper
				.getResourceNames(CARD_SET_RELATIVE_PATH);
		for (String cardName : cardNames) {
			cardRelativePaths.add(CARD_SET_RELATIVE_PATH + "/" + cardName + "/"
					+ CardProperties.getCardFileName());
		}

		return cardRelativePaths;
	}

	public static List<String> getCardSetDirNames() throws IOException {
		return ResourceHelper.getResourceNames(CardProperties
				.getCardSetsDirPath());
	}

//	public static Map<String, List<Card>> getCardSetMap(
//			Serialization serialization) throws Exception {
//		Map<String, List<Card>> cardSets = new HashMap<String, List<Card>>();
//
//		for (String cardSetDirName : getCardSetDirNames()) {
//			cardSets.put(cardSetDirName, getCards(
//					getCardRelativePaths(cardSetDirName), serialization));
//		}
//
//		return cardSets;
//	}

	public static int getNumberOfActionCards(CardPile cardPile) {
//		int actionCardCount = 0;
//		for (Card card : cardPile) {
//			if (card instanceof ActionCard) {
//				actionCardCount++;
//			}
//		}
//
//		return actionCardCount;
        return 0;
	}

	public static int getNumberOfActions(CardPile cardPile) {
//		int actionCount = 0;
//		for (Card card : cardPile) {
//			actionCount += card.getActions();
//		}
//
//		return actionCount;
        return 0;
	}

	public static int getNumberOfBuys(CardPile cardPile) {
//		int buyCount = 0;
//		for (Card card : cardPile) {
//			buyCount += card.getBuys();
//		}
//
//		return buyCount;
        return 0;
	}

    /**
     * Produces a specified number of identical getCards.
     * @param card The card to duplicate.
     * @param number The number of getCards to produce
     * @return A list of getCards comprised of a given number of a given card.
     */
    public static List<Card> duplicateCard(Card card, int number) {
        List<Card> cards = new ArrayList<Card>(number);
        for(int i=0; i < number; i++) {
            cards.add(card);
        }

        return cards;
    }

}
