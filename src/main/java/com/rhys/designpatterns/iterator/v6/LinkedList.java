package com.rhys.designpatterns.iterator.v6;

public class LinkedList<E> implements Collection<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    public int size = 0;

    @Override
    public void add(E obj) {
        Node<E> node = new Node(obj);
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
        public E next() {
            if (currIndex == 0) {
                currIndex++;
                return head.value;
            }
            currIndex++;
            head = head.next;
            return head.value;
        }
    }
}

class Node<E> {
    public E value;
    public Node<E> next;

    public Node(E value) {
        this.value = value;
    }

}