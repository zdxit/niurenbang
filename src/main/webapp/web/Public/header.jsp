<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>大学生创业,从找合伙人开始|牛人邦</title>
<meta name="description"
	content="小梦想 聚合大能量。在这里，你结识到的不仅是创业团队，更是一起实现梦想的同行伙伴。在这里，你邂逅的不止是创意灵感，更是聚合力量共同奋斗的精彩。牛人邦，蓄势待发，虚位以待！ " />
<meta name="keywords" content="牛人邦 大学生创业 创业 创业合伙人 创业项目" />
<link href="<%=path%>/resource/Web/css/style.css" rel="stylesheet"
	type="text/css" />
<link href="<%=path%>/resource/Web/css/login.css" rel="stylesheet"
	type="text/css" />
<script src="<%=path%>/resource/Web/js/jquery.js" type="text/javascript"></script>

</head>

<body>

	<c:choose>

		<c:when test="${islogin}">

			<form name="chpwd-dialog-form" id="chpwd-dialog-form"
				action="<%=path%>/user/chgpwd" method="post">
				<div class="quan" id="chpwd-dialog-mask"></div>
				<div class="loginkuang" id="chpwd-dialog">
					<a class="exit" href="javascript:void(0);" action="closechpwd">×</a>
					<ul>
						<li class="logintitle">修改密码</li>
						<li><input name="oldpassword" type="password"
							placeholder="原始密码" /></li>
						<li><input name="password" type="password"
							placeholder="新的登录密码" /></li>
						<li><input name="repassword" type="password"
							placeholder="请再输入一次新密码" /></li>
						<li><input class="denglu" type="button"
							action="chpwdDialogSubmit" value="提&nbsp;交" />
							<div id="dialog-chpwd-form-message" class="form-validator-error"
								style="display: none"></div></li>
					</ul>
				</div>
			</form>

			<script>
		$(function () {
			$('*[action="chpwd"]').click(function () {
				$('#chpwd-dialog').show();
				$('#chpwd-dialog-mask').show().height($('body').height());
			});
			$('*[action="closechpwd"]').click(function () {
				$('#chpwd-dialog').hide();
				$('#chpwd-dialog-mask').hide();
			});
			$('*[action="chpwdDialogSubmit"]').click(function () {
				var oldpassword = $("#chpwd-dialog-form").find('input[name="oldpassword"]').val();
				var password = $("#chpwd-dialog-form").find('input[name="password"]').val();
				var repassword = $("#chpwd-dialog-form").find('input[name="repassword"]').val();
				if (oldpassword === "") {
					$("#dialog-chpwd-form-message").html("原始密码不能为空！").show();
					return false;
				}
				if (password === "") {
					$("#dialog-chpwd-form-message").html("新的登录密码不能为空！").show();
					return false;
				}
				if (repassword === "" || repassword !== password) {
					$("#dialog-chpwd-form-message").html("确认密码与新密码不一致！").show();
					return false;
				}
				$.ajax({
					type: "post",
					data: {'oldpassword': oldpassword, 'repassword': repassword, 'password': password},
					url: "<%=path%>/user/chgpwd",
					dataType: "json",
					success: function (json) {
						if (json.state) {
							window.location.reload();
						} else {
							$("#dialog-chpwd-form-message").html(json.msg).show();
						}
					}
				});
			});

		});
	</script>
		</c:when>

		<c:otherwise>
			<!--登录-->
			<form name="login-dialog-form" id="login-dialog-form"
				action="<%=path%>/user/login" method="post">
				<div class="quan" id="login-dialog-mask"></div>
				<div class="loginkuang" id="login-dialog">
					<a class="exit" href="javascript:void(0);" action="closelogin">×</a>
					<ul>
						<li class="logintitle">登&nbsp;录</li>
						<li><input name="email" type="text" placeholder="请输入邮箱" /></li>
						<li><input name="password" type="password"
							placeholder="请输入密码" /></li>
						<li style="margin-top:10px;"><a href="">忘记密码?</a></li>
						<li><input class="denglu" type="button" action="dialogSubmit"
							value="登&nbsp;录" />
							<div id="dialog-login-form-message" class="form-validator-error"
								style="display: none"></div></li>
					</ul>
					<p>
						还没有账号?<a href="<%=path%>/user/toregister">立即注册</a>
					</p>
				</div>
			</form>
			<script>
			$(function() {
				$('*[action="login"]').click(function() {
					alert("");
					$('#login-dialog').show();
					$('#login-dialog-mask').show().height($('body').height());
					return false;
				});
				$('*[action="closelogin"]').click(function() {
					$('#login-dialog').hide();
					$('#login-dialog-mask').hide();
					return false;
				});
				$('*[action="dialogSubmit"]')
						.click(
								function() {
									var email = $("#login-dialog-form").find(
											'input[name="email"]').val();
									var password = $("#login-dialog-form")
											.find('input[name="password"]')
											.val();
									if (email === "") {
										$("#dialog-login-form-message").html(
												"登录邮箱不能为空！").show();
										return false;
									}
									var emailFilter = /^([_A-Za-z0-9-])+@(([A-Za-z0-9-])+.)+([a-zA-Z0-9]{2,4})+$/;
									if (!emailFilter.test(email)) {
										$("#dialog-login-form-message").html(
												"登录邮箱格式不正确！").show();
										return false;
									}
									if (password === "") {
										$("#dialog-login-form-message").html(
												"登录密码不能为空！").show();
										return false;
									}
									$.ajax({
												type : "post",
												data : {
													'email' : email,
													'password' : password
												},
												url: "<%=path%>/user/login/",
												dataType: "json",
												success: function (json) {
													if (json.state) {
														window.location.href="<%=path%>/user/index";
													} else {
														$(
																"#dialog-login-form-message")
																.html(json.msg)
																.show();
													}
												}
											});
								});

			});
		</script>


		</c:otherwise>
	</c:choose>


	<div class="header">
		<div class="nav">
			<div class="logo">
				<a href="/"><img src="<%=path%>/resource/Web/images/logo.png"
					width="147"></a>
			</div>
			<div class="form left">
				<a href="<%=path %>/" <c:if test="${menu}==1">class="current" </c:if>>首页</a> <a
					href="<%=path %>/project/browse"
					<c:if test="${menu}==2">class="current" </c:if>>项目浏览</a> <a
					href="<%=path %>/recruit/index"
					<c:if test="${menu}==3">class="current" </c:if>>招募队友</a>
				<c:choose>
					<c:when test="${user.trueName}==''">
						<a href="<%=path %>/user/resume"
							<c:if test="${menu}==4">class="current"</c:if>>个人简历</a>
					</c:when>
					<c:otherwise>

						<a href="<%=path %>/user/index"
							<c:if test="${menu}==4">class="current" </c:if>>个人简历</a>

					</c:otherwise>

				</c:choose>

			</div>
			<div class="nav-right right">
				<div class="login right">
					<c:choose>
						<c:when test="${user==null}">
							<a href="javascript:void(0);" action="login">登录</a>
							<a href="<%=path%>/user/toregister">注册</a>
							<a href="<%=path%>/project/publish" class="publish">发布项目</a>

						</c:when>
						<c:otherwise>

							<div class="top-admin">
								<span class="uc-hello">您好，</span>
								<ul>
									<li class="login-info login-info-hover-action" id="login-info">
										<p class="top-wbico">&nbsp;</p> <a href="<%=path%>/user/index"
										class="uc-admin-name"><span>${user.email}</span></a>
										<div class="clear"></div>
									</li>
								</ul>
								<div class="login-info-box login-info-hover-action"
									id="login-info-box">
									<a href="<%=path%>/user/set/headimg" class="uc-admin"><img
										src="<%=path%>/avatar/${user.avatar}" height="56" width="56"
										alt="" /></a>
									<div class="t-img">
										<p>牛人邦账号：${user.email}</p>
										<a href="javascript:;" action="chpwd" class="uc-change">修改密码</a>
										<a href="<%=path%>/user/logout" class="uc-manage">退出</a>
									</div>
						</c:otherwise>
					</c:choose>
					<div class="clear"></div>
				</div>

			</div>
			<script>
			$(document).ready(function () {
				$(".login-info-hover-action").hover(
						function () {
							$("#login-info").addClass('login-info-hover');
							$("#login-info-box").show();
						//	alert("aefnwiernvi");
						},
						function () {
							$("#login-info").removeClass('login-info-hover');
							$("#login-info-box").hide();
						}
				);
			});

					function EnterPress() {
						if (event.keyCode === 13) {
							window.location.href = "<%=path%>/project/index/key/"
								+ $("#searchkeybox").val();
						//								alert($("#searchkeybox").val());
					}
				}
			</script>

			<div class="clear"></div>
		</div>


		<div class="search right">
			<input type="text" value="${searchkeybox}" id="searchkeybox"
				placeholder="输入您要查找的内容" onkeypress="EnterPress()"
				onkeydown="EnterPress()" />
		</div>
		<div class="clear"></div>
	</div>
	<div class="clear"></div>
	</div>
	</div>