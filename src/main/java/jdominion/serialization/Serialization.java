package jdominion.serialization;

import java.io.File;
import java.io.Reader;

public interface Serialization {

	public <T> T deserialize(Class<T> clazz, File file) throws Exception;

	public <T> T deserialize(Class<T> clazz, Reader reader) throws Exception;

}
