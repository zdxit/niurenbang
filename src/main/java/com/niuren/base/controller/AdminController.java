package com.niuren.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niuren.base.entity.Admin;
import com.niuren.base.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/insert")
	public void insert(){
		adminService.insert(new Admin("zdx", "ZDX6301@163.com", "123", 1, "mark", null,
				1384223606));
	}

}