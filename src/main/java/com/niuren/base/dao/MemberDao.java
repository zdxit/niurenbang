package com.niuren.base.dao;

import com.niuren.base.base.BaseDao;
import com.niuren.base.entity.Member;
import com.niuren.base.entity.User;

public interface MemberDao extends BaseDao<Member> {

	User getUserById(Integer id);

	User getUserByEmail(String email);

	
}