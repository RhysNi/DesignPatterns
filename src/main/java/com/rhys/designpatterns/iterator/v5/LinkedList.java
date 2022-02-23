package com.rhys.designpatterns.iterator.v5;

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

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator {
        private int currIndex = 0;

        @Override
        public boolean hasNext() {
            return size > currIndex;
        }

        @Override
        public Object next() {
            if (currIndex==0){
                currIndex++;
                return head.value;
            }
            currIndex++;
            head = head.next;
            return head.value;
        }
    }
}

class Node {
    public Object value;
    public Node next;

    public Node(Object value) {
        this.value = value;
    }

}