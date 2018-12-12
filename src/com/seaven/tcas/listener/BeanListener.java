package com.seaven.tcas.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @author yurifeng
 * @create 2018-12-12 14:29
 * @package_name com.seaven.tcas.listener
 * @project_name servletTest001
 */
public class BeanListener implements HttpSessionBindingListener {

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("绑定:Bean对象(将bean对象增加到session域中)" + this + ",,,," + event.getSession().getId());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("解绑:Bean对象(将bean对象从到session域中删除)" + this + ",,,," + event.getSession().getId());
    }
}
