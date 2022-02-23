package com.rhys.designpatterns.iterator.v1;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/19 7:55 下午
 */
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 15; i++) {
            list.add("s" + i);
        }
        System.out.println(list.size());
    }
}

class ArrayList {
    Object[] objects = new Object[10];
    private int index = 0;

    public void add(Object obj) {
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = obj;
        index++;
    }

    public int size() {
        return index;
    }
}
