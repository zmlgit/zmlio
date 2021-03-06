<%--
  Created by IntelliJ IDEA.
  User: ZML
  Date: 2015/9/29
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <title><sitemesh:write property='title'/></title>
    <link rel="stylesheet" href="${ctx}/lib/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${ctx}/lib/bootstrap/css/bootstrap-theme.min.css"/>
    <link rel="stylesheet" href="${ctx}/style/main.css">
</head>
<body>
<nav class="navbar navbar-default navbar-static-top" role="navigation">
    <div class="container">
        <div class="navbar-header" style="position: relative;">
            <button class="collapsed navbar-toggle" data-target=".navbar-collapse" data-toggle="collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="/" target="_self">
                <img src="img/logo.png" alt="" height="40"
                     style="margin-left: 20px; margin-bottom: 5px;margin-top: 5px;">
            </a>
        </div>
        <div class="collapse navbar-collapse navbar-right nav-pills">
            <ul class="nav navbar-nav" id="nav">
                <li><a href="#">生活</a></li>
                <li><a href="#">工作</a></li>
                <li><a href="#">随笔</a></li>
                <li><a href="#">收藏</a></li>
                <li><a href="about.jsp">关于</a></li>
                <li clas="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        用户 <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <shiro:notAuthenticated>
                        <li><a href="#">注册</a></li>
                        <li><a href="#">登录</a></li>
                        </shiro:notAuthenticated>
                        <shiro:authenticated>
                        <li><a href="#">注销</a></li>
                        <li><a href="#">个人中心</a></li>
                        </shiro:authenticated>
                    </ul>
                </li>
            </ul>
        </div>

    </div>
</nav>
<sitemesh:write property="body" writeEntireProperty="true"></sitemesh:write>
<footer class="text-center navbar navbar-default " style="margin-top: -31px;margin-bottom: 0px;">
    <p style="margin:auto">
        <small>Powered by:<a href="mailto:zmanliang@163.com">zmanliang@163.com</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a
                href="http://www.miitbeian.gov.cn/" target="_blank">京ICP备15031683号</a></small>
    </p>
</footer>
</body>
<script src="${ctx}/lib/jquery-1.11.2.min.js"></script>
<script src="${ctx}/lib/bootstrap/js/bootstrap.min.js"></script>
<!--[if lt IE 9]>
<script src="${ctx}/lib/html5shiv.min.js"></script>
<script src="${ctx}/lib/respond.min.js"></script>
<![endif]-->
<script src="${ctx}/js/common.js"></script>
</html>
