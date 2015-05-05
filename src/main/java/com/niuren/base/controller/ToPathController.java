package com.niuren.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.niuren.base.dto.Message;
import com.niuren.base.entity.Member;
import com.niuren.base.entity.User;
import com.niuren.base.service.MemberService;

@Controller
@RequestMapping("/to")
public class ToPathController {
	
	@Autowired
	private MemberService memberService;
	

	@RequestMapping("/register")
	public String toRegister() {
		return "/web/Register/index";
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public Message login(String email, String password,
			HttpServletRequest request) {
		Member member = memberService.getMemberByEmail(email);
		User user = memberService.convertMemberToUser(member);
		Message message = memberService.doLogin(member, password);
		if (message.getState()) {
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("islogin", true);
		}

		return message;
	}
	
}
