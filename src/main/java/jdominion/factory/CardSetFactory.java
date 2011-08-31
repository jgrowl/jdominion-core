package jdominion.factory;

import com.google.inject.assistedinject.Assisted;
import jdominion.card.CardSet;

import java.io.File;

/**
 * User: jonathan
 * Date: 8/2/11
 * Time: 9:25 PM
 */
public interface CardSetFactory {

    public CardSet createCardSet(File cardSetFolder);

}
