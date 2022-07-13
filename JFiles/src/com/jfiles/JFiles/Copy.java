package com.jfiles.JFiles;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Class copy files or directories.
 */
public final class Copy extends Task {

    private final File sourceFile;
    private final File destinationFile;

    public Copy(final File sourceFile, final File destinationFile) {
        this.sourceFile = sourceFile;
        this.destinationFile = destinationFile;
        make();
    }

    @Override
    public void run() {
        final boolean isSourceFileDirectory = FileUtils.isDirectory(sourceFile);
        final boolean isDestinationFileDirectory = FileUtils.isDirectory(destinationFile);
        final boolean isSourceFileFile = !isSourceFileDirectory;

        final boolean onlySecondFileIsDirectory = isSourceFileFile && isDestinationFileDirectory;
        final boolean areAllFilesDirectories = isSourceFileDirectory && isDestinationFileDirectory;

        if (areAllFilesDirectories) {
            try {
                FileUtils.copyDirectoryToDirectory(sourceFile, destinationFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (onlySecondFileIsDirectory) {
            try {
                FileUtils.copyFileToDirectory(sourceFile, destinationFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                FileUtils.copyFile(sourceFile, destinationFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
