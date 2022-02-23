package com.rhys.designpatterns.observer.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 11:18 下午
 */
public class Child {
    private boolean cry = false;
    private List<Observer> observerList = new ArrayList<>();

    {
        observerList.add(new Dad());
        observerList.add(new Mum());
        observerList.add(new Dog());
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        WakeUpEvent wakeUpEvent = new WakeUpEvent(System.currentTimeMillis(), "厨房");
        for (Observer observer : observerList) {
            observer.actionOnWakeUp(wakeUpEvent);
        }
    }
}
