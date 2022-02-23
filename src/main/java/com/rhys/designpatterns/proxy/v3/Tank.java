package com.rhys.designpatterns.proxy.v3;

import java.util.Random;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/17 10:21 下午
 */
public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("Tank moving....");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Tank2().move();
    }
}

class Tank2 extends Tank {
    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        super.move();
        long endTime = System.currentTimeMillis();
        System.out.println("坦克移动花了:" + (endTime - startTime) + "ms");
    }
}

interface Movable {
    void move();
}