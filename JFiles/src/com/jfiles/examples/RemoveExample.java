package com.jfiles.examples;

import com.jfiles.JFiles.JFiles;

import java.io.File;

public final class RemoveExample {

    public RemoveExample() {
        new JFiles().remove(new File("examples/dir2"));
        new JFiles().remove(new File("examples/file2"));
    }

    public static void main(String[] args) {
        new RemoveExample();
    }

}
