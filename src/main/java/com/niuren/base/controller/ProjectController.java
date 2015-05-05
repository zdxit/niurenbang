package com.niuren.base.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.niuren.base.dto.FileData;
import com.niuren.base.entity.Project;
import com.niuren.base.entity.ProjectIndustryType;
import com.niuren.base.entity.Region;
import com.niuren.base.entity.User;
import com.niuren.base.service.ProjectIndustryTypeService;
import com.niuren.base.service.ProjectService;
import com.niuren.base.service.RegionService;

@Controller
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private RegionService regionService;
	@Autowired
	private ProjectIndustryTypeService projectIndustryTypeService;
	@Autowired
	private ProjectService projectService;

	@RequestMapping("/publish")
	public ModelAndView publish() {

		List<Region> provinceList = regionService.findByProperty("type", 1);
		List<ProjectIndustryType> industryTypes = projectIndustryTypeService
				.findAll();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("provinceList", provinceList);
		map.put("industryTypes", industryTypes);

		ModelAndView modelAndView = new ModelAndView(
				"web/Project/publish_project", map);

		return modelAndView;
	}

	@RequestMapping("/save")
	public String save(HttpServletRequest request,Project project) {
		
		//获取session中的信息
		User user = (User) request.getSession().getAttribute("user");
		String logoPath=(String) request.getSession().getAttribute("projectImgPath");
		
		project.setMid(user.getId());
		project.setLogoPic(logoPath);
		
		Date date=new Date();
		project.setInsertTime(date.getTime());
		
		
		System.out.println(project);
		projectService.insert(project);
		return "web/Project/projectPublish_success";
	}

	@ResponseBody
	@RequestMapping("/upload/icon")
	public FileData uploadFile(HttpServletRequest request) {
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		MultipartFile multipartFile = null;
		for (Map.Entry<String, MultipartFile> set : fileMap.entrySet()) {
			multipartFile = set.getValue();
		}

		FileData data = projectService.storeHeadImg(multipartRequest,
				multipartFile);

		return data;
	}

	@RequestMapping("/browse")
	public ModelAndView browse() {

		ModelAndView modelAndView = new ModelAndView("web/Project/index", null);
		return modelAndView;
	}

}
