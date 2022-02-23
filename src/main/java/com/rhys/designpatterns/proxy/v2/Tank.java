package com.rhys.designpatterns.proxy.v2;

import java.util.Random;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/17 10:21 下午
 */
public class Tank implements Movable {
    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("Tank moving....");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("坦克移动花了:" + (endTime - startTime) + "ms");
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}

interface Movable {
    void move();
}