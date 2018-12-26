package com.qcj.threaddemo._01lockdemo;

public class Lock_Demo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread,"t1");
        Thread t2 = new Thread(myThread,"t2");
        t1.start();
        t2.start();
    }
}
