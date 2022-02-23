package com.rhys.designpatterns.factory.simplefactory;

import com.rhys.designpatterns.factory.Car;
import com.rhys.designpatterns.factory.Plane;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/13 10:26 下午
 */
public class SimpleFactory {
    public Car createCar(){
        //....before processing
        return new Car();
    }

    public Plane createPlane(){
        //....before processing
        return new Plane();
    }
}
