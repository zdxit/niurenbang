package com.niuren.base.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.niuren.base.dao.impl.MemberDaoImpl;
import com.niuren.base.dto.FileData;
import com.niuren.base.dto.Message;
import com.niuren.base.entity.Member;
import com.niuren.base.entity.User;
import com.niuren.base.base.BaseService;

public interface MemberService extends BaseService<MemberDaoImpl, Member> {

	/**
	 * 登陆验证
	 * 
	 * @param email
	 * @param password
	 * @return
	 */
	String checkLogin(String email, String password);

	Message doLogin(Member member, String password);

	Member getMemberByEmail(String email);

	Map<String, Object> getUserInfo(Member member);

	Message resetPwd(User user,String oldpassword, String repassword);
	
	User convertMemberToUser(Member member);

	FileData storeHeadImg(MultipartHttpServletRequest multipartRequest,
			MultipartFile multipartFile);
	
	
	boolean updateHeadImg(int id,String src);
}