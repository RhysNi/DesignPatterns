package com.rhys.designpatterns.proxy.springaop.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/18 2:15 上午
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app.xml");
        Tank tank = (Tank) applicationContext.getBean("tank");
        tank.move();
    }
}
