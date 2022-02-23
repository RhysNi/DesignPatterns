package com.rhys.designpatterns.observer.v2;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 11:17 下午
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing");
        }
    }
}
