package com.niuren.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niuren.base.entity.Region;
import com.niuren.base.service.RegionService;

@Controller
@RequestMapping("/resource")
public class ResourceController {

	@Autowired
	private RegionService regionService;

	@ResponseBody
	@RequestMapping("/city")
	public List<Region> getCitys(short pid) {
		@SuppressWarnings("unchecked")
		List<Region> list = (List<Region>) regionService.findByProperty("pid", pid);
		System.out.println(list);
		
		return list;
	}

}
