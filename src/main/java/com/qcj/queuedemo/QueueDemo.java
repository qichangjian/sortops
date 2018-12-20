package com.qcj.queuedemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        //测试真实队列
        /*Queue queue = new PriorityQueue();
        System.out.println(queue.size());
        System.out.println(queue);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);*/

        //测试自己的队列
        ArrayQueue queue = new ArrayQueue(5);
        queue.display();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.size());
        queue.display();
        queue.remove();
        queue.display();
        System.out.println(queue.peek());
    }
}
