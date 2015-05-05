package com.niuren.base.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.niuren.base.dto.FileData;
import com.niuren.base.entity.User;
import com.niuren.base.service.MemberService;
import com.niuren.base.util.ImageUtil;

@Controller
@RequestMapping("/set")
public class SetController {

	@Autowired
	private MemberService memberService;
	@Autowired
	ImageUtil imageUtil;

	@RequestMapping("/headimg")
	public String toAvatar() {
		return "/web/UCenter/head_img_set";
	}

	@RequestMapping(value = "/headimg/cropavatar")
	public String cropAvatar(double x, double y, double w, double h, String src,
			HttpServletRequest request) {
		
		
		String subPath=src.substring("/niurenbang/avatar/".length(),src.length());
		String contextPath = request.getServletContext().getRealPath("/");
		String realPath = contextPath+"avatar/"+subPath;
		boolean cutPic = imageUtil.cutPic(x, y, h, w, realPath, realPath);

		if (cutPic) {
			User user = (User) request.getSession().getAttribute("user");
			memberService.updateHeadImg(user.getId(), subPath);
			String oldPath = contextPath+"avatar/"+user.getAvatar();
			System.out.println(oldPath);
			imageUtil.removePic(oldPath);
			user.setAvatar(subPath);
			request.getSession().setAttribute("user",user);
			
			return "/web/UCenter/headcut_success";
		} else
			return "/web/UCenter/head_img_set";
	}

	@ResponseBody
	@RequestMapping(value = "/headimg/uploadimg")
	public FileData uploadFile(HttpServletRequest request) {
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		MultipartFile multipartFile = null;
		for (Map.Entry<String, MultipartFile> set : fileMap.entrySet()) {
			multipartFile = set.getValue();
		}

		FileData data = memberService.storeHeadImg(multipartRequest,
				multipartFile);

		return data;
	}

}
