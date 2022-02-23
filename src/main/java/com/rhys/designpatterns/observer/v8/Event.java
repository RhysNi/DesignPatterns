package com.rhys.designpatterns.observer.v8;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/16 12:05 上午
 */
public abstract class Event<T>{
    public abstract T getSource();
}
