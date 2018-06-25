<%@ page contentType="text/html;charset=UTF-8" %>
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
    <link href="https://cdn.bootcss.com/social-share.js/1.0.16/css/share.min.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link type="text/css" href="<%=basePath%>/css/pace-theme-minimal.css" rel="stylesheet">
    <link type="text/css" href="<%=basePath%>/css/bootstrap.css" rel="stylesheet">
    <link type="text/css" href="<%=basePath%>/css/bootstrap-theme.css" rel="stylesheet">
    <link type="text/css" href="<%=basePath%>/css/font-awesome.css" rel="stylesheet">
    <link type="text/css" href="<%=basePath%>/css/common.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="my-header">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Yaets的博客</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="#"><span class="icon-home">&nbsp;首页</span></a></li>
                <li><a href="#about"><span class="icon-user">&nbsp;关于</span></a></li>
                <li><a href="#links"><span class="icon-link">&nbsp;友链</span></a></li>
                <li><a href="#feed"><span class="icon-rss">&nbsp;订阅</span></a></li>
                <div class="my-user">
                    <ul class="nav navbar-nav">
                        <li class="my-user-nav1">
                            <c:if test="true">
                                <a href="/login"><span class="icon-signin">&nbsp;登陆</span></a>
                            </c:if>
                            <c:if test="false">
                                <a href="#contact"><span class="icon-cog">&nbsp;管理</span></a>
                            </c:if>
                        </li>
                        <li class="my-user-nav2">
                            <c:if test="true">
                                <a href="#contact"><span class="icon-chevron-sign-up">&nbsp;注册</span></a>
                            </c:if>
                            <c:if test="false">
                                <a href="#contact"><span class="icon-signout">&nbsp;退出</span></a>
                            </c:if>
                        </li>
                    </ul>
                </div>
            </ul>
        </div>
    </div>
</nav>
<div class="my-container">
    <div class="my-main">
        <section>
            <c:forEach items="${articles}" var="article">
                <article>
                    <div class="my-title">
                        <div class="my-aa"></div>
                    </div>
                    <div class="my-content">${article.content}</div>
                    <div class="social-share" data-disabled="google"></div>
                </article>
            </c:forEach>
        </section>
        <div class="my-bottom-navigation"></div>
        <div class="my-article" style="display: none;">
            <iframe frameborder="no" border="0" marginwidth="0" marginheight="0" width=90% height=90
                    src="http://music.163.com/outchain/player?type=2&id=557583281&auto=1&height=66">
            </iframe>
            <span>我的博客我的博客我的博客我的博客我的博客我的博客我的博客我的博客我的博客我的博客我的博客我的博客我的博客我的博客我的博客</span>
        </div>
        <div class="my-footer"></div>
    </div>
    <div class="my-navigation">
        <div class="my-info">
            <a href="#">
                <div class="face-img">
                    <img class="img-circle" src="<%=basePath%>/pic/pic0004.jpg" alt="Yaets">
                    <div class="my-name">Yaets</div>
                </div>
            </a>
            <h5>
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h5 class="panel-title icon-search">&nbsp;&nbsp;搜索</h5>
                    </div>
                    <div class="panel-body my-col">
                        <input class="form-control">&nbsp;&nbsp;
                        <button class="btn btn-danger">搜索</button>
                    </div>
                </div>
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h5 class="panel-title icon-reorder">&nbsp;&nbsp;分类</h5>
                    </div>
                    <div class="panel-body">
                        <ul class="nav nav-pills">
                            <li>
                                <a href="#">Solo</a>
                            </li>
                            <li>
                                <a href="#">Solo</a>
                            </li>
                            <li>
                                <a href="#">Solo</a>
                            </li>
                            <li>
                                <a href="#">Solo</a>
                            </li>
                            <li>
                                <a href="#">Solo</a>
                            </li>
                            <li>
                                <a href="#">Solo</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h5 class="panel-title icon-tags">&nbsp;&nbsp;标签</h5>
                    </div>
                    <div class="panel-body">
                        <ul class="nav nav-pills">
                            <li>
                                <a href="#">Solo</a>
                            </li>
                            <li>
                                <a href="#">Solo</a>
                            </li>
                            <li>
                                <a href="#">Solo</a>
                            </li>
                            <li>
                                <a href="#">Solo</a>
                            </li>
                            <li>
                                <a href="#">Solo</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h5 class="panel-title icon-folder-open">&nbsp;&nbsp;归档</h5>
                    </div>
                    <div class="panel-body">
                        <div class="my-tag">&nbsp;<a>2017年12月 (123)</a></div>
                        <div class="my-tag">&nbsp;<a>2017年12月 (123)</a></div>
                        <div class="my-tag">&nbsp;<a>2017年12月 (123)</a></div>
                    </div>
                </div>
            </h5>
        </div>
    </div>
</div>
<div class="my-to-top">
    <i class="icon-2x icon-circle-arrow-up "></i>
</div>
</body>
<script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%--<script src="https://cdn.bootcss.com/velocity/1.5.1/velocity.min.js"></script>--%>
<%--<script src="https://cdn.bootcss.com/velocity/1.5.1/velocity.ui.min.js"></script>--%>
<script src="<%=basePath%>/js/velocity.js"></script>
<script src="<%=basePath%>/js/velocity.ui.js"></script>
<script src="https://cdn.bootcss.com/jquery_lazyload/1.9.7/jquery.lazyload.min.js"></script>
<script src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
<script src="https://cdn.bootcss.com/pace/1.0.2/pace.min.js"></script>
<script src="https://cdn.bootcss.com/social-share.js/1.0.16/js/social-share.min.js"></script>
<script src="<%=basePath%>/js/common.js"></script>
</html>
