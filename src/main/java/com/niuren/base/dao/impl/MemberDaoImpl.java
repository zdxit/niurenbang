package com.niuren.base.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niuren.base.base.impl.BaseDaoImpl;
import com.niuren.base.dao.MemberDao;
import com.niuren.base.dao.MemberRoleDao;
import com.niuren.base.dao.ProjectIndustryTypeDao;
import com.niuren.base.dao.RegionDao;
import com.niuren.base.entity.Member;
import com.niuren.base.entity.MemberRole;
import com.niuren.base.entity.ProjectIndustryType;
import com.niuren.base.entity.Region;
import com.niuren.base.entity.User;

@Repository("memberDao")
public class MemberDaoImpl extends BaseDaoImpl<Member> implements MemberDao {

	

	@Override
	public User getUserById(Integer id) {
		// getListByHQL("select new User( id,  email,  pwd,  mtype,regIp,  "
		// + "regDate,  trueName,  sex,age,  schoolName,  province, "
		// + " city, mobile,  telphone,  icqNum,  memberRole, preAchieve,  "
		// + "hopeIndustryType,  avatar,recommend,  loginIp,  loginTime) "
		// + "from Member m, Region r ,memberRole mr ",null);
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	
}