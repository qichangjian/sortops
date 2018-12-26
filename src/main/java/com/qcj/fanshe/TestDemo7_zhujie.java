package com.qcj.fanshe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TestDemo7_zhujie {
    public static void main(String[] args) {

    }
}

class Base{
    public void af(){}

    //已经过时
    @Deprecated
    public void f(){}

    //镇压警告 类型检查
    @SuppressWarnings("unchecked")
    public void sf(){
        //已经定义没使用
        //镇压警告  unused变量声明没有使用
        @SuppressWarnings("unused")
        int n;

        //镇压警告 原生类型
        @SuppressWarnings({"rawtypes","unused"})
        List list= new ArrayList();


    }
}

class SubBase extends Base{
    //重载
    @Override
    public void sf() {
        super.sf();
    }
}

//函数式接口
@FunctionalInterface
interface Test{
    void test();
}

//@SuppressWarnings("serial")//版本号
@SuppressWarnings("all")//所有的
class DemoNew implements Serializable{
}