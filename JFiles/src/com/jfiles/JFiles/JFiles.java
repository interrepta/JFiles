package com.jfiles.JFiles;

import java.io.File;

public final class JFiles {

    public void create(final File file, final boolean isDirectory) {
        new Create(file, isDirectory);
    }
    public void copy(final File sourceFile, final File destinationFile) {
        new Copy(sourceFile, destinationFile);
    }

    public void remove(final File file) {
        new Remove(file);
    }

}
