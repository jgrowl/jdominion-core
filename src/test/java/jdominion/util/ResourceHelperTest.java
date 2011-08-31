package jdominion.util;

import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * User: jonathan
 * Date: 8/24/11
 * Time: 9:59 PM
 */
public class ResourceHelperTest {

    private static final String NON_EXISTENT_FILE_PATH = "/NON_EXISTENT_FILE/PATH.bad";
    private static final String EXISTENT_FILE_PATH = "/jdominion/util/resource-test.xml";

    @Test(expected = FileNotFoundException.class)
    public void throwsErrorWhenGettingNonExistentFileTest() throws FileNotFoundException {
        ResourceHelper.getResourceFile(NON_EXISTENT_FILE_PATH);
    }

    /**
     * This test assumes that the specified file will actually exist on the resource path.
     */
    @Test
    public void canGetResourceFileTest() throws Exception {
        ResourceHelper.getResourceFile(EXISTENT_FILE_PATH);
    }

}
