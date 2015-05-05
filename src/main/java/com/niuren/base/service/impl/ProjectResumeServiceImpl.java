package com.niuren.base.service.impl;

import org.springframework.stereotype.Repository;
import com.niuren.base.base.impl.BaseServiceImpl;
import com.niuren.base.dao.impl.ProjectResumeDaoImpl;
import com.niuren.base.entity.ProjectResume;
import com.niuren.base.service.ProjectResumeService;

@Repository("projectResumeService")
public class ProjectResumeServiceImpl extends
		BaseServiceImpl<ProjectResumeDaoImpl, ProjectResume> implements
		ProjectResumeService {
}