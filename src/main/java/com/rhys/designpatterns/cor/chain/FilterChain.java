package com.rhys.designpatterns.cor.chain;

import com.rhys.designpatterns.cor.entity.Msg;
import com.rhys.designpatterns.cor.filter.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 12:57 上午
 */
public class FilterChain implements Filter {
    List<Filter> filterList = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Msg msg) {
        for (Filter filter : filterList) {
            if (filter.doFilter(msg)){
                return false;
            }
        }
        return true;
    }
}
