package com.rhys.designpatterns.observer.v4;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 11:18 下午
 */
public class Child {
    private boolean cry = false;
    private Dad dad = new Dad();
    private Mum mum = new Mum();
    private Dog dog = new Dog();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        dad.feed();
        mum.hugging();
        dog.woof();
    }
}
