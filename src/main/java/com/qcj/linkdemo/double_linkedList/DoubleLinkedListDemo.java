package com.qcj.linkdemo.double_linkedList;

/**
 * 双向链表测试
 */
public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertLast(9);
        doubleLinkedList.insertFirst(1);
        doubleLinkedList.insertAfter(1,2);
        doubleLinkedList.insertAfter(2,3);
        doubleLinkedList.insertAfter(9,10);
        doubleLinkedList.displayBackward();
        doubleLinkedList.displayForward();
        System.out.println(doubleLinkedList.isEmpty());
        System.out.println(doubleLinkedList.size());

        //删除测试
        doubleLinkedList.deleteFirst();
        doubleLinkedList.deleteLast();
        doubleLinkedList.deleteNode(3);
        doubleLinkedList.displayBackward();
        doubleLinkedList.displayForward();
    }
}
