package com.rhys.designpatterns.factory.factorymethod;

import com.rhys.designpatterns.factory.Car;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/13 10:31 下午
 */
public class CarFactory {
    public Car create(){
        System.out.println("a car created");
        return new Car();
    }
}
