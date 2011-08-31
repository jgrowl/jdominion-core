package jdominion.serialization;

import com.google.inject.Injector;
import jdominion.InjectableTest;
import jdominion.TestHelper;
import jdominion.card.Card;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;

/**
 * User: jonathan
 * Date: 7/8/11
 * Time: 11:28 PM
 */
public abstract class SerializationTest extends InjectableTest {

    private final static String TEMPORARY_FILE_NAME = "card.tmp";

    private Serialization mSerialization;

    @Rule
    public TemporaryFolder mTestFolder = new TemporaryFolder();

    public SerializationTest(Injector injector) {
        mInjector = injector;
        mSerialization = injector.getInstance(Serialization.class);
    }

    @Test
    public void canSerializeThenDeserializeCardtest() throws Exception {
        Card cardToSerialize = TestHelper.getAnonymousCard(mInjector);
        File serializedCardFile = mTestFolder.newFile(TEMPORARY_FILE_NAME);
        CardSerializationHelper.serializeCard(cardToSerialize,
                serializedCardFile,
                mSerialization);

        Card deserializedCard = CardSerializationHelper.deserializeCard(
                cardToSerialize.getClass(),
                serializedCardFile,
                mSerialization);

        Assert.assertEquals(cardToSerialize, deserializedCard);
    }

}
