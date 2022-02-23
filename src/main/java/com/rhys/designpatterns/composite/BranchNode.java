package com.rhys.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/16 1:08 上午
 */
public class BranchNode extends Node{
    List<Node> nodes = new ArrayList<>();
    public String name;

    public BranchNode(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public void add(Node node){
        nodes.add(node);
    }
}
