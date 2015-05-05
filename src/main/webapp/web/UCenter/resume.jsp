<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@include file="../common/Public/header.jsp"%>

<script>
	$(function() {
		$('*[action="chpwd"]').click(function() {
			$('#chpwd-dialog').show();
			$('#chpwd-dialog-mask').show().height($('body').height());
		});
		$('*[action="closechpwd"]').click(function() {
			$('#chpwd-dialog').hide();
			$('#chpwd-dialog-mask').hide();
		});
		$('*[action="chpwdDialogSubmit"]').click(
				function() {
					var oldpassword = $("#chpwd-dialog-form").find(
							'input[name="oldpassword"]').val();
					var password = $("#chpwd-dialog-form").find(
							'input[name="password"]').val();
					var repassword = $("#chpwd-dialog-form").find(
							'input[name="repassword"]').val();
					if (oldpassword === "") {
						$("#dialog-chpwd-form-message").html("原始密码不能为空！")
								.show();
						return false;
					}
					if (password === "") {
						$("#dialog-chpwd-form-message").html("新的登录密码不能为空！")
								.show();
						return false;
					}
					if (repassword === "" || repassword !== password) {
						$("#dialog-chpwd-form-message").html("确认密码与新密码不一致！")
								.show();
						return false;
					}
					$.ajax({
						type : "post",
						data : {
							'oldpassword' : oldpassword,
							'repassword' : repassword,
							'password' : password
						},
						url : "/index.php/UCenter/chpwd.html",
						dataType : "json",
						success : function(json) {
							if (json.state) {
								window.location.reload();
							} else {
								$("#dialog-chpwd-form-message").html(
										json.message).show();
							}
						}
					});
				});

	});
</script>


<div class="regist-info">

	<div class="perfect-info">
		<div class="info-name">
			<ul class="tab">
				<li class="grxx current"><a href="javascript:;">个人信息</a><em></em>
				<div class="clear"></div></li>
				<li class="lxfs"><a href="javascript:;">联系方式</a><em></em>
				<div class="clear"></div></li>
				<li class="scfw"><a href="javascript:;">希望加入的团队</a><em></em>
				<div class="clear"></div></li>
			</ul>
		</div>
		<div class="photo1">
			<a href="/index.php/UCenter/avatar.html" title="点击修改头像"
				target="_blank"> <img src="/avatar/2015/04/16/552e95c4582e6.jpg"
				height="128" />
			</a>
			<p><p
				style="text-align:center; font-size:13px; color:#666;">基本信息</p>
			</p>
			</div>
			<form name="resume-form" class="tab" id="resume-form1"
			action="/index.php/UCenter/save_resume.html" method="post">
				<div class="tab">
					<div class="perfect-info-input">
						<input name="true_name" value="张东轩" type="text" placeholder="真实姓名"
						data-rule="真实姓名:required" />
					</div>
					<div class="perfect-info-input">
						<select name="sex" class="left" data-rule="性别:required">
							<option>性别</option>
							<option value="1" selected>男</option>
							<option value="2">女</option>
						</select>
						<select name="age" class="right" data-rule="年龄:required">
							<option>年龄</option>
							<option value="15">15岁</option>
						<option value="16">16岁</option>
						<option value="17">17岁</option>
						<option value="18">18岁</option>
						<option value="19">19岁</option>
						<option value="20">20岁</option>
						<option value="21">21岁</option>
						<option value="22" selected>22岁</option>
						<option value="23">23岁</option>
						<option value="24">24岁</option>
						<option value="25">25岁</option>
						<option value="26">26岁</option>
						<option value="27">27岁</option>
						<option value="28">28岁</option>
						<option value="29">29岁</option>
						<option value="30">30岁</option>
						<option value="31">31岁</option>
						<option value="32">32岁</option>
						<option value="33">33岁</option>
						<option value="34">34岁</option>
						<option value="35">35岁</option>
						<option value="36">36岁</option>
						<option value="37">37岁</option>
						<option value="38">38岁</option>
						<option value="39">39岁</option>
						<option value="40">40岁</option>						</select>
						<div class="clear"></div>
					</div>
					<div class="perfect-info-input">
						<input name="school_name" value="中南大学" type="text"
						placeholder="所在/毕业院校" />
					</div>
					<div class="perfect-info-input">
						<select name="province" class="left" id="dict-city-province"
						selectId="14">
							<option value="0">请选择省份</option>
						</select>
						<select name="city" class="right" id="dict-city-city"
						selectId="197">
							<option value="0">请选择城市</option>
						</select>
						<div class="clear"></div>
					</div>
					<input type="submit" value="下一步：继续完善以下信息" class="submit next" />
				</div>
			</form>
			<form class="tab" style="display:none" name="resume-form"
			id="resume-form2" action="/index.php/UCenter/save_resume"
			method="post">
				<div>
					<div class="perfect-info-input">
						<input name="mobile" type="text" value="13272454032"
						placeholder="手机号码" />
					</div>
					<div class="perfect-info-input">
						<input name="icq_num" type="text" value="1191641113"
						placeholder="Q Q号码" />
					</div>

					<div class="perfect-info-input">
						<input disabled type="text" value="xuemiadmin@163.com" />
					</div>
					<input type="submit" value="下一步：继续完善以下信息" class="submit next" />
				</div>
			</form>
			<form class="tab" style="display:none" name="resume-form"
			id="resume-form3" action="/index.php/UCenter/save_resume"
			method="post">
				<div>
					<div class="perfect-info-input1">
						<select name="member_role_id" id='member_role_id' selectId="2">
							<option>请选择角色定位</option>
							<option value="1">创始人</option>
						<option value="2">技术</option>
						<option value="3">营销</option>
						<option value="4">运营</option>
						<option value="5">设计</option>
						<option value="6">产品</option>
						<option value="7">其它</option>						</select>
					</div>
					<div class="perfect-info-input">
						<textarea name="pre_achieve" placeholder="个人介绍">哈哈</textarea>
					</div>
					<div class="perfect-info-input1">
						<select name="hope_industry_type" id='hope_industry_type'
						selectId="1">
							<option>希望加入的团队</option>
							<option value="1">互联网</option>
						<option value="2">科技</option>
						<option value="3">娱乐</option>
						<option value="4">生活</option>
						<option value="5">农业</option>
						<option value="8">文化艺术</option>
						<option value="9">教育</option>
						<option value="10">其他</option>						</select>
					</div>
					<input type="submit" value="提交保存" class="submit" />
				</div>
			</form>
			<div id="validator-form-message"></div>
		</div>

<%@include file="../common/Public/footer.jsp"%>