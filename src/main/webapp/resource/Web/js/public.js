var loadCity = function (pid, $target, selectId) {
	if (pid > 1) {
		var $option = $("<option value='0'>请选择城市</option>");
	} else {
		var $option = $("<option value='0'>请选择省份</option>");
	}
	$target.html($option);
	if (pid <= 0) {
		return false;
	}
	
	$.ajax({
		type: "post",
		data: {'pid': pid},
		url: "/index.php/Public/city",
		dataType: "json",
		success: function (json) {
			for (var i = 0; i < json.length; i++) {
				var $option = $("<option value='" + json[i].id + "'>" + json[i].name + "</option>");
				if (selectId === json[i].id) {
					$option.attr('selected', 'selected');
				}
				$target.append($option);
			}
		}
	});
};
$(function () {


});