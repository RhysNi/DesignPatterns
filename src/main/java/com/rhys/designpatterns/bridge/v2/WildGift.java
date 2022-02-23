package com.rhys.designpatterns.bridge.v2;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 3:01 上午
 */
public class WildGift extends Gift{
    public WildGift(GiftImpl impl) {
        this.impl = impl;
    }
}
