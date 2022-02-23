package com.rhys.designpatterns.iterator.v6;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/21 9:06 下午
 */
public interface Collection<E> {
    void add(E obj);
    int size();
    Iterator iterator();
}
