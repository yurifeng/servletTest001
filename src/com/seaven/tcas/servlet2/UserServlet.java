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
 * @create 2018-12-05 17:00
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletTest001
 */
@WebServlet(value = "/userServlet")
public class UserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String uname = (String) session.getAttribute("username");
        if (uname == null) {
            resp.sendRedirect("/Login/Login.html");
            return;
        }
    }
}
