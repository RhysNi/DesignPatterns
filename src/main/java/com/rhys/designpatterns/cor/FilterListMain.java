package com.rhys.designpatterns.cor;

import com.rhys.designpatterns.cor.entity.Msg;
import com.rhys.designpatterns.cor.filter.Filter;
import com.rhys.designpatterns.cor.filter.HTMLFilter;
import com.rhys.designpatterns.cor.filter.SensitiveFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/14 11:20 下午
 */
public class FilterListMain {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("Hello <script> Hello RhysNi 996</script>");

        List<Filter> filterList = new ArrayList<>();
        filterList.add(new HTMLFilter());
        filterList.add(new SensitiveFilter());

        for (Filter filter : filterList) {
            filter.doFilter(msg);
        }

        System.out.println(msg);
    }
}