package com.jfiles.JFiles;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public final class Remove implements Task {

    private final File file;

    protected Remove(final File file) {
        this.file = file;
        make();
    }

    public void make() {
        try {
            FileUtils.forceDelete(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
