package com.niuren.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.niuren.base.dto.Message;
import com.niuren.base.entity.Member;
import com.niuren.base.entity.User;
import com.niuren.base.service.MemberService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private MemberService memberService;

	private Logger log;
	
	public UserController() {
		System.out.println("init log system");
		log = LoggerFactory.getLogger(this.getClass());
	}
	
	
	
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		
		request.getSession().removeAttribute("user");
		request.getSession().removeAttribute("islogin");
		
		return "/web/Index/index";
		
	}
	
	
	

	@RequestMapping("/index")
	public ModelAndView toCenter(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if (user == null) {
			return new ModelAndView("web/Register/index");
		}
		ModelAndView modelAndView = new ModelAndView("web/UCenter/index",
				"user", user);
		return modelAndView;
	}



	@ResponseBody
	@RequestMapping("/chgpwd")
	public Message resetPwd(String oldpassword, String repassword,
			HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		Message message = memberService.resetPwd(user, oldpassword, repassword);

		return message;
	}



}