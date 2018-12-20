package com.qcj.designpattern.sigleton_paattern._04double_checked_locking;

/**
 * 4、双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 *
 * 是否 Lazy 初始化：
 *      是
 * 是否多线程安全：
 *      是
 * 实现难度：
 *      较复杂
 * 描述：
 *      这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */

/**
 * Java 5之后，volatile（容变的）关键字
 * https://www.cnblogs.com/dolphin0520/p/3920373.html
 */
public class Singleton {
    private volatile static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("双重校验锁DCL");
    }
}
