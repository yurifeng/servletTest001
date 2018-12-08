package com.seaven.tcas.servlet4;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-12-06 15:58
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletTest001
 */
@WebServlet("/dcs")
public class DoCountServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        ServletContext application = req.getServletContext();
        Integer count = (Integer) application.getAttribute("count");

        if (count == null) {
            count = 1;
            application.setAttribute("count", count);
        } else {
            count++;//countNum=countNum+1;
            application.setAttribute("count", count);
        }

        resp.getWriter().write(count);

        //System.out.println(count);

    }
}
