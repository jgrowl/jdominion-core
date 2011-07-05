package jdominion.util;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ResourceHelper {

	public static Reader getResource(String relativePath) {
		return new InputStreamReader(ResourceHelper.class
				.getResourceAsStream((relativePath)));
	}

	/**
	 * http://www.xinotes.org/notes/note/225/
	 * 
	 * @param relativePath
	 * @return
	 * @throws java.io.IOException
	 */
	public static List<String> getResourceNames(String relativePath)
			throws IOException {
		List<String> fileNames = new ArrayList<String>();
		ClassLoader loader = ResourceHelper.class.getClassLoader();
		InputStream in = loader.getResourceAsStream(relativePath);
		BufferedReader rdr = new BufferedReader(new InputStreamReader(in));
		String line;
		while ((line = rdr.readLine()) != null) {
			fileNames.add(line);
		}
		rdr.close();

		return fileNames;
	}

}
