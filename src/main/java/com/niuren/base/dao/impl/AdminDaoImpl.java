package com.niuren.base.dao.impl;

import java.util.Date;

import org.hibernate.annotations.common.reflection.ClassLoadingException;
import org.springframework.stereotype.Repository;

import com.niuren.base.base.impl.BaseDaoImpl;
import com.niuren.base.dao.AdminDao;
import com.niuren.base.entity.Admin;

@Repository("adminDao")
public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao {

	public static void main(String[] args) {
		AdminDao adminDao = new AdminDaoImpl();
		Admin t = new Admin("zdx", "ZDX6301@163.com", "123", 1, "mark", null,
				1384223606);
		adminDao.insert(t);
	}

}