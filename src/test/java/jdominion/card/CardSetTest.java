package jdominion.card;

import jdominion.util.ResourceHelper;
import org.junit.Test;

/**
 * User: jonathan
 * Date: 8/27/11
 * Time: 12:21 AM
 */
public class CardSetTest {

    @Test
    public void canLoadCoreSet() throws Exception {
        CardSet cardSet = new JDominionCardSet(ResourceHelper.getResourceFile("/jdominion/card/core"));
    }

}
