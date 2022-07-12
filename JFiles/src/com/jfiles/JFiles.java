package com.jfiles;

import java.io.File;

public final class JFiles {

    public void copy(final File sourceFile, final File destinationFile) {
        new Copy().copyFile(sourceFile, destinationFile);
    }

}
