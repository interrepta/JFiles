package com.jfiles.JFiles;

public abstract class Task implements Runnable {

    public void make() {
        new Thread(this, getClass().getName()).start();
    }

    @Override
    public void run() {

    }
}
