package jdominion.serialization;

import jdominion.card.Card;

import java.io.File;

/**
 * User: jonathan
 * Date: 8/28/11
 * Time: 5:42 PM
 */
public interface CardSerialization {

    public void serializeCard(File file) throws Exception;

    public Card deserializeCard(File file) throws Exception;

}
