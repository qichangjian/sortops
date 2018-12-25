package com.qcj.threaddemo.thread3;

import java.util.concurrent.Callable;

/**
 * 方式三：
 * 实现Callable接口，重写call方法。
 * 使用ExecutorService,Callable,Future实现带返回结果的多线程。
 *
 * 如果有这样的一个场景，需要让异步执行的线程在执行完成后返回一个值给当前的线程，
 * 当前的线程需要依赖这个值做一些其他的业务操作，这个时候就要用到如下带返回值的线程了。
 */
public class MyThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        say();
        return "callable中call方法返回的值";
    }

    synchronized public void say(){
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
