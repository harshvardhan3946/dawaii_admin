<%--
  Created by IntelliJ IDEA.
  User: rohit
  Date: 10/12/15
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/vendorRegister" method="post">
    Name: <input type="text" name="name"/><br>
    Email: <input type="text" name="email"/><br>
    Password:<input type="password" name="password"/><br>
    Address: <input type="text" name="address"/><br>
    Phone Number: <input type="text" name="phoneNumber"/><br>
    Service Provider Name: <input type="text" name="serviceProviderName"/><br>

    <button type="submit">Submit</button>
</form>
</body>
</html>
