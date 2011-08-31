package jdominion.serialization;

import java.io.File;
import java.io.Reader;
import java.io.Writer;

public interface Serialization {

	public <T> T deserialize(Class<T> clazz, File file) throws Exception;

	public <T> T deserialize(Class<T> clazz, Reader reader) throws Exception;

	public void serialize(Object object, File file) throws Exception;

	public void serialize(Object object, Writer writer) throws Exception;

}
