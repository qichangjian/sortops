package com.qcj.stackdemo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //真实栈的测试
        /*Stack stack = new Stack();
        System.out.println(stack);;
        stack.push(1);
        stack.push("2");
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack);
        stack.empty();*/

        //测试自己写的堆栈
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.display();
        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack.isFull());
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.display();
        arrayStack.peek();
        arrayStack.pop();
        arrayStack.display();
    }
}
