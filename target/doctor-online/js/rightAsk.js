 //动态设置侧边栏滚动
 $(function () {
    var offset_top = $('.right_nav').offset().top; //获取右侧导航距离顶部的高度
    var begin = 0,
       end = 0,
       timer = null;
    $('.right_nav li:last').hide(); //先将回到顶部隐藏

    $(window).scroll(function (evt) {
       clearInterval(timer);
       var scroll_top = $(window).scrollTop();
       end = offset_top + scroll_top;
       scroll_top > 100 ? $('.right_nav li:last').fadeIn() : $('.right_nav li:last').fadeOut(); //滚动距离判断是否显示回到顶部

       timer = setInterval(function () { //滚动定时器
          begin = begin + (end - begin) * 0.2;
          if (Math.round(begin) === end) {
             clearInterval(timer);
          }
       }, 10);
    });
 });

 //右侧导航伸缩效果
 var right_nav = $(".right_nav");
 var tempS;
 $(".right_nav").hover(function () {
       var thisObj = $(this);
       tempS = setTimeout(function () {
          thisObj.find("li").each(function (i) {
             var tA = $(this);
             setTimeout(function () {
                tA.animate({
                   right: "0"
                }, 200);
             }, 50 * i);
          });
       }, 200);
    },
    function () {
       if (tempS) {
          clearTimeout(tempS);
       }
       $(this).find("li").each(function (i) {
          var tA = $(this);
          setTimeout(function () {
             tA.animate({
                right: "-70"
             }, 200, function () {});
          }, 50 * i);
       });
    });

 //右侧导航点击事件
 $(".right_nav li").each(function (i) {
    if (i == 0 || i == 1 || i == 2) {
       $(this).mouseover(function () {
          $(this).children(".hideBox").stop().fadeIn();
          right_nav.css('overflow', 'visible')
       });
       $(this).mouseout(function () {
          $(this).children(".hideBox").hide();
          right_nav.css('overflow', 'hidden')
       });
    } else if (i == 3) {
       $(this).click(function () {
          location.href = 'https://www.baidu.com/';
       })
    } else if (i == 4) {
       $(this).click(function () {
          $('body,html').animate({
             scrollTop: 0
          }, 400);
       })
    }
 })