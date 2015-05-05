/*!
 * fancyBox - jQuery Plugin
 * version: 2.1.3 (Tue, 23 Oct 2012)
 * @requires jQuery v1.6 or later
 *
 * Examples at http://fancyapps.com/fancybox/
 * License: www.fancyapps.com/fancybox/#license
 *
 * Copyright 2012 Janis Skarnelis - janis@fancyapps.com
 *
 */

/**
* focusBox  图片轮播通用插件
* Version: 1.0.1
* 
*/ 
(function($){
	$.fn.focusBox = function(obj){
		//初始化
		var init = function(){
			if(!wrapper.size()) return false;
			liHeight = settings.height ? settings.height : lis.first().height();
			liWidth = settings.width ? settings.width : lis.first().width();
			wrapper.css('height',liHeight);
			ul.css('width',liLength * liWidth + 'px');
			//全屏轮播
			if(settings.width == '100%'){
				function initsize() {
					if (inAnimate) {
					    ul.stop(true,true);
					};
					var winWidth = $(document).width();
					liWidth = winWidth;
					ul.css('width' , liLength * liWidth + 'px').css('left', -1 * newIndex * liWidth);
					lis.css('width' , liWidth);
				}
				$(window).bind("resize", initsize);
				initsize();
			};
		};
	};
})(jQuery);
$(init);

function init(){
    fixedTopObj('#Js-nav' ,'#Js-detail');
    floatbyleft('#Js-rightside' , '.intro-left');
	
}



function fixedTopObj(fixedBox , ltBox){
	if($(fixedBox).length == 0) return;
	var $fixedBox = $(fixedBox);
    var offsetTop = $fixedBox.offset().top;
    var boxPadding = parseInt($fixedBox.parent().css('padding-bottom'));
    var difHeight = boxPadding + parseInt($fixedBox.outerHeight());
    $(window).bind("scroll", scrollObj);
    function scrollObj(){
        if ($(document).scrollTop() >= offsetTop){
            $fixedBox.parent().css('padding-bottom',difHeight);
            $fixedBox.css('position' , 'fixed').css('top' , '0').css('bottom' , 'auto');
        }else{
            $fixedBox.parent().css('padding-bottom',boxPadding);
            $fixedBox.css('position','static');
        }
		if(!$(ltBox).length == 0){
			if($(document).scrollTop() > $(ltBox).offset().top + $(ltBox).height()){
				$fixedBox.parent().css('padding-bottom',boxPadding);
				$fixedBox.css('position','static');
			}
		}
    }
}

//侧边栏滚动吸顶吸低    
function floatbyleft(el, left) {
	var holder = document.createElement("div");
	$(holder).insertBefore($(el));
	var winTopRecord = 0;
	var fixTopRecord = 0;
	function adjustfixedstyle() {
		var winTop = $(document).scrollTop();
		var winHeight = $(window).innerHeight();
		var leftTop = $(left).offset().top;
		var leftHeight = $(left).height();
		var elHeight = $(el).outerHeight(true);
		var holderTop = $(holder).offset().top;
		if (elHeight + holderTop > leftHeight + leftTop || winTop < holderTop) {
			winTopRecord = winTop;
			fixTopRecord = 0;
			$(el).css("position", "static");
			return;
		}
		// 可显示区域
		var viewPartHeight = Math.min(leftHeight + leftTop - winTop, winHeight);
		var minTop = holderTop;
		var maxTop = minTop;
		if (winTop > winTopRecord) {
			maxTop = Math.max(winTop + viewPartHeight - elHeight, minTop);
			fixTopRecord = fixTopRecord + 1 * (winTop - winTopRecord);
		} else {
			maxTop = Math.max(winTop, minTop);
		}
		fixTopRecord = Math.min(maxTop, Math.max(fixTopRecord, minTop));
		winTopRecord = winTop;
		$(el).css("position", "fixed").css('top' , fixTopRecord - winTopRecord);
	}

	var scrollTimeId=0,resizeTimeId=0;
	$(window).bind("scroll", function(){
		clearTimeout(scrollTimeId);
		scrollTimeId = setTimeout(adjustfixedstyle(),10);
	});
	$(window).bind("resize", function(){
		clearTimeout(resizeTimeId);
		resizeTimeId = setTimeout(adjustfixedstyle(),10);
	});
}







