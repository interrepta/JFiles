package com.jfiles.JFiles.tasks;

import com.jfiles.JFiles.Task;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Creates files or directories.
 */
public class Create implements Task {

    private final File file;
    private final boolean createDirectory;
    private boolean makeFlag;

    public Create(final File file, final boolean createDirectory) {
        this.file = file;
        this.createDirectory = createDirectory;
        make();
    }

    public void make() {
        makeFlag = false;
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
