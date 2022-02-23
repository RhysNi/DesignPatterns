package com.rhys.designpatterns.factory.abstractfactory.modern;

import com.rhys.designpatterns.factory.abstractfactory.abstractclass.Vehicle;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/13 10:17 下午
 */
public class Car extends Vehicle {
    @Override
    public void go(){
        System.out.println("🚗 🚗 🚗 🚗 🚗");
    }
}
