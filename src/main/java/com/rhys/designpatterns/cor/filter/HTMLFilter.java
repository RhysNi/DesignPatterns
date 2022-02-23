package com.rhys.designpatterns.cor.filter;

import com.rhys.designpatterns.cor.entity.Msg;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 12:47 上午
 */
public class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String str = msg.getMsg();
        str = str.replace('<', '[');
        str = str.replace('>', ']');
        msg.setMsg(str);
        return true;
    }
}
