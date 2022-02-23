package com.rhys.designpatterns.state.thread;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/24 12:49 上午
 */
public class RunningState extends ThreadState {
    private Thread thread;

    public RunningState(Thread thread) {
        this.thread = thread;
    }

    @Override
    void move(Action action) {
        if (action.msg=="terminated"){
            thread.state=new TerminatedState(thread);
        }
    }

    @Override
    void run() {

    }
}
