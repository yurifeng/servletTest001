package com.seaven.tcas.FilterListener;

import com.seaven.tcas.util.GzipResponse;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-12-10 13:46
 * @package_name ${PACKAGE_NAME}
 * @project_name servletTest001
 */
//@WebFilter("/*")
public class GzipFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        //编码
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //压缩前
        //1.包装resp对象
        HttpServletRequest httpServletRequest = (HttpServletRequest) req;//将ServletRequest转换成能用的HttpServletRequest

        //将ServletResponse
        // 转换成能用的HttpServletResponse,然后作为参数给自定义的GzipResponse类初始化用
        GzipResponse response = new GzipResponse((HttpServletResponse) resp);

        chain.doFilter(req, response);//过滤时参数是原来的请求,但是响应用包装好的response[包装好的内存流]

        //压缩
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
