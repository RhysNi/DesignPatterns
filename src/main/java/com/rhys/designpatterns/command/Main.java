package com.rhys.designpatterns.command;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 3:13 上午
 */
public class Main {
    public static void main(String[] args) {
        Content content = new Content();

        Command insertCommand = new InsertCommand(content);
        insertCommand.doit();
        insertCommand.undo();

        Command copyCommand = new CopyCommand(content);
        copyCommand.doit();
        copyCommand.undo();

        Command deleteCommand = new DeleteCommand(content);
        deleteCommand.doit();
        deleteCommand.undo();

        System.out.println(content);
    }
}
