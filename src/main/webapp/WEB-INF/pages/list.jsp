<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/6/21
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>查询所有的账户信息...</h3>

<table border="1">
    <c:forEach var="account" items="${accounts}">
        <tr >
            <td>${account.name}</td>
            <td>${account.money}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
