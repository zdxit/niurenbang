package com.niuren.base.dao.impl;import org.springframework.stereotype.Repository;import com.niuren.base.base.impl.BaseDaoImpl;import com.niuren.base.dao.ProjectResumeDao;import com.niuren.base.entity.ProjectResume;@Repository("projectResumeDao")public class ProjectResumeDaoImpl   extends BaseDaoImpl<ProjectResume> implements ProjectResumeDao {}