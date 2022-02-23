package com.rhys.designpatterns.factory;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/13 10:18 下午
 */
public class Plane implements Moveable{
    @Override
    public void go(){
        System.out.println("Plane flying ....");
    }
}
