<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@include file="../common/Public/header.jsp"%>


	<div class="contain">
		<div class="resume">
			<div class="big">
				<div class="jieshao left">
					<!--头像-->
					<dl>
						<dt>
							<div class="photo">
								<a href="<%=path%>/set/headimg"><img
									src="<%=path%>/avatar/${user.avatar}" height="134" /></a>
							</div>
							<p style="text-align:center; font-size:13px; color:#666;">基本信息</p>
						</dt>
					</dl>
					<ul>
						<li
							style="background:url(<%=path%>/resource/Web/images/bnt_13.png) left center no-repeat;">${user.memberRole}</li>
						<li
							style="background:url(<%=path%>/resource/Web/images/bnt_16.png) left center no-repeat;">${user.province}${user.city}</li>
						<br />
						<br />
						<li
							style="background:url(<%=path%>/resource/Web/images/bnt_21.png) left center no-repeat; margin-left:10px;">${user.mobile}</li>
						<li
							style="background:url(<%=path%>/resource/Web/images/bnt_24.png) left center no-repeat; margin-left:10px;">${user.email}</li>
					</ul>
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
				<div class="jianli1 fff border">
					<h1>创业可以是件很酷的事</h1>
					<h2 class="yulan">
						<a href="javascript:;" id="example">预览简历<img
							src="<%=path%>/resource/Web/images/bnt_29.png" /></a>
					</h2>
					<h2>
						<a href="/index.php/UCenter/resume.html">完善在线简历<img
							src="<%=path%>/resource/Web/images/bnt_29.png" /></a>
					</h2>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>

<div id="LoginBox">
		<div class="row1">
			<a href="javascript:void(0)" title="关闭窗口" class="close_btn"
				id="closeBtn">×</a>
		</div>
		<div class="jianli-info">
			<h2>个人简历</h2>
			<div class="jianli-info-left left">
				<div class="photo2">
					<a href="#"><img src="<%=path %>/avatar/${user.avatar}" width="128" height="128"
						alt="" /></a>
					<p></p>
				</div>
			</div>
			<div class="jianli-info-right right">
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<th>姓 名</th>
						<td>${user.trueName}</td>
					</tr>
					<tr>
						<th>性 别</th>
					<td>${user.sex}</td>
					</tr>
					<tr>
						<th>年 龄</th>
						<td>${user.age}</td>
					</tr>
					<tr>
						<th>所在/毕业院校</th>
					<td>${user.schoolName}</td>
					</tr>
					<tr>
						<th>所在城市</th>
						<td>${user.province}${user.city}</td>
					</tr>
					<tr>
						<th>手机号码</th>
						<td>${user.mobile}</td>
					</tr>
					<tr>
						<th>QQ号</th>
						<td>${user.icqNum}</td>
					</tr>
					<tr>
						<th>常用邮箱</th>
						<td>${user.email}</td>
					</tr>
					<tr>
						<th>角色定位</th>
						<td>${user.sex}</td>
					</tr>
					<tr>
						<th valign="top">个人介绍</th>
						<td><p>${user.preAchieve}</p></td>
					</tr>
					<tr>
						<th>希望加入的团队</th>
						<td>${user.hopeIndustryType}</td>
					</tr>
				</table>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<script type="text/javascript">
		$(function($) {
			//弹出登录
			$("#example").on('click', function() {
				$("body").append("<div id='mask'></div>");
				$("#mask").addClass("mask").fadeIn("slow");
				$("#LoginBox").fadeIn("slow");
			});
			//关闭
			$(".close_btn").hover(function() {
				$(this).css({
					color : 'black'
				})
			}, function() {
				$(this).css({
					color : '#999'
				})
			}).on('click', function() {
				$("#LoginBox").fadeOut("fast");
				$("#mask").css({
					display : 'none'
				});
			});
		});
	</script>

<%@include file="../Public/footer.jsp"%>
