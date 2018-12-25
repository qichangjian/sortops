package com.qcj.linkdemo.single_linkedList;

import com.qcj.linkdemo.single_linkedList.LinkedList;

/*
    测试有序单向链表
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insertFirst(2);
        linkedList.insert(3);
        linkedList.displayList();
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());
        linkedList.find(1).displayLink();
        linkedList.deleteFirst();
        linkedList.delete(3);
        linkedList.displayList();
    }
}
