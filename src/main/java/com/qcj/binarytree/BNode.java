package com.qcj.binarytree;

//二叉树节点
public class BNode {
    public int key;
    public double data;
    public BNode parent;
    public BNode leftChild;
    public BNode rightChild;

    public void displayNode(){
        System.out.println("{"+ key + ":" + data + "}");
    }
}
