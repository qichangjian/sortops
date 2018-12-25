package com.qcj.linkdemo.double_linkedList;

/**
 * 双向链表的具体实现
 */
public class DoubleLinkedList {
    private Node first;//头节点
    private Node last;//尾节点
    private int size;//链表长度

    public DoubleLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    //链表大小
    public int size(){
        return size;
    }

    //链表是否为空
    public boolean isEmpty(){
        return (first == null);
    }

    //插入头节点
    public void insertFirst(long value){
        Node newLink = new Node(value);
        if(isEmpty()){
            last = newLink;
        }else {
            //前first的node赋值为newLink
            first.previous = newLink;//newLink <-- oldFirst.previous
            //newLink的下一个node为first
            newLink.next = first;//newLink.next --> first
        }
        first = newLink;//first --> newLink//第一个赋值为新插入的
        size ++;
    }

    //插入尾节点
    public void insertLast(long value){
        Node newLink = new Node(value);
        if(isEmpty()){
            first = newLink;
        }else{
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;//最后一个赋值为新插入的
        size ++;
    }

    //删除头节点
    public Node deleteFirst(){
        if(first == null){
            System.out.println("链表为空");
            return null;
        }
        Node temp = first;
        if(first.next == null){//如果只有一个节点
            last = null;
        }else{
            first.next.previous = null;//就是first的下一个node的前指针为空
        }
        first = first.next;//第一个为第一个的下一个
        size --;
        return temp;
    }

    //删除尾节点
    public Node deleteLast(){
        if(last == null){//最后一个节点为空，证明没有
            System.out.println("链表为空");
            return null;
        }
        Node temp = last;//暂存要删除的最后一个
        if(last.previous == null){//只有一个节点
            first = null;
        }else{
            last.previous.next = null;//last的前一个的next为null
        }
        last = last.previous;
        size --;
        return temp;
    }

    //在key后面插入值为value的新节点
    public boolean insertAfter(long key,long value){
        Node current = first;//从第一个开始
        while(current.data != key){//对比传入的date
            current = current.next;//下一个
            if(current == null){//如果下一个为空，就是最后一个
                System.out.println("不存在值为" + value + "的节点！");
                return false;
            }
        }
        if(current == last){//当前值为最后一个
            insertLast(value);
        }else{
            Node newLink = new Node(value);//要插入的节点
            newLink.next = current.next;//插入节点的下一个为匹配节点的下一个
            current.next.previous = newLink;//匹配节点的前一个为新加入的节点
            newLink.previous = current;//插入的前一个为匹配节点
            current.next = newLink;//匹配节点的后一个节点为新加入的节点
            size ++;
        }
        return true;//插入成功
    }

    //删除指定位置的节点
    public Node deleteNode(long key){
        Node current = first;//当前节点为第一个节点
        while(current.data != key){
            current = current.next;
            if(current == null){
                System.out.println("不存在该节点");
                return null;
            }
        }
        if(current == first){//如果匹配的是第一个
            deleteFirst();
        }else if(current == last){
            deleteLast();//匹配的是最后一个
        }else{
            current.previous.next = current.next;//当前节点的前一个的后一个为 当前的后一个
            current.next.previous = current.previous;//当前节点的后一个的前一个为 当前的前一个
            size --;
        }
        return current;
    }

    //从头到尾遍历链表
    public void displayForward(){
        System.out.println("List(first --> last):");
        System.out.print("[");
        Node current = first;
        while(current != null){
            current.displayLink();//调用节点的显示方法
            current = current.next;
        }
        System.out.println("]");
    }

    //从尾到头遍历链表
    public void displayBackward(){
        System.out.println("List(last --> first)");
        System.out.print("[");
        Node current = last;
        while(current != null){
            current.displayLink();
            current = current.previous;
        }
        System.out.println("]");
    }

}
