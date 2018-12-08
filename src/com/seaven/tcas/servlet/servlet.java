package com.seaven.tcas.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-12-04 12:56
 * @PACKAGE_NAME com.seaven.tcas.servlet
 * @PROJECT_NAME servletTest001
 */

@WebServlet("/servlet")
public class servlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servlet初始化开始....");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");

        servletResponse.getWriter().write("service方法内容...");
        System.out.println("service方法内容....");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("servlet销毁...");
    }
}
