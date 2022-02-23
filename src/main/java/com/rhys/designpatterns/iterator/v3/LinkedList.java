package com.rhys.designpatterns.iterator.v3;

public class LinkedList implements Collection {
    private Node head = null;
    private Node tail = null;
    public int size = 0;

    @Override
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

    @Override
    public int size() {
        return size;
    }
}

class Node {
    public Object value;
    public Node next;

    public Node(Object value) {
        this.value = value;
    }
}

