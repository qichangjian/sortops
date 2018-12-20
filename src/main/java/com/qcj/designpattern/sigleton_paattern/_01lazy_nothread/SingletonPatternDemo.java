package com.qcj.designpattern.sigleton_paattern._01lazy_nothread;
/**
 * 测试
 *     从 singleton 类获取唯一的对象。
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //Singleton object = new Singleton();

        //获取唯一可用的对象
        Singleton singleton = Singleton.getInstance();

        //显示消息
        singleton.showMessage();
    }
}
