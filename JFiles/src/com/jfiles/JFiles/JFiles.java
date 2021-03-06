package com.jfiles.JFiles;

import com.jfiles.JFiles.tasks.*;

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

    public void write(final File file, final List<String> data) {
        new Write(file, data).make();
    }

    public List<String> read(final File sourceFile) {
        final Read read = new Read(sourceFile);
        read.make();
        return read.data();
    }

}
