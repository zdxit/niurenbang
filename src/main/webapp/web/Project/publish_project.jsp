<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@include file="../common/Public/header.jsp"%>
<script type="text/javascript"
	src="<%=path%>/resource/ThinkBox/jquery.ThinkBox.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/kindeditor/kindeditor-all-min.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/Web/uploadify-v3.1/jquery.uploadify-3.1.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/resource/ThinkBox/css/ThinkBox.css" media="all" />

<div class="banner-fb">
	<h2>在这里发布您的创业项目</h2>
	<p>完整的信息可以让你更快的找到合伙人</p>
	<img src="<%=path%>/resource/Web/images/ico5.png" />
</div>
<form action="<%=path %>/project/save" method="post"
	id="publish_project_form">
	<div class="contain">
		<div class="project-img fff">
			<div class="fb-top-l left">
				<h2>项目LOGO</h2>
				<div class="fb-upload right">
					<div class="fb-admin">
						<img src="<%=path%>/resource/Web/images/default1.png" width="174"
							height="177" alt="" id="logo-pic-show" />
					</div>
					<input type="file" id="logo-pic-uploder" /> 
					<input type="hidden" name="logo_pic" value="" />
					<div id="logo-pic-uploder-queue"></div>
					<p>提示：建议添加长宽比为1:1的jpg/jpeg/png格式文件，文件小于2MB</p>
				</div>
				<div class="clear"></div>
			</div>
			<div class="fb-top-r right">
				<dl>
					<dt>
						<span>*</span>项目名称
					</dt>
					<dd>
						<input name="title" type="text" class="fa-input" maxlength="15" />
						<span>给项目起个简单明了，便于记忆的名字吧，方便合伙人通过项目名称搜索到您的项目。标题长度请控制在15字以内</span>
					</dd>
					<div class="clear"></div>
				</dl>
				<dl>
					<dt>
						<span>*</span>所在地区
					</dt>
					<dd>
						<select name="province" id="province">
							<option value=''>请选择省份</option>
							<c:forEach items="${provinceList}" var="region">
								<option value="${region.id}">${region.name}</option>
							</c:forEach>
						</select> 
						<select name="city" id="city">
							<option value=''>请选择城市</option>
						</select>
					</dd>
					<div class="clear"></div>
				</dl>
				<dl>
					<dt>
						<span>*</span>项目方向
					</dt>
					<dd>
						<select name="industryType" class="fa-select">
							<c:forEach items="${industryTypes}" var="industryType">
								<option value="${industryType.id}">${industryType.name}</option>
							</c:forEach>
						</select>
					</dd>
					<div class="clear"></div>
				</dl>
				<dl>
					<dt>
						<span>*</span>一句简述
					</dt>
					<dd>
						<textarea name="simpleDescrip" rows="2" class="fa-textarea"></textarea>
						<span>请用一句话介绍您的项目是做什么的。</span>
					</dd>
					<div class="clear"></div>
				</dl>
			</div>
			<div class="clear"></div>
		</div>
		<div class="project-intro fff mt33">
			<ul class="project-intro-ul tab">
				<li class="current"><a href="javascript:;"><span>*</span>关于团队</a><em></em></li>
				<li><a href="javascript:;"><span>*</span>项目简介</a><em></em></li>
				<li><a href="javascript:;">项目前景</a><em></em></li>
				<li><a href="javascript:;">竞争优势</a><em></em></li>
				<div class="clear"></div>
			</ul>
			<div class="project-intro-con tab">
				<p>可包括组建时间，现有人员，组织构成与分工等。</p>
				<p>&nbsp;</p>
				<textarea name="aboutTeam" rows="2"
					style="width:800px;height: 350px;" class="fa-textarea"></textarea>
			</div>
			<div class="project-intro-con tab" style="display: none">
				<p>请详细描述下您的项目，发现的实际需求，自己的创业历程，自己的感悟和心得等。建议以图片加文字的形式描述。</p>
				<p>&nbsp;</p>
				<textarea name="projectDescrip" rows="2"
					style="width:800px;height: 350px;" class="fa-textarea"></textarea>
			</div>
			<div class="project-intro-con tab" style="display: none">
				<p>可以从同类项目，市场现状等多方面概述下项目发展前景。</p>
				<p>&nbsp;</p>
				<textarea name="projectFuture" rows="2"
					style="width:800px;height: 350px;" class="fa-textarea"></textarea>
			</div>
			<div class="project-intro-con tab" style="display: none">
				<p>与行业其他相似产品相比，您的项目有哪些优势呢？例如资源优势、团队优势或者技术优势等。建议以图片加文字的形式描述。</p>
				<p>&nbsp;</p>
				<textarea name="competitiveEdge" rows="2"
					style="width:800px;height: 350px;" class="fa-textarea"></textarea>
			</div>
		</div>
		<div class="project-team fff mt33">
			<dl>
				<dt>
					<span>*</span>团队情况
				</dt>
				<dd>
					<span>团队人数：</span> 
					<input name="teamPeople" type="text"
						placeholder="团队人数" /> 
					<span>人，其中全职人数：</span> <input
						name="teamFulltimePeople" type="text" placeholder="全职人数" />
				</dd>
				<div class="clear"></div>
			</dl>
			<dl>
				<dt>
					<span>*</span>项目阶段
				</dt>
				<dd>
					<select name="progressType" class="fa-select">
						<option value="1">有个好主意</option>
						<option value="2">产品开发中</option>
						<option value="3">上线运营</option>
					</select>
				</dd>
				<div class="clear"></div>
			</dl>
			<dl>
				<dt>产品链接</dt>
				<dd>
					<div class="proj-lian">
						<div class="proj-left left">
							<label> 
							<input type="checkbox" class="project_link"
								value="webUrl" /> WEB
							</label> <label> 
							<input type="checkbox" class="project_link"
								value="iphoneAppUrl" /> iPhone App
							</label> <label> 
							<input type="checkbox" class="project_link"
								value="androidAppUrl" /> Android App
							</label>
						</div>
						<div class="proj-right left">
							<p style="margin-bottom: 10px;height: 30px;">
								<input name="webUrl" type="text"
									placeholder="请填写网站地址，以http://或https://开头" style="display: none" />
							</p>
							<p style="margin-bottom: 10px;height: 30px;">
								<input name="iphoneAppUrl" type="text"
									placeholder="请填写IOS App下载地址，以http://或https://开头"
									style="display: none" />
							</p>
							<p>
								<input name="androidAppUrl" type="text"
									placeholder="请填写Android App下载地址，以http://或https://开头"
									style="display: none" />
							</p>
						</div>
						<div class="clear"></div>
					</div>
				</dd>
				<div class="clear"></div>
			</dl>
		</div>
		<div class="project-part fff mt33">
			<h2>召唤合伙人</h2>
			<div class="proj-part-name">
				<label>
				 <input type="checkbox" name="need_member_role"
					value="2" id="CheckboxGroup2_0" /> 技术合伙人
				</label><label> 
				<input type="checkbox" name="need_member_role"
					value="3" id="CheckboxGroup2_0" /> 营销合伙人
				</label><label> 
				<input type="checkbox" name="need_member_role"
					value="4" id="CheckboxGroup2_0" /> 运营合伙人
				</label><label> 
				<input type="checkbox" name="need_member_role"
					value="5" id="CheckboxGroup2_0" /> 设计合伙人
				</label><label> 
				<input type="checkbox" name="need_member_role"
					value="6" id="CheckboxGroup2_0" /> 产品合伙人
				</label><label> 
				<input type="checkbox" name="need_member_role"
					value="7" id="CheckboxGroup2_0" /> 其它合伙人
				</label>
			</div>
			<h2>我的期冀</h2>
			<p>合伙人正在看你的项目，想不想说点什么打动TA？真诚地说出自己憧憬的未来，吸引那些也有过同样想法的人,召唤他们立刻加入吧！</p>
			<p>&nbsp;</p>
			<textarea name="myHope" cols="" rows="5"
				style="width:800px;height: 350px;"></textarea>
			<h2>
				<span>*</span>团队负责人联系方式
			</h2>
			<div class="team-contact">
				<span><i>TEL：</i><input name="telNo" type="text" /></span> <span><i>QQ：</i><input
					name="qqNo" type="text" /></span>
				<div class="clear"></div>
				<span><i>E-mail：</i><input name="email" type="text" /></span>
			</div>
		</div>
		<input type="hidden" name="needMemberRole" >
		
		<div class="proj-fb-submit">
			<input name="" type="submit" value="提&nbsp;交" />
		</div>
	</div>
</form>

<script type="text/javascript">
	$(function() {
		$("ul.tab > li").click(function() {
			$(this).addClass("current").siblings("li").removeClass('current');
			var index = $(this).index();
			$("div.tab").each(function() {
				if (index === $(this).index() - 1) {
					$("div.tab").hide();
					$(this).show();
					return false;
				}
			});
		});
		$("#logo-pic-uploder")
				.uploadify(
						{
							'queueSizeLimit' : 1,
							'removeTimeout' : 0.5,
							'preventCaching' : true,
							'multi' : false,
							'swf' : '<%=path%>/resource/Web/uploadify-v3.1/uploadify.swf',
							'uploader' : '<%=path%>/project/upload/icon',
							'buttonText' : '<i class="userup-icon"></i>上传图片',
							'width' : '90',
							'height' : '28',
							'fileTypeExts' : '*.jpg; *.png; *.gif;',
							'onUploadSuccess' : function(file, data, response) {
								var data = $.parseJSON(data);
								console.log(data);
								if (data.status === 1) {
									alert(data['url']);
									$("#logo-pic-uploder-queue").hide();
									alert('<%=path%>/'+data['url'] + '?random='
											+ Math.random());
									$("#logo-pic-show").attr(
											"src",'<%=path%>/'+data['url'] + '?random='
													+ Math.random());
									$("input[name='logo_pic']")
											.val('<%=path%>/'+data['url']);
								} else {
									alert(data.info);
								}

							},
							"onUploadProgress" : function(file, bytesLoaded,
									bytesTotal) {
								var percent = Math.ceil(bytesLoaded
										/ bytesTotal) * 100;
								$("#logo-pic-uploder-queue")
										.html(percent + "%");
							}
						});
		var about_team_text = KindEditor.create('textarea[name="aboutTeam"]');
		var project_descrip_text = KindEditor
				.create('textarea[name="projectDescrip"]');
		var project_future_text = KindEditor
				.create('textarea[name="projectFuture"]');
		var competitive_edge_text = KindEditor
				.create('textarea[name="competitiveEdge"]');
		var my_hope_text = KindEditor.create('textarea[name="myHope"]');
		$("#province")
				.change(
						function() {
							var pid = $(this).val();
							var $city = $("#city");
							var $option = $("<option value=''>请选择城市</option>");
							$city.html($option);
							$
									.ajax({
										type : "post",
										data : {
											'pid' : pid
										},
										url : "<%=path%>/resource/city",
										dataType : "json",
										success : function(json) {
											for (var i = 0; i < json.length; i++) {
												var $option = $("<option value='" + json[i].id + "'>"
														+ json[i].name
														+ "</option>");
												$city.append($option);
											}
										}
									});
						});
		$(".project_link").click(function() {
			if ($(this).attr('checked') == 'checked') {
				$("input[name='" + $(this).val() + "']").show();
			} else {
				$("input[name='" + $(this).val() + "']").hide();
			}
		});
		$("#publish_project_form")
				.submit(
						
						function() {
							if ($('input[name="logo_pic"]').val() === "") {
								$.ThinkBox.error("请上传一张项目LOGO!", {
									'delayClose' : 500
								});
								alert("sefgwegw");
								$('input[name="logo_pic"]').focus();
								return false;
							}
							if ($('input[name="title"]').val() === "") {
								$.ThinkBox.error("项目标题不能为空!", {
									'delayClose' : 500
								});
								$('input[name="title"]').focus();
								return false;
							}
							if ($('select[name="province"]').val() === "") {
								$.ThinkBox.error("请选择项目省份!", {
									'delayClose' : 500
								});
								$('select[name="province"]').focus();
								return false;
							}
							if ($('select[name="city"]').val() === "") {
								$.ThinkBox.error("请选择项目城市!", {
									'delayClose' : 500
								});
								$('select[name="city"]').focus();
								return false;
							}
							if ($('textarea[name="simpleDescrip"]').val() === "") {
								$.ThinkBox.error("一句简述不能为空!", {
									'delayClose' : 500
								});
								$('textarea[name="simpleDescrip"]').focus();
								return false;
							}
							if (about_team_text.isEmpty()) {
								$.ThinkBox.error("关于团队内容不能为空!", {
									'delayClose' : 500
								});
								about_team_text.focus();
								return false;
							}
							if (project_descrip_text.isEmpty()) {
								$.ThinkBox.error("项目简介内容不能为空!", {
									'delayClose' : 500
								});
								project_descrip_text.focus();
								return false;
							}
							if ($('input[name="teamPeople"]').val() === ""
									|| $('input[name="teamFulltimePeople"]')
											.val() === "") {
								$.ThinkBox.error("请填写项目人数!", {
									'delayClose' : 500
								});
								$('input[name="teamPeople"]').focus();
								return false;
							}

							if ($('input[name="telNo"]').val() === "") {
								$.ThinkBox.error("负责人联系电话不能为空!", {
									'delayClose' : 500
								});
								$('input[name="telNo"]').focus();
								return false;
							}
							if ($('input[name="qqNo"]').val() === "") {
								$.ThinkBox.error("负责人联系QQ号不能为空!", {
									'delayClose' : 500
								});
								$('input[name="qqNo"]').focus();
								return false;
							}
							if ($('input[name="email"]').val() === "") {
								$.ThinkBox.error("负责人联系电话不能为空邮箱!", {
									'delayClose' : 500
								});
								$('input[name="email"]').focus();
								return false;
							}
							var needMemberRole="";
							$('input[name="need_member_role"]:checked').each(function(){ 
								needMemberRole += $(this).val()+",";
							}); 
							needMemberRole=needMemberRole.substring(0, needMemberRole.length-1);
							$('input[name="needMemberRole"]').val(needMemberRole);
							
						});
	});
</script>


<%@include file="../common/Public/footer.jsp"%>
