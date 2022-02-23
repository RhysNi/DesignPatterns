package com.rhys.designpatterns.observer.v2;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 11:18 下午
 */
public class Child {
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void  wakeUp(){
        System.out.println("Wake Up ! Crying...");
        cry=true;
    }
}
