package com.jfiles.JFiles.tasks;

import com.jfiles.JFiles.JFiles;
import com.jfiles.JFiles.Task;

import java.io.File;

public final class Move implements Task {

    private final File sourceFile;
    private final File destinationFile;

    public Move(final File sourceFile, final File destinationFile) {
        this.sourceFile = sourceFile;
        this.destinationFile = destinationFile;
    }

    @Override
    public void make() {
        new JFiles().copy(sourceFile, destinationFile);
        new JFiles().remove(sourceFile);
    }
}
