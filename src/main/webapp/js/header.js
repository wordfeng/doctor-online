$(function(){
    $(".first-menu > li").mouseover(function(){
        $(this).find(".first-link").addClass("hover");
        $(this).find(".second-menu").stop(true, false).fadeIn(300);
    })
    $(".first-menu > li").mouseout(function(){
        $(this).find(".first-link").removeClass("hover");
        $(this).find(".second-menu").stop(true, false).fadeOut(300);
    })
    $(".third-menu > li").mouseover(function(){
        $(this).find(".third-link").addClass("hover");
        $(this).find(".fourth-menu").stop(true, false).fadeIn(300);
    })
    $(".third-menu > li").mouseout(function(){
        $(this).find(".third-link").removeClass("hover");
        $(this).find(".fourth-menu").stop(true, false).fadeOut(300);
    })
})