<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>活化session</title>
</head>
<body>
<p>读取session....</p>
<hr/>

//从硬盘中读取session钝化的对象
<br/>
name:${sessionScope.bean.name}<br/>
pwd:${sessionScope.bean.pwd}<br/>

</body>
</html>
