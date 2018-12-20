package com.qcj.designpattern.sigleton_paattern._06enum;

/**
 * 测试
 *     从 singleton 类获取唯一的对象。
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //获取唯一可用的对象
        Singleton singleton = Singleton.INSRANCE;

        //显示消息
        singleton.whateverMethod();
    }
}
