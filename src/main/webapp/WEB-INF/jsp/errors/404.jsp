<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>出错啦</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <title><sitemesh:write property='title'/></title>
    <link rel="stylesheet" href="${ctx}/lib/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${ctx}/lib/bootstrap/css/bootstrap-theme.min.css"/>
    <link rel="stylesheet" href="${ctx}/style/main.css">
    <script src="${ctx}/lib/jquery-1.11.2.min.js"></script>
    <script src="${ctx}/lib/bootstrap/js/bootstrap.min.js"></script>
    <!--[if lt IE 9]>
    <script src="${ctx}/lib/html5shiv.min.js"></script>
    <script src="${ctx}/lib/respond.min.js"></script>
    <![endif]-->

</head>
<style>
    .content {
        height: 100%;
        background: url(${ctx}/img/error_background.jpg) #dad9d7 no-repeat center top;
        left: 0px;
        overflow: hidden;
        width: 100%;
        position: absolute;
        top: 0px;
    }
</style>
<body>
<div class="content">
    <div class="container">
        hehe
    </div>
</div>
</body>
<script>
    //    setTimeout(function () {
    //        window.history.back();
    //    }, 3000);
</script>
</html>
