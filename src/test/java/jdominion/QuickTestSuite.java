package jdominion;

import jdominion.card.CardSetTest;
import jdominion.card.CardTest;
import jdominion.serialization.SimpleXmlSerializationTest;
import jdominion.util.ResourceHelperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * User: jonathan
 * Date: 7/29/11
 * Time: 9:46 PM
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        SimpleXmlSerializationTest.class,
        GameMachineTest.class,
        ResourceHelperTest.class,
        CardTest.class,
        CardSetTest.class

})
public class QuickTestSuite {}
