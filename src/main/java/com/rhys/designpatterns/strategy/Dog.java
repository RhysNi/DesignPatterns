package com.rhys.designpatterns.strategy;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/10 9:31 下午
 */
public class Dog{
    public int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
