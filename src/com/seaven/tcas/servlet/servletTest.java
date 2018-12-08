package com.seaven.tcas.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-12-04 13:30
 * @PACKAGE_NAME com.seaven.tcas.servlet
 * @PROJECT_NAME servletTest001
 */
@WebServlet(value = "/st")
public class servletTest extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        String remoteAddr = req.getRemoteHost();

       /* ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.write("mother fucker...".getBytes());*/

        resp.getWriter().write(name + ":-->" + pwd + "----->" + remoteAddr);
        System.out.println("线程名称:" + Thread.currentThread().getName());
    }


}
