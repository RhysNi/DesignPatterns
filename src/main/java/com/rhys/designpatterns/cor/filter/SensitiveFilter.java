package com.rhys.designpatterns.cor.filter;

import com.rhys.designpatterns.cor.entity.Msg;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 12:48 上午
 */
public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String str = msg.getMsg();
        str = str.replaceAll("996", "955");
        msg.setMsg(str);
        return false;
    }
}
