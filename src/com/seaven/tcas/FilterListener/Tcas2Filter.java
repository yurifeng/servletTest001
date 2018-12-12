package com.seaven.tcas.FilterListener;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-12-06 17:04
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletTest001
 */
//@WebFilter("/*")
public class Tcas2Filter implements Filter {
    public Tcas2Filter() {
    }

    public void destroy() {
        System.out.println("过滤器222销毁...");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("过滤222开始..");

        //资源放行
        chain.doFilter(req, resp);

        System.out.println("过滤222完成..");
    }

    public void init(FilterConfig config) {
        System.out.println("过滤器222初始化...");
    }
}
