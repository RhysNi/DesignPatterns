package com.rhys.designpatterns.proxy.v6;

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
        new TankLogProxy(
            new TankTimeProxy(
                new Tank()
            )
        ).move();
    }
}

class TankTimeProxy implements Movable {
    Movable movable;

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        movable.move();
        long endTime = System.currentTimeMillis();
        System.out.println("坦克移动花了:" + (endTime - startTime) + "ms");
    }

    public TankTimeProxy(Movable movable) {
        this.movable = movable;
    }
}

class TankLogProxy implements Movable {
    Movable movable;

    @Override
    public void move() {
        System.out.println("start moving ...");
        movable.move();
        System.out.println("stopped!");
    }

    public TankLogProxy(Movable movable) {
        this.movable = movable;
    }
}

interface Movable {
    void move();
}