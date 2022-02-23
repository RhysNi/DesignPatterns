package com.rhys.designpatterns.factory;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/13 10:17 下午
 */
public class Car implements Moveable{
    @Override
    public void go(){
        System.out.println("Car go ......");
    }
}
