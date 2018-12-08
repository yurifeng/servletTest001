package com.seaven.tcas.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-12-04 13:20
 * @PACKAGE_NAME com.seaven.tcas.servlet
 * @PROJECT_NAME servletTest001
 */

@WebServlet(value = "/haha", loadOnStartup = 1)
public class servlet2 extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("初始化......" + this.toString());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service方法......" + this.toString());
    }
}
