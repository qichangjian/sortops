package com.qcj.fanshe;

/**        class.forName()和classLoader区别：
java中class.forName()和classLoader都可用来对类进行加载。
class.forName()前者除了将类的.class文件加载到jvm中之外，还会对类进行解释，执行类中的static块。
而classLoader只干一件事情，就是将.class文件加载到jvm中，不会执行static中的内容,只有在newInstance才会去执行static块。
 */
public class TestDemo3 {
    public static void main(String[] args) throws ClassNotFoundException {
        //加载类                                          完全限定命名
        ClassLoader.getSystemClassLoader().loadClass("com.qcj.fanshe.Demo1");//只引起类的加载，不引起类的初始化

        //加载类，并初始化  第二个参数：true（默认false） 引起初始化 第三个参数:系统类加载器
        Class.forName("com.qcj.fanshe.Demo1",true,ClassLoader.getSystemClassLoader());
        Class.forName("com.qcj.fanshe.Demo1");
    }
}

class Demo1{
    static{
        System.out.println("Demo1 static");
    }
}