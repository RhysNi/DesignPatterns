package com.rhys.designpatterns.iterator.v3;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/21 9:47 下午
 */
public class Main {

    public static void main(String[] args) {
        Collection list = new LinkedList();
        for (int i = 0; i < 15; i++) {
            list.add("s" + i);
        }
        System.out.println(list.size());
    }
}
