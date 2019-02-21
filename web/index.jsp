<%--
  Created by IntelliJ IDEA.
  User: azlup
  Date: 20.02.2019
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome Page</title>
  </head>
  <body>
    <h2>Welcome, your ip address is: <%= request.getRemoteAddr() %></h2>
  <a href="admin.jsp"> Log in as Admin</a>
  </body>
</html>
