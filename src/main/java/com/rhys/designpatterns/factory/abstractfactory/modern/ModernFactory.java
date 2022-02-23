package com.rhys.designpatterns.factory.abstractfactory.modern;

import com.rhys.designpatterns.factory.abstractfactory.abstractclass.AbstractFactory;
import com.rhys.designpatterns.factory.abstractfactory.abstractclass.Food;
import com.rhys.designpatterns.factory.abstractfactory.abstractclass.Vehicle;
import com.rhys.designpatterns.factory.abstractfactory.abstractclass.Weapon;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/14 12:17 上午
 */
public class ModernFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }
}
