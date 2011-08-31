package jdominion.serialization;

import com.google.inject.Guice;
import com.google.inject.Injector;
import jdominion.module.SimpleXmlSerializationModule;

/**
 * User: jonathan
 * Date: 7/28/11
 * Time: 10:29 PM
 */
public class SimpleXmlSerializationTest extends SerializationTest {

    public SimpleXmlSerializationTest() {
        super(Guice.createInjector(new SimpleXmlSerializationModule()));
    }

}
