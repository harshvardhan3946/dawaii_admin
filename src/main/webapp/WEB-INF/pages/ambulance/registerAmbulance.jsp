<%--
  Created by IntelliJ IDEA.
  User: rohit
  Date: 10/12/15
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/ambulance/register" method="post" enctype="multipart/form-data">
    Image of Ambulance: <input type="file" name="file"/>
    Service Provider Name: <input type="text" name="serviceProviderName"/><br>
    Description: <input type="text" name="description"/><br>
    City: <input type="text" name="city"/><br>
    State: <input type="text" name="state"/><br>
    Area: <input type="text" name="area"/><br>
    Address: <input type="text" name="address"/><br>
    Contact Number: <input type="text" name="contactNumber"/><br>
    Mobile Number: <input type="text" name="mobileNumber"/><br>
    Email: <input type="text" name="email"/><br>
    <button type="submit">Submit</button>
</form>
</body>
</html>
