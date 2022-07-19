package com.jfiles.examples;

import com.jfiles.JFiles.JFiles;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class WriteExample {

    public WriteExample() {
        final List <String> data = new ArrayList<>();
        data.add("Siała baba mak");
        data.add("Nie wiedziała jak");
        new JFiles().write(new File("examples/wierszyk"), data);
    }

    public static void main(String[] args) {
        new WriteExample();
    }

}
