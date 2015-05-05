<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@include file="../common/Public/header.jsp"%>
<div class="regist">
	<form name="register-form" id="register-form"
		action="/index.php/Register/do_reg" method="post">
		<div class="regist-con">
			<ul class="regist-ul">
				<li utype="1" class="current"><a href="javascript:;">找队友</a></li>
				<li utype="2"><a href="javascript:;">找项目</a></li>
			</ul>
			<input type="hidden" id="utype" name="utype" value="1" />
			<div class="clear"></div>
			<input name="email" type="text" placeholder="请输入电子邮箱"
				data-rule="电子邮箱:email,required" /> <input name="password"
				id="password" type="password" placeholder="请输入密码"
				data-rule="登录密码:required" /> <input name="repassword"
				type="password" placeholder="请再次输入密码" data-rule-match="#password"
				data-rule="确认密码:required,match" />
			<p>
				<label> <input checked type="checkbox" />我已阅读并同意<a
					href="/index.php../../resource//help/id/6.html">《牛人邦服务协议》</a>
				</label>
			</p>

			<input type="submit" value="立即注册" class="submit" />
			<div id="validator-form-message"></div>
			<p class="regist-ed">
				已有牛人邦账号，请<a href="javascript:;" action="login"]>马上登录</a>
			</p>
		</div>
	</form>
</div>

<%@include file="../Public/footer.jsp"%>
