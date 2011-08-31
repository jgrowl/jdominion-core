package jdominion;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesModule extends AbstractModule {

    protected void configure() {
        try {
            Properties databaseProperties = loadProperties("db.properties");
            Names.bindProperties(binder(), databaseProperties);
        } catch (RuntimeException e) {
            addError("Could not configure database properties", e);
        }
    }

    private static Properties loadProperties(String name) {
        Properties properties = new Properties();
        InputStream is = new Object() {
        }
                .getClass()
                .getEnclosingClass()
                .getResourceAsStream(name);
        try {
            properties.load(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException dontCare) {
                }
            }
        }
        return properties;
    }

}