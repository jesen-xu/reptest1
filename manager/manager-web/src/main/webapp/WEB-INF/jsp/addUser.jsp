<%--
  Created by IntelliJ IDEA.
  User: 徐文
  Date: 2019/11/5
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<form action="/user/addUser" method="post">
    姓名：<input type="text" name="name"/><br/>
    年龄：<input type="text" name="old"/><br/>
    地址：<input type="text" name="adress"/><br/>
    <input type="hidden" name="id" value="1"/><br/>
<input type="submit" value="ok"/>

</form>
</body>
</html>
