package com.rhys.designpatterns.bridge.v2;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 3:00 上午
 */
public class WarmGift extends Gift {
    public WarmGift(GiftImpl impl) {
        this.impl = impl;
    }
}
