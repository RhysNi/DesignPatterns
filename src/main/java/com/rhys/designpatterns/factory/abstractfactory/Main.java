package com.rhys.designpatterns.factory.abstractfactory;

import com.rhys.designpatterns.factory.abstractfactory.abstractclass.AbstractFactory;
import com.rhys.designpatterns.factory.abstractfactory.mage.MagicFactory;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/13 10:18 下午
 */
public class Main {
    public static void main(String[] args) {
        // AbstractFactory factory = new ModernFactory();
        AbstractFactory factory = new MagicFactory();
        factory.createVehicle().go();
        factory.createFood().print();
        factory.createWeapon().shoot();
    }
}
