package com.rhys.designpatterns.state.thread;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/24 12:45 上午
 */
public abstract class ThreadState {
    abstract void move(Action action);
    abstract void run();
}
