package com.qcj.fanshe;


import java.lang.reflect.*;
import java.util.Arrays;

/**
 * 反射：获得运行时类的信息
 *          属性
 *          方法
 *          构造方法
 */
public class TestDemo6 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //从Person.class 中获取信息：反射
        //步骤一：获得字节码文件对应的在堆中对象
        //1. 方法1
        //Class<Person> c2 = Person.class;
        //2. 方法2 new
        //Class<? extends Person> c1 = new Person().getClass();
        //3. 方法3 完全限定命名
        Class<?> c = Class.forName("com.qcj.fanshe.Person");

        System.out.println("--------------属性-------------------");
        //步骤二 ： 有了对象后可以获得属性
        //获得共有的属性
        //Field[] fs = c.getFields();
        //获取 所有的属性  共有跟私有
        Field[] fs = c.getDeclaredFields();
        for (Field f:fs) {
            System.out.println(f.getName());//名
            System.out.println(f.getType());//数据类型
            System.out.println(Modifier.toString(f.getModifiers()));//访问权限 需要转换成string
        }
        Field f = c.getDeclaredField("no");
        //如果不怎么也不允许破坏封装 用安全管理器
        //System.setSecurityManager(new SecurityManager());
        f.setAccessible(true);//是否有访问权限 破坏了封装
        Object obj = c.newInstance();//获得一个实例对象 需要加入f.setAccessible(true);/
        f.set(obj,22);//设置对象obj 的 no是22
        System.out.println("f.get(obj):"+f.get(obj)); //得到对象obj的no属性的值

        //-------------------------获得方法
        System.out.println("------------方法-------------------");
        Method[] ms = c.getDeclaredMethods();
        for (Method m:ms) {
            System.out.println(m.getName());
            System.out.println(Modifier.toString(m.getModifiers()));
            System.out.println(m.getReturnType());
            System.out.println(Arrays.toString(m.getParameterTypes()));//返回参数列表
            System.out.println("------");
        }
        //返回单个方法
        Method m1 = c.getDeclaredMethod("f");
        m1.invoke(obj);// 调用方法 （对象+参数）
        //带返回值的
        Method m2 = c.getDeclaredMethod("sf",String.class,int.class);//参数类型
        String s = (String)m2.invoke(obj,"hel" , 2);
        System.out.println("返回值：" + s);

        System.out.println("----------------构造方法---------------------");
        Constructor[] crs = c.getConstructors();
        for (Constructor cr:crs) {
            System.out.println(Arrays.toString(cr.getParameterTypes()));//参数类型
        }
        //单个构造
        Constructor cr1 = c.getConstructor();//得到无参构造
        cr1.newInstance();//用newInstance与用new是区别的，区别在于创建对象的方式不一样，前者是使用类加载机制
        Constructor cr2 = c.getConstructor(int.class,String.class);//有参数构造
        cr2.newInstance(111,"abc");

    }
}

class Person{
    private int no;
    public String name;

    public Person() {
        System.out.println("无参数构造");
    }

    public Person(int no, String name) {
        this.no = no;
        this.name = name;
        System.out.println("有参数构造");
    }

    public void f(){
        System.out.println("无参数f");
    }

    public String sf(String str,int num){
        System.out.println("带参数的sf");
        return str + num;
    }
}
