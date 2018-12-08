package com.seaven.tcas.servlet2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-12-05 16:07
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletTest001
 */
@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String username = req.getParameter("uname");
        String password = req.getParameter("pwd");

        if (username.equals("jsd001") && password.equals("0x001")) {
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            resp.sendRedirect("/success");
            return;
        }
        resp.sendRedirect("/Login/Login.html");


//        System.out.println(username + "------>" + password);
    }
}
