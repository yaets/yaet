<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>我的博客</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/font-awesome/3.2.1/css/font-awesome.min.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
    <link type="text/css" href="<%=basePath%>/css/bootstrap.css" rel="stylesheet">
    <link type="text/css" href="<%=basePath%>/css/bootstrap-theme.css" rel="stylesheet">
    <link type="text/css" href="<%=basePath%>/css/font-awesome.css" rel="stylesheet">
    <link type="text/css" href="<%=basePath%>/css/common.css" rel="stylesheet">
</head>
<body>
<div class="" style="border: solid 1px #000; margin: 50px auto;width: 600px;height: 350px; text-align: center;">
    <form>
        <div style="width:50%;margin: 20px auto;display: inline-flex">
            <span class="add-on"><i class="icon-envelope icon-2x"></i></span>&nbsp;&nbsp;
            <input class="form-control" placeholder="Email address">
        </div>
        <div style="width:50%;margin: 20px auto;display: inline-flex">
            <span class="add-on"><i class="icon-key icon-2x"></i></span>&nbsp;&nbsp;
            <input class="form-control" type="password" placeholder="Password">
        </div>
        <hr>
        <a href="#">
            <div class="btn btn-success">注册</div>
        </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/">
            <div class="btn btn-info">登陆</div>
        </a>
    </form>
</div>
<div class="my-container">

</div>
<div class="my-footer"></div>
<div class="my-to-top">
    <i class="icon-2x icon-circle-arrow-up "></i>
</div>
<script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%--<script src="https://cdn.bootcss.com/velocity/1.5.1/velocity.min.js"></script>--%>
<%--<script src="https://cdn.bootcss.com/velocity/1.5.1/velocity.ui.min.js"></script>--%>
<script src="<%=basePath%>/js/velocity.js"></script>
<script src="<%=basePath%>/js/velocity.ui.js"></script>
<script src="https://cdn.bootcss.com/jquery_lazyload/1.9.7/jquery.lazyload.min.js"></script>
<script src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
<script src="<%=basePath%>/js/common.js"></script>
</body>
</html>
