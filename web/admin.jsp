<%--
  Created by IntelliJ IDEA.
  User: azlup
  Date: 20.02.2019
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Panel</title>
</head>
<body>
    <h2>Welcome, What do you wnat to do <%= request.getSession().getAttribute("username")%>? </h2>

    <a href="LogoutServlet"> Logout </a>
</body>
</html>
