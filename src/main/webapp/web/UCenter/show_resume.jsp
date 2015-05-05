<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<h2>个人简历</h2>
<div class="jianli-info-left left">
	<div class="photo2">
		<a href="#"><img  src="/avatar/<{$userInfo.avatar}>"  width="128" height="128" alt="" /></a>
		<p><{$userInfo.true_name}></p>
	</div>
</div>
<div class="jianli-info-right right">
	<table border="0" cellspacing="0" cellpadding="0">
		<tr>
			<th>姓       名</th>
			<td><{$userInfo.true_name}></td>
		</tr>
		<tr>
			<th>性       别</th>
			<td><if condition="$userInfo.sex eq 1">男<else />女</if></td>
		</tr>
		<tr>
			<th>年       龄</th>
			<td><{$userInfo.age}></td>
		</tr>
		<tr>
			<th>所在/毕业院校</th>
			<td><{$userInfo.school_name}></td>
		</tr>
		<tr>
			<th>所在城市</th>
			<td><{$userInfo.province.name}><{$userInfo.city.name}></td>
		</tr>
		<tr>
			<th>手机号码</th>
			<td><{$userInfo.mobile}></td>
		</tr>
		<tr>
			<th>QQ号</th>
			<td><{$userInfo.icq_num}></td>
		</tr>
		<tr>
			<th>常用邮箱</th>
			<td><{$userInfo.email}></td>
		</tr>
		<tr>
			<th>角色定位</th>
			<td><{$userInfo.member_role.name}></td>
		</tr>
		<tr>
			<th valign="top">个人介绍</th>
			<td><p><{$userInfo.pre_achieve}></p></td>
		</tr>
		<tr>
			<th>希望加入的团队</th>
			<td><{$userInfo.hope_industry_type.name}></td>
		</tr>
	</table>
</div>
<div class="clear"></div>

