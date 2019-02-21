<%--
  Created by IntelliJ IDEA.
  User: azlup
  Date: 20.02.2019
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log in</title>
</head>
<body>
    <h2>Log in:</h2>
    <form action="LoginServlet" method="post">
        Username: <input type="text" name="username">
        <br><hr>
        Password: <input type="password" name="password">
        <br><hr>
        <input type="submit" value="Log in!">

    </form>
</body>
</html>
