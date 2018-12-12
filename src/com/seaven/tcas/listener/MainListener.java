package com.seaven.tcas.listener;

/**
 * @author yurifeng
 * @create 2018-12-12 10:36
 * @package_name com.seaven.tcas.listener
 * @project_name servletTest001
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 创建class,实现监听器接口
 * 重写每个接口的2个方法
 */
public class MainListener implements ServletContextListener, HttpSessionListener, ServletRequestListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("监听application(ServletContext),创建application对象" + sce);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听application(ServletContext),销毁application对象" + sce);
    }


    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("监听HttpSession,创建HttpSession对象" + se);
    }


    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("监听HttpSession,销毁HttpSession对象" + se);
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("监听ServletRequest,创建ServletRequest对象" + sre);
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("监听ServletRequest,创建ServletRequest对象" + sre);
    }
}
