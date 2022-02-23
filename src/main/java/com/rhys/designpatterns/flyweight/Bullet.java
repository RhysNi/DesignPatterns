package com.rhys.designpatterns.flyweight;

import java.util.UUID;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/16 2:36 上午
 */
public class Bullet {
    public UUID id = UUID.randomUUID();
    boolean living = true;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                '}';
    }
}
