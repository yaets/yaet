<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<html>
<head>
    <title>我的博客</title>
    <link rel="shortcut icon" href="<%=basePath%>/favicon.ico"
          type="image/x-icon"/>
    <link type="text/css" rel="stylesheet"
          href="<%=basePath%>/css/category.css">
</head>
<body>
<table id="tb">
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${cs}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
        </tr>
    </c:forEach>
</table>
<br>
<br>
<iframe frameborder="no" border="0" marginwidth="0" marginheight="0" width=330 height=86
        src="http://music.163.com/outchain/player?type=2&id=505458990&auto=1&height=66"></iframe>
</body>
</html>