<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: seven
  Date: 2019/11/12
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
商品<br>
<table border="1">
    <tr>
        <td>名称</td>
        <td>价格</td>
        <td>描述</td>
        <td>日期</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${itemsList}"  var="items">
        <tr>
            <td>${items.name}</td>
            <td>${items.price}</td>
            <td>${items.detail}</td>
            <td>${items.createtime}</td>
            <td>
                <a href="${pageContext.request.contextPath}/items/delete.do?id=${items.id}">删除</a>
                &nbsp;<a href="${pageContext.request.contextPath}/items/edit.do?id=${items.id}">编辑</a>

            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
