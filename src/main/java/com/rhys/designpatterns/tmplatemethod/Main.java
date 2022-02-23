package com.rhys.designpatterns.tmplatemethod;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/23 11:58 下午
 */
public class Main {
    public static void main(String[] args) {
        F f = new C();
        f.m();
    }
}

class C extends F{

    @Override
    void op1() {
        System.out.println("op1");
    }

    @Override
    void op2() {
        System.out.println("op2");
    }
}

abstract class F {
    void m(){
        op1();
        op2();
    }

    abstract void op1();
    abstract void op2();
}
