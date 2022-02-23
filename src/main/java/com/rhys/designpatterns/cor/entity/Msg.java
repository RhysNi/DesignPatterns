package com.rhys.designpatterns.cor.entity;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 12:46 上午
 */
public class Msg {
    public String name;
    public String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
