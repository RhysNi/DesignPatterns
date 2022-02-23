package com.rhys.designpatterns.factory;

import com.rhys.designpatterns.factory.factorymethod.CarFactory;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/13 10:18 下午
 */
public class Main {
    public static void main(String[] args) {
        // Moveable m= new Plane();
        // Moveable m1= new Car();
        // m.go();
        // m1.go();

        Moveable m2 = new CarFactory().create();
        m2.go();
    }
}
