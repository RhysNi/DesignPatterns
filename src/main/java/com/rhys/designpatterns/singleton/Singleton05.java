package com.rhys.designpatterns.singleton;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/10 12:08 上午
 */
public class Singleton05 {
    private static Singleton05 INSTANCE;

    private Singleton05() {
    }

    public static Singleton05 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton05.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Singleton05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton05.getInstance().hashCode());
            }).start();
        }
    }
}
