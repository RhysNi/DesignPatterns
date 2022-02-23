package com.rhys.designpatterns.bridge.v2;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 2:52 上午
 */
public class GG {
    public void chase(MM mm) {
        Gift g = new WarmGift(new Flower());
        give(mm, g);
    }

    public void give(MM mm, Gift gift) {
        System.out.println(gift + "gived!");
    }
}
