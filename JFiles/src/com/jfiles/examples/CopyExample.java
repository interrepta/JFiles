package com.jfiles.examples;

import com.jfiles.JFiles.JFiles;

import java.io.File;

public final class CopyExample {

    public CopyExample() {
        final JFiles jFiles = new JFiles();
        jFiles.copy(new File("examples/file1"), new File("examples/dir1"));
        jFiles.copy(new File("examples/dir1"), new File("examples/dir2"));
    }

    public static void main(String[] args) {
        new CopyExample();
    }

}
