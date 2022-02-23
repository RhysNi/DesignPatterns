package com.rhys.designpatterns.singleton;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/10 12:59 上午
 */
public enum Singleton08 {
    INSTANCE;
    
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton08.INSTANCE.hashCode());
            }).start();
        }
    }
}
