package com.rhys.designpatterns.factory.abstractfactory.abstractclass;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/13 10:55 下午
 */
public abstract class AbstractFactory {
    public abstract Vehicle createVehicle();
    public abstract Food createFood();
    public abstract Weapon createWeapon();
}
