<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@include file="../common/Public/header.jsp"%>
<div class="recruit">
	<h1>小梦想 聚合大能量</h1>
	<p>
		牛人邦是一个帮助您找到创业合作伙伴的网站。在这里，你结识到的不仅是创业团队，更是一起实现<br />梦想的同行伙伴。在这里，你邂逅的不止是创意灵感，更是聚合力量共同奋斗的精彩。<br />牛人邦，蓄势待发，虚位以待！
	</p>
	<p>
		<label><input checked id="agree" type="checkbox" />阅读并同意牛人邦的<a
			href="/index.php../../resource/help/id/6.html">《服务协议》</a><a href="#">《牛人公告》</a></label>
	</p>
	<span> <a id="to_publish_project" href="javascript:;">发起我的项目</a>
	</span>
</div>
<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$("#to_publish_project")
								.click(
										function() {
											if ($("input[type='checkbox']:checked").length <= 0) {
												$.ThinkBox
														.error(
																"必须阅读并同意牛人邦的《服务协议》后才可以发布项目",
																{
																	'delayClose' : 1000
																});

											} else {
												window.location.href = "<%=path%>/project/publish";
											}
										});
					});
</script>

<%@include file="../Public/footer.jsp"%>
