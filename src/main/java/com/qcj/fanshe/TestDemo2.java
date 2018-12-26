package com.qcj.fanshe;

/**
 * 三种加载器的区别：
 * 自定义加载器 -》 系统（应用）类加载器 -》 扩展类加载器 -》 根类加载器
 */
public class TestDemo2 {
    public static void main(String[] args) {
        //系统类（应用类）加载器     使用范围我们平时写的java在classpath路径下的经过编译的.class文件
        ClassLoader loader = TestDemo2.class.getClassLoader();
        System.out.println(loader);//看看谁加载的
        //扩展类加载器   父加载器 父扩展     加载jdk/jre/lib/ext下的扩展jar包
        System.out.println(loader.getParent());
        //根加载器                          加载jdk/jre/lib下的jar包
        System.out.println(loader.getParent().getParent());
    }
}
