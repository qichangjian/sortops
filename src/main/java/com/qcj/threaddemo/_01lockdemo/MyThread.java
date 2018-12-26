package com.qcj.threaddemo._01lockdemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * lock锁
 */
public class MyThread implements Runnable{

    Lock lock = new ReentrantLock();//重入锁

    @Override
    public void run() {
        say();
    }

    //加锁的方法
    public void say(){
        lock.lock();
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
        lock.unlock();
    }
}
