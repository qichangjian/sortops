package com.qcj.fanshe;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**   自定义类加载器（重要）
 * 注意：需要重写ClassLoader.loadClass中调用的findClass方法
 *      主要用于自定义的class(也就是不在classpath范围内的class文件)
 *
 *     前期需要在d盘下，写一个C.java doc窗口编译 javac C.java 得到想要的 C.class文件
 */
public class TestDemo4 {
    public static void main(String[] args) throws ClassNotFoundException {
        //自定义类加载器 加载类 .class
        MyLoader my = new MyLoader("d:/");
        Class c = Class.forName("C",true,my);//是true 引起初始化(所以会调用static中的内容)   false 不显示
        System.out.println(c.getClassLoader());//获得是哪个类加载的
        //断开
    }
}

//自定义类加载器
class MyLoader extends ClassLoader{
    String path;
    MyLoader(String path){
        this.path = path;
    }

    //需要重写findClass方法
    //name 传进来的是完全限定命名
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> c = null;
        //"d:/" + "c" + ".class" -> "d:/c.class"
        //有包名
        //path = path + name.replace(".","/").concat(".class");//有包名就替
        //没有包名
        path = path + name.concat(".class");

        //包名有了 需要用流读取
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(path);
            byte[] b = new byte[fin.available()];
            int len = fin.read(b);//读取class中内容到 b数组
            c = this.defineClass(name,b,0,len);//把b中存在的东西解析成方法区能够识别的方式
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return c;
    }
}
