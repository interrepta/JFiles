package com.jfiles.JFiles.tasks;

import com.jfiles.JFiles.Task;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public final class Write implements Task {

    private final File file;
    private final List<String> data;

    public Write(final File destinationFile, final List<String> data) {
        this.file = destinationFile;
        this.data = data;
    }

    @Override
    public void make() {
        try {
            FileUtils.writeLines(file, data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
