$(function(){
	$("input[name='uid']").blur(function(){
		var uid=$(this).val();
		if(uid==""){
			msg('uid','必须填写账号','err');
		}else{		
			msg('uid','','success');
		}
	});
	
	$("input[name='pwd']").blur(function(){
		var pwd=$(this).val();
		if(pwd==""){
			msg('pwd','必须填写密码','err');
		}else{
			msg('pwd','','success');
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
function logincheck(){
	var uid=$("input[name='uid']").val();
	var pwd=$("input[name='pwd']").val();
	var verify=$("input[name='verify']").val();
	if(uid==''){
		msg('uid','必须填写账号','err');
		return false;
	}else{
		msg('uid','','success');
	}
	if(pwd==''){
		msg('pwd','必须填写密码','err');
		return false;
	}else{
		msg('pwd','','success');
	}
	if(verify==''||verify.length!=4){
		msg('verify','必须填写验证码且验证码必须是4位','err');
		return false;
	}
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