<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 777
  Date: 03.10.2021
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Overlord's list</title>
</head>
<body>
<ul>
    <c:forEach var="overlord" items="${overlords}">
        <li><a href="./overlords/${overlord.id}">${overlord.name}</a></li>
    </c:forEach>
</ul>
</body>
</html>
