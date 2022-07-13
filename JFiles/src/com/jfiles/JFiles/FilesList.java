package com.jfiles.JFiles;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.CanWriteFileFilter;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FilesList implements Task {

    private final File sourceDirectory;
    private final String[] extensions;
    private final boolean recursive;
    private List<File> filesList = Collections.synchronizedList(new ArrayList<>());

    public FilesList(final File sourceDirectory, final String [] extensions, final boolean recursive) {
        this.sourceDirectory = sourceDirectory;
        this.extensions = extensions;
        this.recursive = recursive;
        make();
    }

    @Override
    public void make() {
        Collection <File> filesCollection = FileUtils.listFilesAndDirs(sourceDirectory, CanWriteFileFilter.CAN_WRITE, DirectoryFileFilter.DIRECTORY);
        filesList = filesCollection.stream().toList();
    }

    public synchronized List<File> get() {
        return filesList;
    }

    public synchronized void set(final List <File> filesList) {this.filesList = filesList;}
}
