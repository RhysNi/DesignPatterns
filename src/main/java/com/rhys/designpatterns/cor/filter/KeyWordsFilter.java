package com.rhys.designpatterns.cor.filter;

import com.rhys.designpatterns.cor.entity.Msg;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 12:47 上午
 */
public class KeyWordsFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String str = msg.getMsg();
        str = str.replace("script", "");
        msg.setMsg(str);
        return true;
    }
}