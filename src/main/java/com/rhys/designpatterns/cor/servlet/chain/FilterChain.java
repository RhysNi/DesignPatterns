package com.rhys.designpatterns.cor.servlet.chain;

import com.rhys.designpatterns.cor.servlet.entity.Request;
import com.rhys.designpatterns.cor.servlet.entity.Response;
import com.rhys.designpatterns.cor.servlet.filter.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 12:57 上午
 */
public class FilterChain {
    List<Filter> filterList = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }

    public boolean doFilter(Request request, Response response) {
        if (index ==filterList.size()){
            return false;
        }
        Filter filter = filterList.get(index);
        index++;
        return filter.doFilter(request,response,this);
    }
}
