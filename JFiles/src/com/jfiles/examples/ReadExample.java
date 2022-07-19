package com.jfiles.examples;

import com.jfiles.JFiles.JFiles;

import java.io.File;
import java.util.List;

public final class ReadExample {

    public ReadExample() {
        List <String> data = new JFiles().read(new File("examples/toread"));
        System.out.println(data);
    }

    public static void main(String[] args) {
        new ReadExample();
    }

}
