package com.rhys.designpatterns.proxy.v7;

import java.lang.reflect.Proxy;
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
        Tank tank = new Tank();

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        // System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true"); //新版jdk
        Movable movable = (Movable) Proxy.newProxyInstance(
                Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                (proxy,   method, args1) -> {
                    System.out.println("method:" + method.getName() + "====start====");
                    Object obj = method.invoke(tank, args1);
                    System.out.println("method:" + method.getName() + "====end====");
                    return obj;
                });
        movable.move();
    }
}

interface Movable {
    void move();
}