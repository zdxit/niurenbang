package com.niuren.base.dao.impl;

import org.springframework.stereotype.Repository;
import com.niuren.base.base.impl.BaseDaoImpl;
import com.niuren.base.dao.MemberRoleDao;
import com.niuren.base.entity.MemberRole;

@Repository("memberRoleDao")
public class MemberRoleDaoImpl extends BaseDaoImpl<MemberRole> implements
		MemberRoleDao {
}