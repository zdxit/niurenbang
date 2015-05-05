package com.niuren.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recruit")
public class RecruitController {

	
	@RequestMapping("/index")
	public String toIndex(HttpServletRequest request){
		
		return "web/Recruit/index";
	}
	
	
}
