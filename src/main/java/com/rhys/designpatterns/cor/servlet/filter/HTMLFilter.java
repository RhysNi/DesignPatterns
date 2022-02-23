package com.rhys.designpatterns.cor.servlet.filter;

import com.rhys.designpatterns.cor.servlet.chain.FilterChain;
import com.rhys.designpatterns.cor.servlet.entity.Request;
import com.rhys.designpatterns.cor.servlet.entity.Response;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 12:47 上午
 */
public class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        request.str = request.str.replaceAll("<", "[").replaceAll(">", "]") + "--HTMLFilter";
        filterChain.doFilter(request, response);
        response.str = response.str.replaceAll("<", "[").replaceAll(">", "]") + "--HTMLFilter";
        return true;
    }
}
