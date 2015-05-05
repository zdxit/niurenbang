package com.niuren.base.service.impl;

import org.springframework.stereotype.Repository;
import com.niuren.base.base.impl.BaseServiceImpl;
import com.niuren.base.dao.impl.ProjectIndustryTypeDaoImpl;
import com.niuren.base.entity.ProjectIndustryType;
import com.niuren.base.service.ProjectIndustryTypeService;

@Repository("projectIndustryTypeService")
public class ProjectIndustryTypeServiceImpl extends
		BaseServiceImpl<ProjectIndustryTypeDaoImpl, ProjectIndustryType>
		implements ProjectIndustryTypeService {
}