package com.niuren.base.service.impl;import org.springframework.stereotype.Repository;import com.niuren.base.base.impl.BaseServiceImpl;import com.niuren.base.dao.impl.MemberRoleDaoImpl;import com.niuren.base.entity.MemberRole;import com.niuren.base.service.MemberRoleService;@Repository("memberRoleService")public class MemberRoleServiceImpl extends BaseServiceImpl<MemberRoleDaoImpl, MemberRole> implements MemberRoleService {}