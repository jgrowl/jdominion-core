package jdominion.factory;

import com.google.inject.Injector;
import jdominion.card.Card;

import java.io.File;
import java.io.Reader;

/**
 * User: jonathan
 * Date: 3/28/11
 * Time: 9:35 PM
 */
public interface CardFactory {

    /**
     * Creates a card from file.
     *
     * @return
     */
    public Card createCard(File cardFolder);

}
