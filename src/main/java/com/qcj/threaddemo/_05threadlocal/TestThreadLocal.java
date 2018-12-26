package com.qcj.threaddemo._05threadlocal;

/**
 * 本地线程变量：
 * 描述： ThreadLocal让每个线程都拥有一个变量的副本。各自操作
 *
 * threadlocal:
 *     		本地线程副本  ----   备份   在副本中 所有的备份和原始文件都是同等地位的   没有任何主次之分的
 *     		int i;
 *     		i=1;
 *     		应用场景：
 *     			本地的变量   创建出来多个副本  每个线程只取其中一个副本操作
 *     			应用在一些对象比较难初始化的变量上（初始化的时候耗时过长  初始化的时候做的事情过多）  需要多个线程使用的
 *     			为了避每个线进行操作的时候都初始化这个对象  可以使用本地线程副本  相当于直接初始化一次  进行复制的工作
 *     			tomcat   3-8s
 */
public class TestThreadLocal {

    //在上面的例子中首先利用匿名类覆盖ThreadLocal的initialValue()方法指定初始值
    //泛型----需要定义的变量的类型
    //  int seqNum=0
    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
        @Override
        //对变量进行初始化的方法   类似于  i=5;
        protected Integer initialValue() {
            //这个返回值就是变量的初始值  返回值----初始化的值
            return 0;
        }
    };

    public static void main(String[] args) {

        //创建三个线程共享seqNum各自产生序列号
        TestThreadLocal sn = new TestThreadLocal();
        new TestThread(sn).start();
        new TestThread(sn).start();
        new TestThread(sn).start();
    }

    private static class TestThread extends Thread {
        private TestThreadLocal sn;

        public TestThread(TestThreadLocal sn) {
            this.sn = sn;
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("thread -" + Thread.currentThread().getName() + " -> " + sn.getNextNum());
            }
        }
    }

    //通过getNextNum获取下一个序列值
    public int getNextNum() {
        //设置变量的值   seqNum++
        seqNum.set(seqNum.get() + 1);
        return seqNum.get();
    }
}
