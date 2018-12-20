package com.qcj.stackdemo;

/**
 * 用数组写一个栈
 *      栈的特点：栈是先进后出，只能访问栈顶的数据
 */
public class ArrayStack {
    private long[] a;
    private int size;//栈数组的大小
    private int top;//栈顶

    public ArrayStack(int maxSize) {
        this.size = maxSize;
        this.a = new long[size];
        this.top = -1;//表示空栈
    }

    //入栈
    public void push(long value){
        if(isFull()){
            System.out.println("栈已经满！");
            return;
        }
        a[++top] = value;
    }

    //返回栈顶内容，但是不删除
    public void peek(){
        if(isEmpty()){
            System.out.println("栈中没有数据！");
        }
        System.out.println(a[top]);
    }

    //弹出栈顶内容，删除
    public long pop(){
        if(isEmpty()){
            System.out.println("栈中没有数据！");
            return 0;
        }
        return a[top--];
    }

    //size栈的大小
    public int size(){
        return top + 1;
    }

    //是否为空
    public boolean isEmpty() {
        return (top == -1);
    }

    //是否满了
    public boolean isFull() {
        return (top == size - 1);
    }

    //显示
    public void display(){
        System.out.print("[");
        for (int i = top; i >=0 ; i--) {
            System.out.print(a[i]);
            if(i!=0){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
