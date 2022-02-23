package com.rhys.designpatterns.proxy.springaop.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/18 2:22 上午
 */
@Aspect
public class TimeProxy {

    @Before("execution(void com.rhys.designpatterns.proxy.springaop.v2.Tank.move())")
    public void before() {
        System.out.println("method strat " + System.currentTimeMillis());
    }

    @After("execution(void com.rhys.designpatterns.proxy.springaop.v2.Tank.move())")
    public void after() {
        System.out.println("method stop " + System.currentTimeMillis());
    }
}
