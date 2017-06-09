<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/1
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统登录</title>
    <style>
        body {background: #bce8f1;margin: 0 auto;}
        #d-main {margin: 20px;width: 100%;height: 100%;}
    </style>
</head>
<body>
<div id="d-main">
<h3>登录</h3>
<form action="users_login" method="post" name="login_form">
<table>
    <tr>
        <th>用户名</th>
        <td><input type="text" name="usersname" required/></td>
    </tr>
    <tr>
        <th>密码</th>
        <td><input type="password" name="userspwd" required/></td>
    </tr>
    <tr>
        <td></td>
        <td><input type="submit" value="登录"/></td>
    </tr>
</table>
</form>
</div>
</body>
</html>
