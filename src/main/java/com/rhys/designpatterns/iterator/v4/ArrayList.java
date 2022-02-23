package com.rhys.designpatterns.iterator.v4;

public class ArrayList implements Collection {
    Object[] objects = new Object[10];

    private int index = 0;

    @Override
    public void add(Object obj) {
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
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
}
