package com.rhys.designpatterns.cor;

import com.rhys.designpatterns.cor.entity.Msg;
import com.rhys.designpatterns.cor.filter.HTMLFilter;
import com.rhys.designpatterns.cor.filter.SensitiveFilter;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/14 11:20 下午
 */
public class SimpleMain {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("Hello <script> Hello RhysNi 996</script>");
        new HTMLFilter().doFilter(msg);
        new SensitiveFilter().doFilter(msg);
        System.out.println(msg);
    }
}