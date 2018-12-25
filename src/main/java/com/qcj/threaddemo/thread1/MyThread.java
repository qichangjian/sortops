package com.qcj.threaddemo.thread1;

/**
 * 方法一：实现runnable接口，并实现该接口的run()方法。
 *
 * 以下是主要步骤：
 *     ①自定义类并实现Ruannable接口，实现run()方法。
 *     ②创建Thread对象，用实现Ruannable接口的独享作为参数实例化该Thread对象。
 *     ③调用Thread的start()方法；
 */
public class MyThread implements Runnable{
    @Override
    public void run() {
        say();
    }

    //加锁的方法
    synchronized public void say(){
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
