package com.rhys.designpatterns.singleton;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/9 11:40 下午
 */
public  class Singleton01 {
    public static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}
