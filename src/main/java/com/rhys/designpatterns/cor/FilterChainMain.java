package com.rhys.designpatterns.cor;

import com.rhys.designpatterns.cor.chain.FilterChain;
import com.rhys.designpatterns.cor.entity.Msg;
import com.rhys.designpatterns.cor.filter.HTMLFilter;
import com.rhys.designpatterns.cor.filter.KeyWordsFilter;
import com.rhys.designpatterns.cor.filter.SensitiveFilter;
import com.rhys.designpatterns.cor.filter.SpecialCharFilter;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/14 11:20 下午
 */
public class FilterChainMain {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("Hello <script> Hello RhysNi 996</script>");

        FilterChain filterChain1 = new FilterChain();
        filterChain1.add(new HTMLFilter()).add(new SensitiveFilter());

        FilterChain filterChain2 = new FilterChain();
        filterChain2.add(new KeyWordsFilter()).add(new SpecialCharFilter());

        filterChain1.add(filterChain2);
        filterChain1.doFilter(msg);

        System.out.println(msg);
    }
}