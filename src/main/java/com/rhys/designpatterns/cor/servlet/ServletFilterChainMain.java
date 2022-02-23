package com.rhys.designpatterns.cor.servlet;

import com.rhys.designpatterns.cor.servlet.chain.FilterChain;
import com.rhys.designpatterns.cor.servlet.entity.Request;
import com.rhys.designpatterns.cor.servlet.entity.Response;
import com.rhys.designpatterns.cor.servlet.filter.HTMLFilter;
import com.rhys.designpatterns.cor.servlet.filter.SensitiveFilter;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/14 11:20 下午
 */
public class ServletFilterChainMain {
    public static void main(String[] args) {
        Request request = new Request();
        Response response = new Response();
        request.str = "Hello <script> Hello RhysNi 996</script>";
        response.str = "Hello <script> Hello RhysNi 996</script>";

        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter()).add(new SensitiveFilter());
        filterChain.doFilter(request, response);
        System.out.println(request.str);
        System.out.println(response.str);
    }
}