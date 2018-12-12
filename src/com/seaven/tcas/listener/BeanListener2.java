package com.seaven.tcas.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * @author yurifeng
 * @create 2018-12-12 14:57
 * @package_name com.seaven.tcas.listener
 * @project_name servletTest001
 */
public class BeanListener2 implements HttpSessionActivationListener {

    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 监听时间:将要钝化之前触发的方法
     *
     * @param se
     */
    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("即将钝化BeanListener2对象之前----->" + se.getSession().getId());
    }

    /**
     * 监听实践:刚刚已经进行了活化之后
     *
     * @param se
     */
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("已经活化BeanListener2对象之后------>" + se.getSession().getId());
    }
}
