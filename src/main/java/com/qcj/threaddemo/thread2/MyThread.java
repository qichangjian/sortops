package com.qcj.threaddemo.thread2;

/**
 * 方式二：
 *  继承Thread类，重写run方法。
 * Thread类本质上是实现了Runnable接口的一个实例
 */
public class MyThread extends Thread{
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


    public MyThread() {
    }
    //new MyThread的时候传入姓名，需要用到这个方法
    public MyThread(String name) {
        super(name);
    }
}
