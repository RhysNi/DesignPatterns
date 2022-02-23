package com.rhys.designpatterns.singleton;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/9 11:43 下午
 */
public class Singleton02 {
    private static final Singleton02 INSTANCE;

    static {
        INSTANCE = new Singleton02();
    }

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        return INSTANCE;
    }
}
