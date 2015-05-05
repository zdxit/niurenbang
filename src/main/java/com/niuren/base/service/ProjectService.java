package com.niuren.base.service;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.niuren.base.dao.impl.ProjectDaoImpl;
import com.niuren.base.dto.FileData;
import com.niuren.base.entity.Project;
import com.niuren.base.base.BaseService;

public interface ProjectService extends BaseService<ProjectDaoImpl, Project> {

	FileData storeHeadImg(MultipartHttpServletRequest multipartRequest,
			MultipartFile multipartFile);
}