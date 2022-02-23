package com.rhys.designpatterns.state.thread;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/24 12:47 上午
 */
public class NewState extends ThreadState {
    public Thread thread;

    public NewState(Thread thread) {
        this.thread = thread;
    }

    @Override
    void move(Action action) {
        if (action.msg=="start"){
            thread.state=new RunningState(thread);
        }
    }

    @Override
    void run() {

    }
}
