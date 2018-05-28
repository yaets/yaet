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
        <td>role</td>
        <td>pwd</td>
        <td>pic</td>
    </tr>
    <c:forEach items="${users}" var="u">
        <tr>
            <td>${u.userId}</td>
            <td>${u.userName}</td>
            <td>${u.userRole}</td>
            <td>${u.userPwd}</td>
            <td><img src="${u.userPic}" width="40px" height="40px"></td>
        </tr>
    </c:forEach>
</table>
<br>
<br>
<iframe frameborder="no" border="0" marginwidth="0" marginheight="0" width=330 height=86
        src="http://music.163.com/outchain/player?type=2&id=505458990&auto=1&height=66"></iframe>
</body>
</html>