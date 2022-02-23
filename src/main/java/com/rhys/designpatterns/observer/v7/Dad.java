package com.rhys.designpatterns.observer.v7;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 11:22 下午
 */
public class Dad implements Observer {
    public void feed(){
        System.out.println("Dad feeding......");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        feed();
    }
}
