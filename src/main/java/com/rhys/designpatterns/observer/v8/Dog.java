package com.rhys.designpatterns.observer.v8;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 11:26 下午
 */
public class Dog implements Observer {
    public void woof(){
        System.out.println("Dog woof...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        woof();
    }
}
