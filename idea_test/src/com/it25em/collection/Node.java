package com.it25em.collection;

public class Node {
    Object data;
    //下一个节点
    Node next;

    public Node() {
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
