<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>zmlio</title>
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=no">
    <link rel="shortcut icon" href="favicon.ico"/>
    <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style/main.css">
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
            <a href="/">
                <img src="img/logo.png" alt="" height="40" style="margin-left: 20px; margin-bottom: 5px;margin-top: 5px;">
            </a>
        </div>
        <div class="collapse navbar-collapse navbar-right nav-pills">
            <ul class="nav navbar-nav" id="nav">
                <li><a href="#">生活</a></li>
                <li><a href="#">技能</a></li>
                <li><a href="#">随笔</a></li>
                <li><a href="#">收藏</a></li>
                <li><a href="#">关于我</a></li>
                <%--<li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        Java <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#">jmeter</a></li>
                        <li><a href="#">EJB</a></li>
                        <li><a href="#">Jasper Report</a></li>
                        <li class="divider"></li>
                        <li><a href="#">分离的链接</a></li>
                        <li class="divider"></li>
                        <li><a href="#">另一个分离的链接</a></li>
                    </ul>
                </li>--%>
            </ul>
        </div>
    </div>
</nav>
<div class="banner">
    <div class="container">
        <div style="margin-left:auto;margin-right:auto;display:table;">
            <img src="img/snoopy.jpg" class="img-circle" height="150">

            <p>

            <h3 class="text-center"><strong>一个慵懒的程序员</strong></h3></p>
        </div>
    </div>
</div>

<footer class="text-center navbar navbar-default ">
    <p style="margin:auto">
        <small>Powered by:<a href="mailto:zmanliang@163.com">zmanliang@163.com</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a
                href="http://www.miitbeian.gov.cn/" target="_blank">京ICP备15031683号</a></small>
    </p>
</footer>
</body>
<script type="text/javascript" src="lib/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="lib/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(function () {
        if (document.documentElement.clientHeight > document.body.clientHeight) {
            $("footer").addClass('navbar-fixed-bottom');
        } else {
            $("footer").removeClass('navbar-fixed-bottom');
        }
        ;
        $(window).resize(function (event) {
            /* Act on the event */
            if (document.documentElement.clientHeight > document.body.clientHeight) {
                $("footer").addClass('navbar-fixed-bottom');
            } else {
                $("footer").removeClass('navbar-fixed-bottom');
            }
        });

        $("#nav li").hover(function () {
            $(this).addClass("active");
        }, function () {
            $(this).removeClass("active");
        });

    });
</script>
</html>
