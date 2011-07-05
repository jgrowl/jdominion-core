package jdominion;

import jdominion.factory.JDominionFactory;
import org.junit.Test;
import static jdominion.TestHelper.*;

/**
 * Created by IntelliJ IDEA.
 * User: jonathan
 * Date: 3/5/11
 * Time: 11:43 PM
 */

public class QuickTest {

    @Test
    public void canCreateActionPhase() {
        JDominionFactory.createActionPhaseState(getUniquePlayer(),
                getAnonymousCardMerchant());
    }

}
