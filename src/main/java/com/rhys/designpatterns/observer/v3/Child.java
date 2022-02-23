package com.rhys.designpatterns.observer.v3;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 11:18 下午
 */
public class Child {
    private boolean cry = false;
    private  Dad dad = new Dad();
    public boolean isCry() {
        return cry;
    }

    public void  wakeUp(){
        cry=true;
        dad.feed();
    }
}
