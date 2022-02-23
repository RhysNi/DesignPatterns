package com.rhys.designpatterns.proxy.v4;

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
        new TankTimeProxy(new Tank()).move();

    }
}

class TankTimeProxy implements Movable {
    Tank tank;

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        tank.move();
        long endTime = System.currentTimeMillis();
        System.out.println("坦克移动花了:" + (endTime - startTime) + "ms");
    }

    public TankTimeProxy(Tank tank) {
        this.tank = tank;
    }
}

interface Movable {
    void move();
}