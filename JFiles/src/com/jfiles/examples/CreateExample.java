package com.jfiles.examples;

import com.jfiles.JFiles.JFiles;

import java.io.File;

public final class CreateExample {

    public static void main(String[] args) {

        new JFiles().create(new File("examples/dir2"), true);
        new JFiles().create(new File("examples/file2"), false);
    }

}
