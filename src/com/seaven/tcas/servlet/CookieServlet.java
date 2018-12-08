package com.seaven.tcas.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author yurifeng
 * @create 2018-12-05 11:25
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletTest001
 */
@WebServlet(value = "/setck")
public class CookieServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;chraset=utf-8");
        resp.getWriter().write("Welcome to my new website..");

        //url编码,用于cookie中文
        Cookie ck = new Cookie(URLEncoder.encode("姓名", "utf-8"), "鱼日丰");
        resp.addCookie(ck);
        ck.setPath("/");
        ck.setMaxAge(10 * 60);
        ck.setHttpOnly(true);

        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(URLDecoder.decode(cookie.getName(), "utf-8") + "----->" + cookie.getValue());
        }
        System.out.println(ck.getMaxAge());





    }
}
