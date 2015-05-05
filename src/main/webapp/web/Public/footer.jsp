<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<div class="footer">
		<div class="bot">
			<p>
				<a href="/index.php../../resource/help/id/1.html">关于我们</a>| <a
					href="/index.php../../resource/help/id/5.html">联系我们</a>| <a
					href="/index.php../../resource/help/id/6.html">服务协议</a>| <a
					href="/index.php../../resource/help/id/7.html">项目发起规范</a>| <a
					href="/index.php../../resource/help/id/8.html">新手帮助</a>| <a
					href="/index.php../../resource/help/id/9.html">帮助中心</a>| <a
					href="/index.php../../resource/help/id/19.html">创业资源池</a>
			</p>
			<p>
				帮助创业者建立联系 ©2014 京ICP备13045110号
				<!--技术支持：<a href="#">牛人邦技术部</a>-->
			</p>
			<ul>
				<li class="bot-sina"><a href="#"><em></em>新浪微博</a></li>
				<li class="bot-weixin"><a href="#"><em></em>腾讯微信</a></li>
				<li class="bot-baidu"><a href="#"><em></em>百度百科</a></li>
				<li class="bot-qq"><a href="#"><em></em>QQ交谈</a></li>
			</ul>
			<div class="clear"></div>
			<div class="ewm">
				<img src="<%=path%>/resource/Web/images/ewm.jpg" /> 扫一扫关注我们
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			$("*[acion='upclick']").click(function() {
				var $this = $(this);
				var cid = $(this).attr('cid');
				$.ajax({
					type : "post",
					data : {
						'cid' : cid
					},
					url : "/index.php/Creative/upclick",
					dataType : "text",
					success : function(text) {
						$this.text(text);
					}
				});
			});
		});
	</script>
</body>
</html>
