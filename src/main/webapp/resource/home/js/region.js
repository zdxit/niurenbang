function loadRegion(type_id,url){
	if(type_id==1){//点击的是国家
		/*
			1.改变province下拉框的内容
			2.清空city下拉框的内容
			3.清空town下拉框的内容
		 */
		var pid=$("#country").val();
		$("#province option").remove();
		$("#city option").remove();
		$("#town option").remove();
		$("<option value=0>市/县</option>").appendTo($("#city"));//清空town下拉框的内容
		$("<option value=0>镇/区</option>").appendTo($("#town"));//清空town下拉框的内容
		if(pid==0){
			$("<option value=0>省份/直辖市</option>").appendTo($("#province"));
			return ;
		}
		$.post(url,{pid:pid,type:type_id},function(data){
			$("#province").append(data);
		});
	}else if(type_id==2){//点击是省
			/*
			1.改变city下拉框的内容
			2.清空town下拉框的内容
		*/
		var pid=$("#province").val();
		$("#city option").remove();
		$("#town option").remove();
		
		$("<option value=0>镇/区</option>").appendTo($("#town"));//清空town下拉框的内容
		if(pid==0){
			$("<option value=0>市/县</option>").appendTo($("#city"));
			return ;
		}
		$.post(url,{pid:pid,type:type_id},function(data){
			$("#city").append(data);
		});
	}else if(type_id==3){//点击的是市
		var pid=$("#city").val();
		$("#town option").each(function(){
			$(this).remove();
		});
		if(pid==0){
			$("<option value=0>镇/区</option>").appendTo($("#town"));
			return;
		}
		$.post(url,{pid:pid,type:type_id},function(data){
	
			$("#town").append(data);
		});
}
}