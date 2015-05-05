$(function(){
	$("input[name='uid']").blur(function(){
		var uid=$(this).val();
		if(uid==""){
			msg('uid','必须填写账号','err');
		}else{		
			$.post("checkuser",{uid:uid},function(res){
				if(res==1){
					msg('uid','账号已经被注册','err');
				}else{
					msg('uid','恭喜,可以使用','success');
				}
			});
		}
	});
	
	$("input[name='pwd']").blur(function(){
		var pwd=$(this).val();
		if(pwd==""){
			msg('pwd','必须填写密码','err');
		}else{
			if(pwd.length<6){
				msg('pwd','密码长度必须≥6','err');
			}else{
				msg('pwd','恭喜,可以使用','success');
			}
		}
	});
	
	$("input[name='pwd2']").blur(function(){
		var pwd=$("input[name='pwd']").val();
		var pwd2=$(this).val();
		if(pwd2==""){
			msg('pwd2','必须填写确认密码','err');
		}else{
			if(pwd!=pwd2){
				msg('pwd2','确认密码填写错误','err');
			}else{
				msg('pwd2','恭喜,可以使用','success');
			}
		}
	});
	
	$("input[name='email']").blur(function(){
		var email=$(this).val();
		if(email==""){
			msg('email','必须邮箱','err');
		}else{
			if(!/^[\w]\w*@\w+\.[a-zA-Z\.]+[a-zA-Z]$/.test(email)){
				msg('email','邮箱格式错误','err');
			}else{
				$.post("checkemail",{email:email},function(res){
					if(res==1){
						msg('email','邮箱已经被使用','err');
					}else{
						msg('email','恭喜,可以使用','success');
					}
				});				
			}
		}
	});
	

	$("input[name='nickname']").blur(function(){
		var nickname=$(this).val();
		if(nickname==""){
			msg('nickname','必须填写企业或个人名称','err');
		}else{
			msg('nickname','恭喜,可以使用','success');
		}
	});

});
function msg(select,msg,pic){
	var picurl='';
	if(pic=='err'){
		picurl='/Public/home/images/err.png' ;
		//$("input[name="+select+"]").focus();
	}else
		picurl='/Public/home/images/success.png' ;
	$("#reg_"+select).html("<span class='reg_msg'><img src="+picurl+" align='absmiddle' />  "+msg+"</span>");
}
function regcheck(){
	var uid=$("input[name='uid']").val();
	var pwd=$("input[name='pwd']").val();
	var pwd2=$("input[name='pwd2']").val();
	var email=$("input[name='email']").val();
	var nickname=$("input[name='nickname']").val();
	if(uid==''){
		msg('uid','必须填写账号','err');
		return false;
	}else{
		$.post("checkuser",{uid:uid},function(res){
			if(res==1){
				msg('uid','账号已经被注册','err');
				return false;
			}else{
				msg('uid','恭喜,可以使用','success');
			}
		});
	}
	if(pwd==""){
		msg('pwd','必须填写密码','err');
		return false;
	}else{
		if(pwd.length<6){
			msg('pwd','密码长度必须≥6','err');
			return false;
		}else{
			msg('pwd','恭喜,可以使用','success');
		}
	}
	if(pwd2==""){
		msg('pwd2','必须填写确认密码','err');
		return false;
	}else{
		if(pwd!=pwd2){
			msg('pwd2','确认密码填写错误','err');
			return false;
		}else{
			msg('pwd2','恭喜,可以使用','success');
		}
	}
	if(email==""){
		msg('email','必须邮箱','err');
		return false;
	}else{
		if(!/^[\w]\w*@\w+\.[a-zA-Z\.]+[a-zA-Z]$/.test(email)){
			msg('email','邮箱格式错误','err');
			return false;
		}else{
			$.post("checkemail",{email:email},function(res){
				if(res==1){
					msg('email','邮箱已经被使用','err');
					return false;
				}else{
					msg('email','恭喜,可以使用','success');
				}
			});				
		}
	}
	$("input[name='nickname']").blur(function(){
		var nickname=$(this).val();
		if(nickname==""){
			msg('nickname','必须填写企业或个人名称','err');
			return false;
		}else{
			msg('nickname','恭喜,可以使用','success');
		}
	});
	
}
