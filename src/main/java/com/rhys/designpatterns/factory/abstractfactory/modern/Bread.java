package com.rhys.designpatterns.factory.abstractfactory.modern;

import com.rhys.designpatterns.factory.abstractfactory.abstractclass.Food;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/13 10:49 下午
 */
public class Bread extends Food {
    @Override
    public void print() {
        System.out.println("🍞 🍞 🍞 🍞 🍞");
    }
}
