<%--<%@page pageEncoding="UTF-8" %>--%>
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

<body style="position: relative">

<div class="main">
<div class="banner">
    <div class="container">
        <div style="margin-left:auto;margin-right:auto;display:table;">
            <img src="img/snoopy.jpg" class="img-circle" height="150">

            <p>

            <h3 class="text-center" style="cursor: default"><strong>做个安安静静的程序员</strong></h3></p>
        </div>
    </div>
</div>
</div>
</body>
<script type="text/javascript" src="lib/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="lib/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
    var count=0;
    function toggle(){
        if(count++%2==0){
            $("table").show();
        }else{
            $("table").hide();
        }
    }

    $("#nav li").hover(function () {
        $(this).addClass("active");
    }, function () {
        $(this).removeClass("active");
    });
</script>
</html>
