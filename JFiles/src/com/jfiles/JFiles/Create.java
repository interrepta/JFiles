package com.jfiles.JFiles;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Creates files or directories.
 */
public class Create {

    public void create(final File file, final boolean createDirectory) {
        if (createDirectory) {
            try {
                FileUtils.forceMkdir(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
