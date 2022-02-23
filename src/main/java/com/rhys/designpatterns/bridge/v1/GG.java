package com.rhys.designpatterns.bridge.v1;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 2:52 上午
 */
public class GG {
    public void chase(MM mm) {
        Gift g = new Book();
        give(mm, g);
    }

    public void give(MM mm, Gift gift) {

    }
}
