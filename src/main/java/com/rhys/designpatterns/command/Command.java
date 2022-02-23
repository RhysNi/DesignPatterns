package com.rhys.designpatterns.command;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 3:05 上午
 */
public abstract class Command {
    public abstract void doit();

    public abstract void undo();
}
