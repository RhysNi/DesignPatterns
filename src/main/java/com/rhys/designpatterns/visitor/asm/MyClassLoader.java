package com.rhys.designpatterns.visitor.asm;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 12:57 上午
 */
public class MyClassLoader extends ClassLoader {
    public Class defineClass(String name, byte[] bytes) {
        return defineClass(name, bytes, 0, bytes.length);
    }
}
