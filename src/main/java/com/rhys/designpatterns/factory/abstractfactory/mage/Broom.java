package com.rhys.designpatterns.factory.abstractfactory.mage;

import com.rhys.designpatterns.factory.abstractfactory.abstractclass.Vehicle;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/14 12:16 上午
 */
public class Broom extends Vehicle {
    @Override
    public void go() {
        System.out.println("🧹 🧹 🧹 🧹 🧹");
    }
}
