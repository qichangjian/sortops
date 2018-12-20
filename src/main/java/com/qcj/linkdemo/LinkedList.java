package com.qcj.linkdemo;

/**
 * 单向链表
 */
public class LinkedList {
    private Link first;//第一个节点
    private int nElem;//链表中节点数量

    public LinkedList(){
        first = null;
        nElem = 0;
    }


    //添加头结点
    public void insertFirst(int value){
        Link newLink = new Link(value);
        newLink.next = first;//newLink-->old first
        first = newLink;//first-->newLink
        nElem ++;
    }

    //删除头节点
    public Link deleteFirst(){
        if(isEmpty()){
            System.out.println("链表为空");
            return null;
        }
        Link temp = first;
        first = first.next;
        nElem --;
        return temp;
    }

    /************************************************************
     ***下面是有序链表的插入***
     ***这样简单排序就可以用链表来实现，复杂度为O(N)
     ***定义一个方法，传入一个数组，
     ***在方法内，遍历数组并调用insert方法就可以将数组中的数据排好序
     ***********************************************************/
    public void insert(int value){
        Link newLink = new Link(value);
        Link previous = null;
        Link current = first;

    }

    //链表是否为空
    public boolean isEmpty(){
        return (first == null);
    }

    //链表中节点个数
    public int size(){
        return nElem;
    }
}
