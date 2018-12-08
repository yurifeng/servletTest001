package com.seaven.tcas.servlet4;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yurifeng
 * @create 2018-12-06 15:04
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletTest001
 */
@WebServlet("/sc")
public class ServletContextServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {

        /**
         * ServletContext方式1
         */
        ServletContext application = this.getServletContext();

        /**
         * ServletContext方式2
         */
        ServletContext application2 = getServletConfig().getServletContext();

        /**
         * ServletContext方式3
         */
        ServletContext application3 = req.getSession().getServletContext();

        /**
         * ServletContext方式4
         */
        ServletContext application4 = req.getServletContext();

        System.out.println(application.hashCode() + "---->" + application2.hashCode() + "----->" + application3.hashCode() + "--->" + application4.hashCode());


        String realPath = req.getServletContext().getRealPath("/");
        System.out.println("realPath:---->" + realPath);

        String serverInfo = req.getServletContext().getServerInfo();
        System.out.println("serverInfo:---->" + realPath);

        req.getServletContext().setAttribute("msg", "福克斯的恢复上课的复合时空");
        System.out.println(req.getServletContext().getAttribute("msg"));

        String pic = application.getRealPath("img/th.jpg");
        System.out.println(pic);

        String book = application.getRealPath("/WEB-INF/classes/book.xml");
        System.out.println(book);

        String contextPath = req.getContextPath();
        System.out.println(contextPath);

    }
}
