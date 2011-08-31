package jdominion.util;

import jdominion.card.CardSet;

import java.io.File;
import java.io.IOException;

/**
 * User: jonathan
 * Date: 7/30/11
 * Time: 10:56 PM
 */
public interface SetHelper {

    public CardSet readCardSet(File cardSetFile) throws IOException;

}
