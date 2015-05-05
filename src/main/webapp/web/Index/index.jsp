<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../common/Public/header.jsp"%>
<!--  -->
<script src="<%=path%>/resource/Web/js/jquery.SuperSlide.js"
	type="text/javascript"></script>


<!-- content body start -->



<div class="banner">

	<!-- Start 焦点图 -->
	<div class="index_focus">
		<a href="javascript:;" class="index_focus_pre" title="上一张">上一张</a> <a
			href="javascript:;" class="index_focus_next" title="下一张">下一张</a>
		<div class="bd">
			<ul>
				<li><a href="javascript:;" class="pic"><img class="pic"
						src="<%=path%>/resource/Web/images/01-b.jpg" width="1920" height="450"
						alt=""></a></li>
				<li><a href="javascript:;" class="pic"><img class="pic"
						src="<%=path%>/resource/Web/images/02-b.jpg" width="1920" height="450"
						alt=""></a></li>
				<li><a href="javascript:;" class="pic"><img class="pic"
						src="<%=path%>/resource/Web/images/03-b.jpg" width="1920" height="450"
						alt=""></a></li>
				<li><a href="javascript:;" class="pic"><img class="pic"
						src="<%=path%>/resource/Web/images/04-b.jpg" width="1920" height="450"
						alt=""></a></li>
			</ul>
		</div>
		<div class="slide_nav">
			<a href="javascript:;">●</a> <a href="javascript:;">●</a> <a
				href="javascript:;">●</a> <a href="javascript:;">●</a>
		</div>
	</div>
	<!-- End 焦点图 -->
	<script type="text/javascript">
		jQuery(".index_focus").hover(
				function() {
					jQuery(this).find(".index_focus_pre,.index_focus_next")
							.stop(true, true).fadeTo("show", 1);
				},
				function() {
					jQuery(this).find(".index_focus_pre,.index_focus_next")
							.fadeOut();
				});
		jQuery(".index_focus").slide({
			titCell : ".slide_nav a ",
			mainCell : ".bd ul",
			delayTime : 300,
			interTime : 3500,
			prevCell : ".index_focus_pre",
			nextCell : ".index_focus_next",
			effect : "fold",
			autoPlay : true,
			trigger : "click"
		});
	</script>
</div>
<div class="banner_body">
	<div class="menu">
		<ul class="Sub-menu">
			<li><a href="/index.php/Project/index.html">全部</a></li>
			<li><a href="/index.php/Project/index/industry/1.html">互联网</a></li>
			<li><a href="/index.php/Project/index/industry/2.html">科技</a></li>
			<li><a href="/index.php/Project/index/industry/3.html">娱乐</a></li>
			<li><a href="/index.php/Project/index/industry/4.html">生活</a></li>
			<li><a href="/index.php/Project/index/industry/5.html">农业</a></li>
			<li><a href="/index.php/Project/index/industry/8.html">文化艺术</a></li>
			<li><a href="/index.php/Project/index/industry/9.html">教育</a></li>
			<li><a href="/index.php/Project/index/industry/10.html">其他</a></li>
		</ul>
	</div>
</div>
<div class="contain">
	<div class="title">
		<span>热门项目</span> <a href="/index.php/Project/index.html"
			class="more right">浏览全部</a>
	</div>
	<div class="projects-ul">
		<ul class="box">
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/163.html"> <img
						src="<%=path%>/avatar/2015/04/03/551e98842cbfa.jpg" width="236"
						height="231" />
						<div class="toll_info"></div>
						<p>视频娱乐创业项目</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">神画</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>技术合伙人</a><a>设计合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/163.html" class="a1">湖南</a> <a
						href="/index.php/Project/detail/id/163.html" class="a1">互联网</a> <span>
						<a href="/index.php/Project/detail/id/163.html" title="简历"
						class="jianli">0</a> <a
						href="/index.php/Project/detail/id/163.html" title="评论"
						class="pinglun">2</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/162.html"> <img
						src="<%=path%>/avatar/2015/03/30/55194efddfa78.jpg" width="236"
						height="231" />
						<div class="toll_info"></div>
						<p>基于地理位置的纯匿名移动短视频社交app, 扑捉身边精彩的瞬间。</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">你看</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>运营合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/162.html" class="a1">北京</a> <a
						href="/index.php/Project/detail/id/162.html" class="a1">互联网</a> <span>
						<a href="/index.php/Project/detail/id/162.html" title="简历"
						class="jianli">1</a> <a
						href="/index.php/Project/detail/id/162.html" title="评论"
						class="pinglun">1</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/161.html"> <img
						src="<%=path%>/Uploads/Project/20150329/55181bcdc6950.jpg" width="236"
						height="231" />
						<div class="toll_info"></div>
						<p>电子数码产品特卖网站</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">数码外卖</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>运营合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/161.html" class="a1">湖南</a> <a
						href="/index.php/Project/detail/id/161.html" class="a1">生活</a> <span>
						<a href="/index.php/Project/detail/id/161.html" title="简历"
						class="jianli">0</a> <a
						href="/index.php/Project/detail/id/161.html" title="评论"
						class="pinglun">0</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/156.html"> <img
						src="<%=path%>/avatar/2015/03/27/5515673099dea.jpg" width="236"
						height="231" />
						<div class="toll_info"></div>
						<p>有创新理念的的食品网络采购平台</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">掌勺儿网</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>营销合伙人</a><a>运营合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/156.html" class="a1">湖南</a> <a
						href="/index.php/Project/detail/id/156.html" class="a1">生活</a> <span>
						<a href="/index.php/Project/detail/id/156.html" title="简历"
						class="jianli">0</a> <a
						href="/index.php/Project/detail/id/156.html" title="评论"
						class="pinglun">0</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/155.html"> <img
						src="<%=path%>/avatar/2015/03/24/55114af6b5908.jpg" width="236"
						height="231" />
						<div class="toll_info"></div>
						<p>八年聚焦壹果，一生只为好果！</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">壹农壹果E计划</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>营销合伙人</a><a>运营合伙人</a><a>其它合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/155.html" class="a1">湖南</a> <a
						href="/index.php/Project/detail/id/155.html" class="a1">互联网</a> <span>
						<a href="/index.php/Project/detail/id/155.html" title="简历"
						class="jianli">0</a> <a
						href="/index.php/Project/detail/id/155.html" title="评论"
						class="pinglun">4</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/153.html"> <img
						src="<%=path%>/avatar/2015/03/23/55102bec186fe.jpg" width="236"
						height="231" />
						<div class="toll_info"></div>
						<p>校园网上超市</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">8天在线</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>运营合伙人</a><a>产品合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/153.html" class="a1">湖南</a> <a
						href="/index.php/Project/detail/id/153.html" class="a1">生活</a> <span>
						<a href="/index.php/Project/detail/id/153.html" title="简历"
						class="jianli">2</a> <a
						href="/index.php/Project/detail/id/153.html" title="评论"
						class="pinglun">3</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/150.html"> <img
						src="<%=path%>/avatar/2015/03/18/55099553eceb0.jpg" width="236"
						height="231" />
						<div class="toll_info"></div>
						<p>101外卖网是长沙专业的第三方订餐平台</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">101外卖网</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>技术合伙人</a><a>运营合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/150.html" class="a1">湖南</a> <a
						href="/index.php/Project/detail/id/150.html" class="a1">生活</a> <span>
						<a href="/index.php/Project/detail/id/150.html" title="简历"
						class="jianli">1</a> <a
						href="/index.php/Project/detail/id/150.html" title="评论"
						class="pinglun">4</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/148.html"> <img
						src="<%=path%>/avatar/2015/03/18/550992ccbe693.jpg" width="236"
						height="231" />
						<div class="toll_info"></div>
						<p>立足于手绘明信片的设计</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">子非鱼</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>营销合伙人</a><a>设计合伙人</a><a>产品合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/148.html" class="a1">湖南</a> <a
						href="/index.php/Project/detail/id/148.html" class="a1">生活</a> <span>
						<a href="/index.php/Project/detail/id/148.html" title="简历"
						class="jianli">2</a> <a
						href="/index.php/Project/detail/id/148.html" title="评论"
						class="pinglun">4</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/147.html"> <img
						src="<%=path%>/avatar/2015/03/17/55080c6da6b96.jpg" width="236"
						height="231" />
						<div class="toll_info"></div>
						<p>用最简单有趣的方式制作海报、ppt、信息图、贺卡、名片等所有你想要的一切</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">创客贴</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>技术合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/147.html" class="a1">北京</a> <a
						href="/index.php/Project/detail/id/147.html" class="a1">互联网</a> <span>
						<a href="/index.php/Project/detail/id/147.html" title="简历"
						class="jianli">0</a> <a
						href="/index.php/Project/detail/id/147.html" title="评论"
						class="pinglun">3</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/145.html"> <img
						src="<%=path%>/avatar/2015/03/16/5506f5cf530be.jpg" width="236"
						height="231" />
						<div class="toll_info"></div>
						<p>兼职派开启了中国招聘行业全新的模式，让我们一起来颠覆中国招聘行业吧！</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">兼职派</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>技术合伙人</a><a>营销合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/145.html" class="a1">湖南</a> <a
						href="/index.php/Project/detail/id/145.html" class="a1">互联网</a> <span>
						<a href="/index.php/Project/detail/id/145.html" title="简历"
						class="jianli">0</a> <a
						href="/index.php/Project/detail/id/145.html" title="评论"
						class="pinglun">4</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/138.html"> <img
						src="<%=path%>/avatar/54ffcee576b80.png" width="236" height="231" />
						<div class="toll_info"></div>
						<p>一款可以下单寄快递的app</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">蜗牛快递助手</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>技术合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/138.html" class="a1">湖南</a> <a
						href="/index.php/Project/detail/id/138.html" class="a1">互联网</a> <span>
						<a href="/index.php/Project/detail/id/138.html" title="简历"
						class="jianli">4</a> <a
						href="/index.php/Project/detail/id/138.html" title="评论"
						class="pinglun">3</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/122.html"> <img
						src="<%=path%>/avatar/54f9cc8121259.png" width="236" height="231" />
						<div class="toll_info"></div>
						<p>为爱宠一族记录点点滴滴。</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">猫朋狗友</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>技术合伙人</a><a>营销合伙人</a><a>运营合伙人</a><a>设计合伙人</a><a>产品合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/122.html" class="a1">湖南</a> <a
						href="/index.php/Project/detail/id/122.html" class="a1">生活</a> <span>
						<a href="/index.php/Project/detail/id/122.html" title="简历"
						class="jianli">4</a> <a
						href="/index.php/Project/detail/id/122.html" title="评论"
						class="pinglun">9</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/105.html"> <img
						src="<%=path%>/avatar/54f707d8358ff.png" width="236" height="231" />
						<div class="toll_info"></div>
						<p>基于工作职位，个人能力展示的网站</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">到校外</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>技术合伙人</a><a>营销合伙人</a><a>运营合伙人</a><a>设计合伙人</a><a>产品合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/105.html" class="a1">广西</a> <a
						href="/index.php/Project/detail/id/105.html" class="a1">互联网</a> <span>
						<a href="/index.php/Project/detail/id/105.html" title="简历"
						class="jianli">1</a> <a
						href="/index.php/Project/detail/id/105.html" title="评论"
						class="pinglun">2</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/104.html"> <img
						src="<%=path%>/avatar/54f70561d7fe7.png" width="236" height="231" />
						<div class="toll_info"></div>
						<p>一个全国高校的重度垂直二手教材交易平台</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">第二本书</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>运营合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/104.html" class="a1">湖南</a> <a
						href="/index.php/Project/detail/id/104.html" class="a1">生活</a> <span>
						<a href="/index.php/Project/detail/id/104.html" title="简历"
						class="jianli">1</a> <a
						href="/index.php/Project/detail/id/104.html" title="评论"
						class="pinglun">4</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/94.html"> <img
						src="<%=path%>/avatar/54f6ea47c9c81.png" width="236" height="231" />
						<div class="toll_info"></div>
						<p>通过各个渠道销售各种品牌卫生巾</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">大姨夫</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>运营合伙人</a><a>产品合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/94.html" class="a1">重庆</a> <a
						href="/index.php/Project/detail/id/94.html" class="a1">生活</a> <span>
						<a href="/index.php/Project/detail/id/94.html" title="简历"
						class="jianli">1</a> <a
						href="/index.php/Project/detail/id/94.html" title="评论"
						class="pinglun">4</a>
					</span>
				</div>
			</li>
			<li>
				<div class="li-img">
					<a href="/index.php/Project/detail/id/89.html"> <img
						src="<%=path%>/avatar/54f6dd520d3d0.jpg" width="236" height="231" />
						<div class="toll_info"></div>
						<p>利用在欧美顶级名校留学的华人学生所掌握的丰富资源、信息及经验为国内各层级的学生提供具有革新性的优质教育服务。</p>
					</a>
				</div>
				<div class="xiangmu">
					<div class="x-title">IVY Touch常春藤在线教育科技</div>
					<div class="cot">
						<div class="cotL left">需求:</div>
						<div class="cotR right">
							<a>技术合伙人</a><a>营销合伙人</a><a>设计合伙人</a>
						</div>
					</div>
				</div>
				<div class="tag">
					<a href="/index.php/Project/detail/id/89.html" class="a1">北京</a> <a
						href="/index.php/Project/detail/id/89.html" class="a1">教育</a> <span>
						<a href="/index.php/Project/detail/id/89.html" title="简历"
						class="jianli">1</a> <a
						href="/index.php/Project/detail/id/89.html" title="评论"
						class="pinglun">1</a>
					</span>
				</div>
			</li>
		</ul>
		<div class="clear"></div>
	</div>
	<div class="title">
		<span>创益行动</span> <a href="/index.php/Creative/index"
			class="more right">浏览全部</a>
	</div>
	<div class="project-ul-b">
		<ul>
			<li>
				<div class="divimg">
					<a href="/index.php/Creative/detail/id/31.html"> <img
						src="<%=path%>/Uploads/Article/20150323/550f074d47c2a.jpg" width="246"
						height="195" alt="" />
					</a>
					<div class="zan">
						<a href="javascript:;" acion="upclick" cid="31">2954</a>
					</div>
				</div>
				<div class="divtext">
					<h3>湖南省高校大学生创业论坛</h3>
					<p>分享嘉宾：龙图游戏CTO、WPS首席架构师</p>
				</div>
			</li>
			<li>
				<div class="divimg">
					<a href="/index.php/Creative/detail/id/30.html"> <img
						src="<%=path%>/Uploads/Article/20150317/550831c52160f.jpg" width="246"
						height="195" alt="" />
					</a>
					<div class="zan">
						<a href="javascript:;" acion="upclick" cid="30">170</a>
					</div>
				</div>
				<div class="divtext">
					<h3>这是一本徐小平在朋友圈里推荐的书</h3>
					<p>4月25号，牛人邦携手《创业大浪潮》作者邱恒明走进长沙，等待你的参与。</p>
				</div>
			</li>
			<li>
				<div class="divimg">
					<a href="/index.php/Creative/detail/id/29.html"> <img
						src="<%=path%>/Uploads/Article/20150312/550193647daf6.png" width="246"
						height="195" alt="" />
					</a>
					<div class="zan">
						<a href="javascript:;" acion="upclick" cid="29">99</a>
					</div>
				</div>
				<div class="divtext">
					<h3>长沙晚报招聘全职实习生</h3>
					<p>长沙晚报招聘全职实习生！一个很好的锻炼机会，不要错过！</p>
				</div>
			</li>
			<li>
				<div class="divimg">
					<a href="/index.php/Creative/detail/id/23.html"> <img
						src="<%=path%>/Uploads/Article/20150304/54f6f0481cd27.jpg" width="246"
						height="195" alt="" />
					</a>
					<div class="zan">
						<a href="javascript:;" acion="upclick" cid="23">80</a>
					</div>
				</div>
				<div class="divtext">
					<h3>环保科技创意大赛环保大使招募</h3>
					<p>2015年第六届高校环保科技创意大赛&环保大使招募</p>
				</div>
			</li>
			<li>
				<div class="divimg">
					<a href="/index.php/Creative/detail/id/20.html"> <img
						src="<%=path%>/Uploads/Article/20150304/54f6e71028943.jpg" width="246"
						height="195" alt="" />
					</a>
					<div class="zan">
						<a href="javascript:;" acion="upclick" cid="20">87</a>
					</div>
				</div>
				<div class="divtext">
					<h3>联合国”我的世界” 中国志愿者</h3>
					<p>联合国“我的世界”中国项目志愿者全国招募中！ 志同道合的小伙伴，高大上的青年论坛，联合国青年大使证书。 你来，统统都有！</p>
				</div>
			</li>
			<li>
				<div class="divimg">
					<a href="/index.php/Creative/detail/id/18.html"> <img
						src="<%=path%>/Uploads/Article/20150215/54e00f8fa9f53.png" width="246"
						height="195" alt="" />
					</a>
					<div class="zan">
						<a href="javascript:;" acion="upclick" cid="18">175</a>
					</div>
				</div>
				<div class="divtext">
					<h3>Gap Year比赛！你来负责性感！</h3>
					<p>人生很短，必须性感！你可曾想过到异国的一个梦想城市度过与众不同的精彩一年？</p>
				</div>
			</li>
			<li>
				<div class="divimg">
					<a href="/index.php/Creative/detail/id/14.html"> <img
						src="<%=path%>/Uploads/Article/20150215/54e008626aa1c.jpg" width="246"
						height="195" alt="" />
					</a>
					<div class="zan">
						<a href="javascript:;" acion="upclick" cid="14">51</a>
					</div>
				</div>
				<div class="divtext">
					<h3>你的创意是时候要Y-PLUS一下！</h3>
					<p>
						Y-PLUS创意周末，一个让你我他都脑洞大开的平台。售卖、学习、交流、互动、尝鲜，只要你有料，Y-PLUS创意周末就能让你的青春活出更多可能。</p>
				</div>
			</li>
			<li>
				<div class="divimg">
					<a href="/index.php/Creative/detail/id/13.html"> <img
						src="<%=path%>/Uploads/Article/20150215/54e010aa571d1.jpg" width="246"
						height="195" alt="" />
					</a>
					<div class="zan">
						<a href="javascript:;" acion="upclick" cid="13">166</a>
					</div>
				</div>
				<div class="divtext">
					<h3>2015IDG中美校园创业大赛启动</h3>
					<p>
						此次大赛将由IDG资本及昂立教育、朋友印象联合主办，旨在选拔出在互联网和移动互联网行业最具潜力的校园创业之星，并通过在北美近10所顶尖高校和国内12所一流高校中举办校园宣讲活动的形式，与大学生们分享行业领先企业CEO们的创业经历与感悟。</p>
				</div>
			</li>
		</ul>
		<div class="clear"></div>
	</div>
	<div class="title">
		<span>职场计划</span> <a href="/index.php/Career/index" class="more right">浏览全部</a>
	</div>
	<div class="project-ul-b">
		<ul>
		</ul>
		<div class="clear"></div>
	</div>
</div>
<%@include file="../Public/footer.jsp"%>
