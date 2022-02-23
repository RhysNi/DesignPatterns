package com.rhys.designpatterns.factory.abstractfactory.mage;

import com.rhys.designpatterns.factory.abstractfactory.abstractclass.Weapon;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/13 10:48 下午
 */
public class MagicWand extends Weapon {
    @Override
    public void shoot(){
        System.out.println("💣 💣 💣 💣 💣");
    }
}
