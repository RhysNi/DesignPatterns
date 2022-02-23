package com.rhys.designpatterns.flyweight;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/16 2:40 上午
 */
public class Main {
    public static void main(String[] args) {
        BulletPool bulletPool = new BulletPool();
        for (int i = 0; i <10 ; i++) {
            Bullet bullet = bulletPool.getBullet();
            System.out.println(bullet);
        }
    }
}
