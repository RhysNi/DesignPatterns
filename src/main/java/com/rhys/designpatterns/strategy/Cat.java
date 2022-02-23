package com.rhys.designpatterns.strategy;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/10 9:31 下午
 */
public class Cat {
    public int weight;
    public int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
