package com.niuren.base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController  {
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		ModelAndView modelAndView=new ModelAndView("web/Index/index", null);
		return modelAndView;
	}

	
	@RequestMapping("/index/main")
	public ModelAndView main(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.getSession().setAttribute("isVisited", true);
		
		ModelAndView modelAndView=new ModelAndView("web/Index/main", null);
		return modelAndView;
	}
	
}
