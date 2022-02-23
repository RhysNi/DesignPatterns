package com.rhys.designpatterns.singleton;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/9 11:52 下午
 */
public class Singleton03 {
    private static Singleton03 INSTANCE;

    private Singleton03() {
    }

    public static Singleton03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton03.getInstance().hashCode());
            }).start();
        }
    }
}
