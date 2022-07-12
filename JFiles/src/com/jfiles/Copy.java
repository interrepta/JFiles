package com.jfiles;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Class copy files or directories.
 */
public final class Copy {

    /**
     * Copy files.
     * @param sourceFile source file
     * @param destinationFile destination file
     * @return copyFlag - copy flag
     */
    public boolean copyFile(final File sourceFile, final File destinationFile) {

        final boolean isSourceFileDirectory = FileUtils.isDirectory(sourceFile);
        final boolean isDestinationFileDirectory = FileUtils.isDirectory(destinationFile);
        final boolean isSourceFileFile = !isSourceFileDirectory;

        final boolean onlySecondFileIsDirectory = isSourceFileFile && isDestinationFileDirectory;
        final boolean areAllFilesDirectories = isSourceFileDirectory && isDestinationFileDirectory;

        boolean copyFlag = false;

        if (areAllFilesDirectories) {
            try {
                FileUtils.copyDirectoryToDirectory(sourceFile, destinationFile);
                copyFlag = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (onlySecondFileIsDirectory) {
            try {
                FileUtils.copyFileToDirectory(sourceFile, destinationFile);
                copyFlag = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                FileUtils.copyFile(sourceFile, destinationFile);
                copyFlag = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return copyFlag;
    }

}
