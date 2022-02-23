package com.rhys.designpatterns.proxy.springaop.v2;

import java.util.Random;

/**
 * 记录坦克的移动时间
 *
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/17 10:21 下午
 */
public class  Tank {
    /**
     * 模拟坦克移动了一段时间
     *
     * @param
     * @return void
     * @author Rhys.Ni
     * @date 2022/2/17
     */
    public void move() {
        System.out.println("Tank moving....");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

