<%--
  Created by IntelliJ IDEA.
  User: rohit
  Date: 27/11/15
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title></title>
</head>
<body>

<c:url value="./j_spring_security_check" var="loginUrl" />
<form name='loginForm'
      action="${loginUrl}" method='post' onsubmit="return loginFormValidaion()">

    <h3>Already with us ! </h3>
    <div class="form-group">
        <label for="username">Email address</label>
        <span class="form-icons sprite-image email-bg">icon here</span>
        <input type="text" class="form-control emailvalllogin" id="username" name="username" placeholder="Enter email">
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <span class="form-icons sprite-image password-bg">icon here</span>
        <input type="password" class="form-control passwordlogin" id="password" name="password" placeholder="Password*******">
    </div>
    <div class="checkbox">
        <input type="hidden" name="_spring_security_remember_me" value="on"> <%--Remember Me--%>

    </div>
    <button type="submit" class="btn btn-default">Login</button>
</form>
<a href="/register" id="register">Register</a>

</body>
</html>
