package com.rhys.designpatterns.factory.abstractfactory.modern;

import com.rhys.designpatterns.factory.abstractfactory.abstractclass.Weapon;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/13 10:47 δΈε
 */
public class AK47 extends Weapon {
    @Override
    public void shoot(){
        System.out.println("π« π« π« π« π«");
    }
}
