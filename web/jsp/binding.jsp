<%@ page import="com.seaven.tcas.listener.BeanListener" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/12
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>绑定页面</title>
</head>
<body>
<p>绑定页面....</p>
<%
    BeanListener bl = new BeanListener();
    session.setAttribute("bean", bl);//绑定
%>
</body>
</html>
