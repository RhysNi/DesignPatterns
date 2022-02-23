package com.rhys.designpatterns.observer.v8;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 11:25 下午
 */
public class Mum implements Observer {
    public void hugging(){
        System.out.println("Mum hugging...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        hugging();
    }
}
