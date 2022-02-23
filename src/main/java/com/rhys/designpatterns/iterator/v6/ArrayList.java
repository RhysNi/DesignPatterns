package com.rhys.designpatterns.iterator.v6;

public class ArrayList<E> implements Collection<E> {
    E[] objects = (E[]) new Object[10];

    private int index = 0;

    @Override
    public void add(E obj) {
        if (index == objects.length) {
            E[] newObjects = (E[]) new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = obj;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator {
        private int currIndex = 0;

        @Override
        public boolean hasNext() {
            return index > currIndex;
        }

        @Override
        public Object next() {
            Object obj = objects[currIndex];
            currIndex++;
            return obj;
        }
    }
}
