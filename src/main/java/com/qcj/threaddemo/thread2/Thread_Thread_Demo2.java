package com.qcj.threaddemo.thread2;

public class Thread_Thread_Demo2 {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        m1.start();
        m2.start();
//        MyThread m3 = new MyThread("m1");//这样要重写MyThread的构造方法
    }
}
