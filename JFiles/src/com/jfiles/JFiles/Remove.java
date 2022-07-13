package com.jfiles.JFiles;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public final class Remove extends Task {

    private final File file;

    public Remove(final File file) {
        this.file = file;
        make();
    }

    public void run() {
        try {
            FileUtils.forceDelete(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
