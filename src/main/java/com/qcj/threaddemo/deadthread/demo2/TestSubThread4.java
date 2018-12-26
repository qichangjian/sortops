package com.qcj.threaddemo.deadthread.demo2;

/**
 * 死锁的例子
 */
class Zhangsan{
    public void say() {
        System.out.println("你给我书，我就给你画");
    }
    public void get() {
        System.out.println("张三获得了书");
    }
}
class Lisi{
    public void say() {
        System.out.println("你给我画，我就给你书");
    }
    public void get() {
        System.out.println("李四获得了画");
    }
}
class ThreadDemo implements Runnable{
    private static Zhangsan zhangsan = new Zhangsan();//保证只有一个张三李四
    private static  Lisi lisi = new Lisi();
    public boolean tag = false;
    public void run() {
        if(tag) {
            synchronized (zhangsan) {
                zhangsan.say();
                try {
                    Thread.sleep(1000);//等待李四线程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lisi) {
                    zhangsan.get();
                }

            }
        }else {
            synchronized (lisi) {
                lisi.say();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (zhangsan) {
                    lisi.get();
                }
            }
        }
    }
}
public class TestSubThread4 {

    public static void main(String[] args) {
        ThreadDemo demo1 = new ThreadDemo();
        demo1.tag = true;
        ThreadDemo demo2 = new ThreadDemo();
        demo2.tag = false;
        Thread t1 = new Thread(demo1);
        Thread t2 = new Thread(demo2);
        t1.start();
        t2.start();

    }

}
