package com.jfiles.examples;

import com.jfiles.JFiles.FilesList;

import java.io.File;

public final class FilesListExample {

    public FilesListExample() {
        FilesList filesList = new FilesList(new File("examples/dir1"), new String[]{""}, false);
        System.out.println(filesList.get());
    }

    public static void main(String[] args) {
        new FilesListExample();
    }

}
