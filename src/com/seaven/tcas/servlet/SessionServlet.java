package com.seaven.tcas.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

/**
 * @author yurifeng
 * @create 2018-12-05 14:50
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletTest001
 */
@WebServlet(value = "/session")
public class SessionServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        System.out.println("session的id:--->" + session.getId());
        System.out.println("最后的访问时间:--->" + session.getLastAccessedTime());
        System.out.println("最大的空闲时间:--->" + session.getMaxInactiveInterval());
        System.out.println("创建时间:--->" + new Date(session.getCreationTime()));
        System.out.println("属性name:--->" + session.getAttributeNames());
        System.out.println("现在的毫秒数:---->" + System.currentTimeMillis());


        session.setAttribute("username", "jsd0x001");
    }
}
