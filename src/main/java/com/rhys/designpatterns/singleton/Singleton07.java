package com.rhys.designpatterns.singleton;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/10 12:24 上午
 */
public class Singleton07 {

    private Singleton07() {
    }

    private static class Singleton {
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    public static Singleton07 getInstance() {
        return Singleton.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton07.getInstance().hashCode());
            }).start();
        }
    }
}
