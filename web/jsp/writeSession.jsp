<%@ page import="com.seaven.tcas.listener.BeanListener2" %>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>钝化session</title>
</head>
<body>
<%
    BeanListener2 beanListener2 = new BeanListener2();
    beanListener2.setName("jsd");
    beanListener2.setPwd("jsdx001");

    session.setAttribute("bean", beanListener2);

%>
</body>
</html>

