package jdominion.card;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import jdominion.factory.JDominionFactory;

import java.io.File;

/**
 * User: jonathan
 * Date: 8/28/11
 * Time: 6:38 PM
 */
public class JDominionCardSet extends StandardCardSet {

    @Inject
    public JDominionCardSet(@Assisted File cardSetFolder) {
        super(cardSetFolder);
    }

    @Override
    protected Card createCard(File cardFolder) {
        return JDominionFactory.createCard(cardFolder);
    }

}
