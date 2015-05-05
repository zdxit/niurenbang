<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<%@include file="../common/Public/header.jsp"%>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/resource/Web/css/avatar.css" media="all">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/resource/Web/css/jquery.Jcrop.min.css" media="all">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/resource/Web/js/uploadify-v3.1/uploadify.css"
	media="all">
<script type="text/javascript"
	src="<%=path%>/resource/Web/uploadify-v3.1/jquery.uploadify-3.1.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/Web/js/jquery.Jcrop.min.js"></script>

<script type="text/javascript"
	src="<%=path%>/resource/ThinkBox/jquery.ThinkBox.js"></script>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/resource/ThinkBox/css/ThinkBox.css" media="all">

<script type="text/javascript">
			$(function () {
				//上传头像(uploadify插件)
				$("#user-pic").uploadify({
					'queueSizeLimit': 1,
					'removeTimeout': 0.5,
					'preventCaching': true,
					'multi': false,
					'swf': '<%=path%>/resource/Web/uploadify-v3.1/uploadify.swf',
							'uploader' : '<%=path%>/set/headimg/uploadimg',
							'buttonText' : '<i class="userup-icon"></i>上传头像',
							'width' : '200',
							'height' : '200', 
							'fileTypeExts' : '*.jpg; *.png; *.gif;',
							'onUploadSuccess' : function(file, data, response) {
								//alert(data);
								var data = $.parseJSON(data);
								if (data['status'] == 0) {
									$.ThinkBox.error(data['info'], {
										'delayClose' : 3000
									});
									return;
								}
								var preview = $('.upload-area').children(
										'#preview-hidden');
								preview.show().removeClass('hidden');
								//两个预览窗口赋值
								$('.crop').children('img').attr(
										'src','<%=path%>/avatar/'+data['url'] + '?random='
												+ Math.random());
								//隐藏表单赋值
								$('#img_src').val('<%=path%>/avatar/'+data['url']);
								$('#picName').val(data['picName']);
								//绑定需要裁剪的图片
								var img = $('<img />');
								preview.append(img);
								preview.children('img').attr(
										'src',
										'<%=path%>/avatar/'+data['url'] + '?random='
												+ Math.random());
								var crop_img = preview.children('img');
								crop_img.attr('id', "cropbox").show();
								var img = new Image();
								img.src = data['url'] + '?random='
										+ Math.random();
								//根据图片大小在画布里居中
								img.onload = function() {
									var img_height = 0;
									var img_width = 0;
									var real_height = img.height;
									var real_width = img.width;
									if (real_height > real_width
											&& real_height > 200) {
										var persent = real_height / 200;
										real_height = 200;
										real_width = real_width / persent;
									} else if (real_width > real_height
											&& real_width > 200) {
										var persent = real_width / 200;
										real_width = 200;
										real_height = real_height / persent;
									}
									if (real_height < 200) {
										img_height = (200 - real_height) / 2;
									}
									if (real_width < 200) {
										img_width = (200 - real_width) / 2;
									}
									preview.css({
										width : (200 - img_width) + 'px',
										height : (200 - img_height) + 'px'
									});
									preview.css({
										paddingTop : img_height + 'px',
										paddingLeft : img_width + 'px'
									});
								}
								//裁剪插件
								$('#cropbox').Jcrop({
									bgColor : '#333', //选区背景色
									bgFade : true, //选区背景渐显
									fadeTime : 1000, //背景渐显时间
									allowSelect : false, //是否可以选区，
									allowResize : true, //是否可以调整选区大小
									aspectRatio : 1, //约束比例
									minSize : [ 200, 200 ], //可选最小大小
									boxWidth : 200, //画布宽度
									boxHeight : 200, //画布高度
									onChange : showPreview, //改变时重置预览图
									onSelect : showPreview, //选择时重置预览图
									setSelect : [ 0, 0, 500, 500 ], //初始化时位置
									onSelect : function(c) { //选择时动态赋值，该值是最终传给程序的参数！
										$('#x').val(c.x);//需裁剪的左上角X轴坐标
										$('#y').val(c.y);//需裁剪的左上角Y轴坐标
										$('#w').val(c.w);//需裁剪的宽度
										$('#h').val(c.h);//需裁剪的高度
									}
								});
								//提交裁剪好的图片
								$('.save-pic').click(function() {
										
									if ($('#preview-hidden').html() == '') {
										$.ThinkBox.error('请先上传图片！');
									} else {
										//由于GD库裁剪gif图片很慢，所以长时间显示弹出框
										$.ThinkBox.success('图片处理中，请稍候……', {
											'delayClose' : 30000
										});
										//alert("uuuuu");
										$('#pic').submit();
									}
								});
								//重新上传,清空裁剪参数
								var i = 0;
								$('.reupload-img').click(
										function() {
											$('#preview-hidden').find('*')
													.remove();
											$('#preview-hidden').hide()
													.addClass('hidden').css({
														'padding-top' : 0,
														'padding-left' : 0
													});
										});
							}
						});
		//预览图
		function showPreview(coords) {
			var img_width = $('#cropbox').width();
			var img_height = $('#cropbox').height();
			//根据包裹的容器宽高,设置被除数
			var rx = 100 / coords.w;
			var ry = 100 / coords.h;
			$('#crop-preview-100').css({
				width : Math.round(rx * img_width) + 'px',
				height : Math.round(ry * img_height) + 'px',
				marginLeft : '-' + Math.round(rx * coords.x) + 'px',
				marginTop : '-' + Math.round(ry * coords.y) + 'px'
			});
			var rx = 60 / coords.w;
			var ry = 60 / coords.h;
			$('#crop-preview-60').css({
				width : Math.round(rx * img_width) + 'px',
				height : Math.round(ry * img_height) + 'px',
				marginLeft : '-' + Math.round(rx * coords.x) + 'px',
				marginTop : '-' + Math.round(ry * coords.y) + 'px'
			});
			var rx = 30 / coords.w;
			var ry = 30 / coords.h;
			$('#crop-preview-30').css({
				width : Math.round(rx * img_width) + 'px',
				height : Math.round(ry * img_height) + 'px',
				marginLeft : '-' + Math.round(rx * coords.x) + 'px',
				marginTop : '-' + Math.round(ry * coords.y) + 'px'
			});
		}
	});
</script>


<div class="main">
	<!-- 修改头像 -->
	<form action="<%=path %>/set/headimg/cropavatar" method="post" id="pic"
		class="update-pic cf">
		<div class="upload-area">
			<input type="file" id="user-pic">
			<div class="file-tips">支持JPG,PNG,GIF，图片小于1MB，尺寸不小于100*100,真实高清头像更受欢迎！</div>
			<div class="preview hidden" id="preview-hidden"></div>
		</div>
		<div class="preview-area">
			<input type="hidden" id="x" name="x" /> <input type="hidden" id="y"
				name="y" /> <input type="hidden" id="w" name="w" /> <input
				type="hidden" id="h" name="h" /> <input type="hidden" id='img_src'
				name='src' /> <input type="hidden" id='picName' name='picName' />
			<div class="tcrop">头像预览</div>
			<div class="crop crop100">
				<img id="crop-preview-100" src="" alt="">
			</div>
			<div class="crop crop60">
				<img id="crop-preview-60" src="" alt="">
			</div>
			<div class="crop crop30">
				<img id="crop-preview-30" src="" alt="">
			</div>
			<div style="clear: both"></div>
			<a class="uppic-btn save-pic" href="javascript:;">保存</a> <a
				class="ppic-btn reupload-img"
				href="javascript:$('#user-pic').uploadify('cancel','*');">重新上传</a>
		</div>
	</form>

	<!-- /修改头像 -->
</div>
<%@include file="../common/Public/footer.jsp"%>
