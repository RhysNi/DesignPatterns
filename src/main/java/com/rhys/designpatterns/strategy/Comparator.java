package com.rhys.designpatterns.strategy;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/10 11:01 下午
 */
@FunctionalInterface
public interface Comparator <T>{
    /**
     * 比较
     * @author Rhys.Ni
     * @date 2022/2/11
     * @param o1
     * @param o2
     * @return int
     */
    int compare(T o1,T o2);
}
