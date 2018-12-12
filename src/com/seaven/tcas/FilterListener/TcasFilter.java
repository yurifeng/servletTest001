package com.seaven.tcas.FilterListener;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-12-06 16:42
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletTest001
 */

//@WebFilter(value = "/*")
public class TcasFilter implements Filter {

    public TcasFilter() {
    }

    public void destroy() {
        System.out.println("过滤器111销毁...");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("过滤111开始..");

        //资源放行
        chain.doFilter(req, resp);

        System.out.println("过滤111完成..");
    }

    public void init(FilterConfig config) {
        System.out.println("过滤器111初始化...");
    }

}
