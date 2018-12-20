package com.qcj.queuedemo;

/**
 * 数组实现一个队列
 *     队列是先进先出，只能访问头部数据
 */
public class ArrayQueue {
    private long[] a;
    private int size;//数组大小
    private int nIteams;//实际存储数量：记录队列中有多少值  删除就-- 添加就++
    private int front;//头：主要是删除的时候记录，删除到哪里了
    private int rear;//尾：主要是添加的时候记录，添加到哪里了

    public ArrayQueue(int maxSize){
        this.size = maxSize;
        a = new long[size];
        front = 0;
        nIteams = 0;
        rear = -1;
    }

    //添加一个
    public void add(long value){
        if(isFull()){
            System.out.println("队列已经满了");
            return;
        }
        rear = ++rear % size;//
        a[rear] = value;//尾指针满了就循环到0处,这句相当于下面注释内容
        nIteams ++;
        /*
        if(rear == size-1){
            rear = -1;
        }
        a[++rear] = value;
        */
    }

    //删除一个
    public long remove(){
        if(isEmpty()){
            System.out.println("队列为空");
            return 0;
        }
        nIteams --;
        front = front % size;
        return a[front++];//去出来一个头部就减少一个 头就添加1
    }

    //查看第一个
    public long peek(){
        if(isEmpty()){
            System.out.println("队列为空");
            return 0;
        }
        return a[front];
    }

    public void display(){
        /*if(isEmpty()){
            System.out.println("队列为空");
            return;
        }*/
        System.out.print("[");
        int item = front;
        for (int i = 0; i < nIteams; i++) {
            System.out.print(a[item++ % size]);
            if(i != nIteams-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    //是否满了
    public boolean isFull(){
        return (nIteams == size);
    }

    //是否为空
    public boolean isEmpty(){
        return (nIteams == 0);
    }

    //队列的大小
    public int size(){
        return nIteams;
    }

}
