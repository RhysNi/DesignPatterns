package com.rhys.designpatterns.command;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 3:06 上午
 */
public class DeleteCommand extends Command {
    Content content;
    String deleted;

    public DeleteCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        deleted = content.msg.substring(0, 5);
        content.msg = content.msg.substring(5, content.msg.length());
    }

    @Override
    public void undo() {
        content.msg = deleted + content.msg;
    }
}
