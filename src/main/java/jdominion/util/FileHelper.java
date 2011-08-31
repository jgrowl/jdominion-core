package jdominion.util;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: jonathan
 * Date: 5/30/11
 * Time: 10:51 PM
 */
public class FileHelper {

    public static File getSubFile(File parentDirectory, String fileName) {
        if(!parentDirectory.isDirectory()) {
            throw new IllegalArgumentException("ParentDirectory must be a folder.");
        }

        return new File(parentDirectory.getPath() + File.pathSeparatorChar + fileName);
    }

}
