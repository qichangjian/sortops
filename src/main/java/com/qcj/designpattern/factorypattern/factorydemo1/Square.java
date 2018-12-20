package com.qcj.designpattern.factorypattern.factorydemo1;

/**
 * 步骤 2
 * 创建实现接口的实体类
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
