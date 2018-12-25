package com.qcj.linkdemo.double_linkedList;

/**
 * 双向链表中的node
 */
public class Node {
    public long data;//当前node的数据值
    public Node next;//后一个node
    public Node previous;//前一个node

    public Node(long value) {
        this.data = value;
        this.next = null;
        this.previous = null;
    }

    //打印节点中node值
    public void displayLink(){
        System.out.print(data + " ");
    }
}
