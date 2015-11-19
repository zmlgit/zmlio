/**
 * Created by ZML on 2015/10/10.
 */

/* 导航菜单 鼠标划过效果*/
$("#nav li").hover(function () {
    $(this).addClass("active");
}, function () {
    $(this).removeClass("active");
});