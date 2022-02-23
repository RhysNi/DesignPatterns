package com.rhys.designpatterns.factory.abstractfactory.mage;

import com.rhys.designpatterns.factory.abstractfactory.abstractclass.Food;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/13 10:52 下午
 */
public class Mushroom extends Food {
    @Override
    public void  print(){
        System.out.println("🍄 🍄 🍄 🍄 🍄");
    }
}
