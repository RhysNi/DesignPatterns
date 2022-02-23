package com.rhys.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/16 2:38 上午
 */
public class BulletPool {
    List<Bullet> bullets = new ArrayList<>();

    {
        for (int i = 0; i < 5 ; i++) {
            bullets.add(new Bullet());
        }
    }

    public Bullet getBullet(){
        for (int i = 0; i < bullets.size(); i++) {
            Bullet bullet = bullets.get(i);
            if (!bullet.living){
                return bullet;
            }
        }
        return new Bullet();
    }
}
