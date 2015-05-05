<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@include file="../common/Public/header.jsp"%>
	<div class="contain">
		<div class="intro-left left">
			<div class="tab mine-recruit">
				<div class="tab-1">
					<ul class="tab-m">
						<li class='cur'><a href="javascript:;"><span>我发布的招募</span></a><em></em></li>
						<li><a href="/index.php/UCenter/received_resume.html"><span>收到的简历</span></a><em></em></li>
						<div class="clear"></div>
					</ul>
				</div>
				<div class="tab-box">
					<div class="thfnxw">
						<div class="recruitment">
							<ul>
							</ul>
							<div class="paginator"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="dak">
			<div class="wode right">
				<span class="ju zhaom"> <a
					href="/index.php/UCenter/my_recruit.html" class="current">我的招募</a>
				</span>
			</div>
			<div class="wode right">
				<span class="ju toud"> <a
					href="/index.php/UCenter/my_send_resume.html">我的投递</a>
				</span>
			</div>

			<div class="wode right">
				<span class="ju xiaox"> <a
					href="/index.php/UCenter/my_message.html">我的消息</a>
				</span>
			</div>
		</div>
		<div class="clear"></div>
	</div>

<%@include file="../common/Public/footer.jsp"%>
