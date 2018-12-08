package com.seaven.tcas.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * @author yurifeng
 * @create 2018-12-05 11:38
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletTest001
 */
@WebServlet(value = "/getck")
public class GetCookieServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;chraset=utf-8");

        if (req.getCookies() != null) {
            for (Cookie cookie : req.getCookies()) {
                System.out.println(URLDecoder.decode(cookie.getName(), "utf-8") + "------->" + cookie.getValue());
            }
        }

    }
}
