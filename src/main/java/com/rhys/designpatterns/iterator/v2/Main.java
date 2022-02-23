package com.rhys.designpatterns.iterator.v2;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/21 8:54 下午
 */
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 15; i++) {
            list.add("s" + i);
        }
        System.out.println(list.size);
    }
}

class LinkedList {
    private Node head = null;
    private Node tail = null;
    public int size = 0;

    public void add(Object obj) {
        Node node = new Node(obj);
        node.next = null;

        if (head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;
        size++;
    }
}

class Node {
    private Object value;
    Node next;

    public Node(Object value) {
        this.value = value;
    }
}