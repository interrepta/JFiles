package com.jfiles.JFiles;

import java.io.File;
import java.util.List;

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

    public void move(final File sourceFile, final File destinationFile) {
        new Move(sourceFile, destinationFile).make();
    }

    public List<File> filesList(final File sourceDirectory, final String [] extensions, final boolean recursive) {
        return new FilesList(sourceDirectory, extensions, recursive).get();
    }

}
