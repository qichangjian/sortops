package com.qcj.designpattern.decoratorpattern.decratordemo1;

/**
 * 步骤 2
 * 创建实现接口的实体类。
 */
public class RealImage implements Image{

    @Override
    public void display() {
        System.out.println("RealImage display!");
    }

    public void showMessage(){
        System.out.println("RealImage showMessage!");
    }
}
