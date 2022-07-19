package com.jfiles.JFiles.tasks;

import com.jfiles.JFiles.Task;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class Read implements Task {

    private final File sourceFile;
    private List <String> data = new ArrayList<>();

    public Read(final File sourceFile) {
        this.sourceFile = sourceFile;
    }

    @Override
    public void make() {
        try {
            data = FileUtils.readLines(sourceFile, Charset.defaultCharset());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List <String> data() {
        return data;
    }
}
