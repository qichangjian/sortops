package com.qcj.fanshe;

/**
直接调用加载器
    static中的数据在编译器的时候就加载了
 */
public class TestDemo1 {
    static{
        System.out.println("static");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.qcj.fanshe.TestDemo1");//这句加不加，静态代码块都加载
    }
}
