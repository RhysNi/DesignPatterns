package com.rhys.designpatterns.command;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 3:06 上午
 */
public class CopyCommand extends Command {
    Content content;

    public CopyCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        content.msg = content.msg + content.msg;
    }

    @Override
    public void undo() {
        content.msg = content.msg.substring(0, content.msg.length() / 2);
    }
}
