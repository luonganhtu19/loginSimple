<%--
  Created by IntelliJ IDEA.
  User: luong
  Date: 12/31/2020
  Time: 10:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/loginCSS.css">
</head>
<body>
<form action="/login" method="post">
    <div class="login">
        <h2>Login</h2>
        <input type="text" name="username" size="20" placeholder="username"/>
        <input type="password" name="password" size="20" placeholder="password"/>
        <input type="submit" value="Sign in" />
    </div>
</form>
</body>
</html>
