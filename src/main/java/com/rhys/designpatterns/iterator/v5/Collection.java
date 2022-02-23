package com.rhys.designpatterns.iterator.v5;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/21 9:06 下午
 */
public interface Collection {
    void add(Object obj);
    int size();
    Iterator iterator();
}
