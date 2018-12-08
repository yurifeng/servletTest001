package com.seaven.tcas.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author yurifeng
 * @create 2018-12-05 9:12
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletTest001
 */
@WebServlet(value = "/aa")
public class GetRequestServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {

        System.out.println("getRequestURL---->" + req.getRequestURL());
        System.out.println("getRequestURI---->" + req.getRequestURI());
        System.out.println("getQueryString---->" + req.getQueryString());
        System.out.println("getRemoteAddr---->" + req.getRemoteAddr());
        System.out.println("getRemoteUser---->" + req.getRemoteUser());
        System.out.println("getRemoteHost---->" + req.getRemoteHost());
        System.out.println("getRemotePort---->" + req.getRemotePort());
        System.out.println("getLocalName---->" + req.getLocalName());
        System.out.println("getLocalAddr---->" + req.getLocalAddr());
        System.out.println("-------------------");
        //System.out.println("getHeaderNames---->" + req.getHeaderNames());
        Enumeration<String> headerNames = req.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            String key = headerNames.nextElement();
            String value = req.getHeader(key);
            System.out.println(key + "----->" + value);

        }

    }
}
