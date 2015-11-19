<%--<%@page pageEncoding="UTF-8" %>--%>
<!DOCTYPE html>
<!--[if IE 8]> <html  class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html  class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
    <meta charset="utf-8">
    <title>zmlio | 反应慢</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <meta content="" name="description">
    <meta content="" name="author">
    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <!-- <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css"> -->
    <link href="lib/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="lib/assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css">
    <link href="lib/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="lib/assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css">
    <!-- END GLOBAL MANDATORY STYLES -->
    <!-- BEGIN PAGE LEVEL PLUGIN STYLES -->
    <link href="lib/assets/global/plugins/jqvmap/jqvmap/jqvmap.css" rel="stylesheet" type="text/css">
    <link href="lib/assets/global/plugins/morris/morris.css" rel="stylesheet" type="text/css">
    <!-- END PAGE LEVEL PLUGIN STYLES -->
    <!-- BEGIN PAGE STYLES -->
    <link href="lib/assets/admin/pages/css/tasks.css" rel="stylesheet" type="text/css"/>
    <!-- END PAGE STYLES -->
    <!-- BEGIN THEME STYLES -->
    <!-- DOC: To use 'rounded corners' style just load 'components-rounded.css' stylesheet instead of 'components.css' in the below style tag -->
    <link href="lib/assets/global/css/components-rounded.css" id="style_components" rel="stylesheet" type="text/css">
    <link href="lib/assets/global/css/plugins.css" rel="stylesheet" type="text/css">
    <link href="lib/assets/admin/layout3/css/layout.css" rel="stylesheet" type="text/css">
    <link href="lib/assets/admin/layout3/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color">
    <link href="lib/assets/admin/layout3/css/custom.css" rel="stylesheet" type="text/css">
    <!-- END THEME STYLES -->
    <link rel="shortcut icon" href="favicon.ico">
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
