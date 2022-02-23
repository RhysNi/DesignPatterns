package com.rhys.designpatterns.proxy.springaop.v1;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/18 2:22 上午
 */
public class TimeProxy {
    public void before(){
        System.out.println("method strat " + System.currentTimeMillis());
    }
    public void after(){
        System.out.println("method stop " + System.currentTimeMillis());
    }
}
