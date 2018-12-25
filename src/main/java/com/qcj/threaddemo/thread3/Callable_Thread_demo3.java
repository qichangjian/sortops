package com.qcj.threaddemo.thread3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Callable接口是Java1.5开始出现的只有一个带返回值的call（）方法
 */
public class Callable_Thread_demo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // ExecutorService启动线程
        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService1 = Executors.newSingleThreadExecutor();//多种启动方式

        // 实例化一个自己写的线程类
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        // Future接收返回的参数
        Future<String> submit = executorService.submit(m1);
        Future<String> submit2 = executorService.submit(m2);

        System.out.println(submit.get());//get方式会阻塞，需要抛出异常
        System.out.println(submit2.get());

        //关闭
        executorService.shutdown();

    }
}
