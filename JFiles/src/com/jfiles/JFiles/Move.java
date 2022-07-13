package com.jfiles.JFiles;

import java.io.File;

public final class Move implements Task {

    private final File sourceFile;
    private final File destinationFile;

    protected Move(final File sourceFile, final File destinationFile) {
        this.sourceFile = sourceFile;
        this.destinationFile = destinationFile;
    }

    @Override
    public void make() {
        new JFiles().copy(sourceFile, destinationFile);
        new JFiles().remove(sourceFile);
    }
}
