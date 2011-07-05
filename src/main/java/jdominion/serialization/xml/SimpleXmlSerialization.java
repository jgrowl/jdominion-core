package jdominion.serialization.xml;

import jdominion.serialization.Serialization;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.io.Reader;

public class SimpleXmlSerialization implements Serialization {

	private Serializer serializer = new Persister();

	public <T> T deserialize(Class<T> clazz, File file) throws Exception {
		return serializer.read(clazz, file);
	}

	public <T> T deserialize(Class<T> clazz, Reader reader) throws Exception {
		return serializer.read(clazz, reader);
	}

}
