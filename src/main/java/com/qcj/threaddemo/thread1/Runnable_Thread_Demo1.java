package com.qcj.threaddemo.thread1;

public class Runnable_Thread_Demo1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread,"t1");
        Thread t2 = new Thread(myThread,"t2");
        t1.start();
        t2.start();
    }
}
