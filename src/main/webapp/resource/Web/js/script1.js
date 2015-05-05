$(function () {

	$(".Div1_main div span,.Div2_main div span").mouseover(function () {
		$(this).addClass("Div1_main_span1,Div2_main_span1").siblings("span").removeClass("Div1_main_span1,Div2_main_span1");
	}).mouseout(function () {
		$(this).removeClass("Div1_main_span1,Div2_main_span1").siblings("span");
	});


	var
			index = 0;
	Swidth = 1150;
	timer = null;
	function NextPage() {
		if (index > 1) {
			index = 0;
		}
		$(".Div1_main").stop(true, false).animate({left: -index * Swidth + "px"}, 600);
	}

	function PrevPage() {
		if (index < 0) {
			index = 1;
		}
		$(".Div1_main").stop(true, false).animate({left: -index * Swidth + "px"}, 600);
	}
	//下一页
	$(".Div1_next img").click(function () {
		index++;
		NextPage();
	});
	//上一页
	$(".Div1_prev img").click(function () {
		index--;
		PrevPage();
	});
	//自动滚动
	var timer = setInterval(function () {
		index++;
		NextPage();
	}, 4000);

	$(".Div1_next img , .Div1_main , .Div1_prev img ").mouseover(function () {
		clearInterval(timer);
	});
	$(".Div1_next img , .Div1_main , .Div1_prev img ").mouseleave(function () {
		timer = setInterval(function () {
			index++;
			NextPage();
		}, 4000);
	});

})

$(function () {
	var index = 0;
	awidth = 1120;
	function NextPage() {
		if (index > 1)
		{
			index = 0;
		}
		$(".Div2_main").stop(true, false).animate({left: -index * awidth + "px"}, 600)
	}

	function PrevPage() {
		if (index < 0)
		{
			index = 1;
		}
		$(".Div2_main").stop(true, false).animate({left: -index * awidth + "px"}, 600)
	}

	//下一页
	$(".Div2_next img").click(function () {
		index++;
		NextPage();
	});
	//上一页
	$(".Div2_prev img").click(function () {
		index--;
		PrevPage();
	});
	//自动滚动
	var timer = setInterval(function () {
		index++;
		NextPage();
	}, 4000);

	$(".Div2_next img , .Div2_main , .Div2_prev img").mouseover(function () {
		clearInterval(timer);
	});
	$(".Div2_next img , .Div2_main , .Div2_prev img ").mouseleave(function () {
		timer = setInterval(function () {
			index++;
			NextPage();
		}, 4000);
	});

})