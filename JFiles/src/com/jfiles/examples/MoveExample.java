package com.jfiles.examples;

import com.jfiles.JFiles.JFiles;

import java.io.File;

public final class MoveExample {

    public MoveExample() {
        new JFiles().move(new File("examples/dir2"), new File("examples/dir1"));
    }

    public static void main(String[] args) {
        new MoveExample();
    }

}
