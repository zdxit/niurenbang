package com.niuren.base.service.impl;

import org.springframework.stereotype.Repository;
import com.niuren.base.base.impl.BaseServiceImpl;
import com.niuren.base.dao.impl.AdminDaoImpl;
import com.niuren.base.entity.Admin;
import com.niuren.base.service.AdminService;

@Repository("adminService")
public class AdminServiceImpl extends BaseServiceImpl<AdminDaoImpl, Admin>
		implements AdminService {
}