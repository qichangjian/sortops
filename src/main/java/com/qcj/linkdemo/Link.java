package com.qcj.linkdemo;

/**
 * 单向链表
 * 定义链表上的节点
 */
public class Link {
    public int data;//节点的内容
    public Link next;//下一个节点

    //初始化
    public Link(int data) {
        this.data = data;
        this.next = null;
    }

    //打印节点内容
    public void displayLink(){
        System.out.println("{" + data + "}");
    }
}
