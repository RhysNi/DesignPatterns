package com.rhys.designpatterns.state.v1;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/24 12:04 上午
 */
public class Person {
    String name;

    private enum PersonState {
        HAPPY,
        SAD;
    }

    PersonState state;

    public void smile() {

    }

    public void cry() {

    }

    public void say() {

    }
}
