package com.seaven.tcas.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author yurifeng
 * @create 2018-12-12 11:34
 * @package_name com.seaven.tcas.listener
 * @project_name servletTest001
 */

/**
 *
 */
public class AttributeListener implements ServletContextAttributeListener, HttpSessionAttributeListener,
        ServletRequestAttributeListener {

    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("增加ServletContext属性:--->" + scae.getName() + "::::::" + scae.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("删除ServletContext属性:--->" + scae.getName() + "::::::" + scae.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("替换ServletContext属性:--->" + scae.getName() + "::::::" + scae.getValue());
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("增加ServletRequest属性:--->" + srae.getName() + "::::::" + srae.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("删除ServletRequest属性:--->" + srae.getName() + "::::::" + srae.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("替换ServletRequest属性:--->" + srae.getName() + "::::::" + srae.getValue());
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("增加HttpSession属性:--->" + se.getName() + "::::::" + se.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("删除HttpSession属性:--->" + se.getName() + "::::::" + se.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("替换HttpSession属性:--->" + se.getName() + "::::::" + se.getValue());
    }
}
