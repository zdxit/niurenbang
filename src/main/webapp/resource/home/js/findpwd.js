$(function(){
	$("input[name='uid']").blur(function(){
		var uid=$(this).val();
		if(uid==""){
			msg('uid','必须填写账号','err');
		}else{		
			msg('uid','','success');
		}
	});
	
	$("input[name='email']").blur(function(){
		var email=$(this).val();
		if(email==""){
			msg('email','必须填写邮箱','err');
		}else{
			if(!/^[\w]\w*@\w+\.[a-zA-Z\.]+[a-zA-Z]$/.test(email)){
				msg('email','邮箱格式错误','err');
			}else{
				msg('email','','success');
			}
		}
	});
	
	$("input[name='verify']").blur(function(){
		var verify=$(this).val();
		if(verify==''||verify.length!=4){
			msg('verify','必须填写验证码且验证码必须是4位','err');
			return false;
		}else{
			msg('verify','','success');
		}
	});
});
function findpwd(){
	var uid=$("input[name='uid']").val();
	var email=$("input[name='email']").val();
	var verify=$("input[name='verify']").val();
	if(uid==''){
		msg('uid','必须填写账号','err');
		return false;
	}else{
		msg('uid','','success');
	}
	if(email==''){
		msg('email','必须填写邮箱','err');
		return false;
	}else{
		if(!/^[\w]\w*@\w+\.[a-zA-Z\.]+[a-zA-Z]$/.test(email)){
			msg('email','邮箱格式错误','err');
			return false;
		}else{
			msg('email','','success');
		}
	}
	if(verify==''||verify.length!=4){
		msg('verify','必须填写验证码且验证码必须是4位','err');
		return false;
	}
	$.post('findpassword',{uid:uid,email:email,verify:verify},function(res){
		$("#tishi").html(res.info).css('display','block').fadeOut(5000);
	},"json");
}

function msg(select,msg,pic){
	var picurl='';
	if(pic=='err'){
		picurl='/Public/home/images/err.png' ;
		$("input[name="+select+"]").focus();
	}else
		picurl='/Public/home/images/success.png' ;
	$("#reg_"+select).html("<span class='reg_msg'><img src="+picurl+" align='absmiddle' />  "+msg+"</span>");
}