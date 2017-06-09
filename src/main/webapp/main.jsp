<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/2
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>
    <style>
        body {background: #bce8f1;margin: 0 auto;}
        #d-main {width: 100%;height: 100%;margin: 20px;}
        table {width: 700px;height: auto;text-align: center;line-height: 30px;border: 2px solid orangered;}
        td {border: 1px solid whitesmoke;margin: 5px;}
        #d-reg {width: 350px;height: 450px;border: 1px solid blue;}
    </style>
</head>
<body>
<div id="d-main">
<a href="javascript:window.location.href='users_logout'">登出</a>&nbsp;<span><c:out value="${loginInfo}"/></span>，已登录
<h3>注册信息</h3>
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>PASSWORD</th>
        <th>TEL</th>
        <th>EMAIL</th>
        <th>ADDRESS</th>
    </tr>
    <c:forEach items="${usersList}" var="users">
        <tr>
            <td><c:out value="${users.uId}"/></td>
            <td><c:out value="${users.uName}"/></td>
            <td><c:out value="${users.uPassword}"/></td>
            <td><c:out value="${users.uTel}"/></td>
            <td><c:out value="${users.uEmail}"/></td>
            <td><c:out value="${users.uAddress}"/></td>
        </tr>
    </c:forEach>
</table>
    <div id="d-reg">
        <h4>注册用户</h4>
        <form name="reg_form">
        用户名：<input type="text" name="usersName" required/><br>
        密码：<input type="password" name="usersPwd" required/><br>
        电话：<input type="text" name="usersTel" required/><br>
        邮箱：<input type="text" name="usersEmail" required/><br>
        地址：<input type="text" name="usersAddress" required/><br>
            <input type="button" value="注册用户" onclick="usersReg()">
        </form>
    </div>

</div>
</body>
</html>
