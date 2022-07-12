package com.jfiles.JFiles;

import com.jfiles.examples.CopyExample;

import java.io.File;

public final class JFiles {

    public void create(final File file, final boolean isDirectory) {
        new Create().create(file, isDirectory);
    }
    public void copy(final File sourceFile, final File destinationFile) {
        new Copy().copyFile(sourceFile, destinationFile);
    }

}
