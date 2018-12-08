package com.seaven.tcas.servlet3;

import com.seaven.tcas.entity.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yurifeng
 * @create 2018-12-06 9:52
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletTest001
 */

@WebServlet(value = "/reg")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        User user =  new User();
        try {
            BeanUtils.populate(user, req.getParameterMap());
            user.setFlag(0);
            user.setRole(1);
            user.getCode();
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException  异常....");
        } catch (InvocationTargetException e) {
            System.out.println("InvocationTargetException 异常....");
        }
    }
}
