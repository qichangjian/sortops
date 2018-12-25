package com.qcj.threaddemo.deadthread;

/**
 * 死锁测试
 */
public class DeadThread {
    A a = new A();//可以看做是共有的资源.
    B b = new B();

    public DeadThread() {
        a.start();
        b.start();
    }

    public static void main(String[] args) {
        new DeadThread();
    }

    //线程A
    class A extends Thread {
        @Override
        public void run() {
            getSZ();
        }

        synchronized public void getSZ() {
            System.out.println("我有勺子，我想要筷子");
            try {
                Thread.sleep(1000);
                b.getKZ();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //线程B
    class B extends Thread {
        @Override
        public void run() {
            getKZ();
        }

        public synchronized void getKZ() {
            System.out.println("我有筷子，我想要勺子");
            try {
                Thread.sleep(1000);
                a.getSZ();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
