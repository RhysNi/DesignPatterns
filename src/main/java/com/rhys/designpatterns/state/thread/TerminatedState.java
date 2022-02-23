package com.rhys.designpatterns.state.thread;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/24 12:51 上午
 */
public class TerminatedState extends ThreadState {
    private Thread thread;

    public TerminatedState(Thread thread) {
        this.thread = thread;
    }

    @Override
    void move(Action action) {
        // do processing...
    }

    @Override
    void run() {

    }
}
