package com.rhys.designpatterns.composite;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/16 1:07 上午
 */
public class LeafNode extends Node{
    public String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}
