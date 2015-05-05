package com.niuren.base.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.niuren.base.base.impl.BaseServiceImpl;
import com.niuren.base.dao.MemberRoleDao;
import com.niuren.base.dao.ProjectIndustryTypeDao;
import com.niuren.base.dao.RegionDao;
import com.niuren.base.dao.impl.MemberDaoImpl;
import com.niuren.base.dto.FileData;
import com.niuren.base.dto.Message;
import com.niuren.base.entity.Member;
import com.niuren.base.entity.MemberRole;
import com.niuren.base.entity.ProjectIndustryType;
import com.niuren.base.entity.Region;
import com.niuren.base.entity.User;
import com.niuren.base.service.MemberRoleService;
import com.niuren.base.service.MemberService;
import com.niuren.base.service.RegionService;
import com.niuren.base.util.CoreUtil;
import com.niuren.base.util.ImageUtil;

@Repository("memberService")
public class MemberServiceImpl extends BaseServiceImpl<MemberDaoImpl, Member>
		implements MemberService {

	@Autowired
	Md5PasswordEncoder md5PasswordEncoder;
	@Autowired
	private MemberRoleService memberRoleService;
	@Autowired
	private RegionService regionService;
	@Autowired
	private MemberRoleDao memberRoleDao;
	@Autowired
	ProjectIndustryTypeDao projectIndustryTypeDao;
	@Autowired
	ImageUtil imageUtil;

	@Override
	public String checkLogin(String email, String password) {
		String result = "";
		List<Member> findByProperty = findByProperty("email", email);
		if (findByProperty.size() == 0) {
			result = "{'state':false, 'message':'用户名不存在，请确认拼写正确'}";
		} else {
			Member member = findByProperty.get(0);
			String enPassword = md5PasswordEncoder.encodePassword(password,
					null);
			if (enPassword.equals(member.getPwd())) {
				result = "{'state':true, 'message':'登录成功'}";
			} else {
				result = "{'state':false, 'message':'用户名或密码错误，请重新输入'}";
			}
		}

		return result;

	}

	// public static void main(String[] args) {
	// Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();
	// String encodePassword = md5PasswordEncoder.encodePassword("123456",
	// null);
	// // e10adc3949ba59abbe56e057f20f883e
	// System.out.println(encodePassword);
	// }

	@Override
	public Message doLogin(Member member, String password) {
		Message message;

		if (member == null) {
			message = new Message(false, "用户名不存在，请确认拼写正确");
			// result = "{'state':false, 'message':'用户名不存在，请确认拼写正确'}";
		} else {
			String enPassword = md5PasswordEncoder.encodePassword(password,
					null);
			if (enPassword.equals(member.getPwd())) {
				message = new Message(true, "登录成功");
				// result = "{'state':true, 'message':'登录成功'}";
			} else {
				message = new Message(false, "用户名或密码错误，请重新输入");
				// result = "{'state':false, 'message':'用户名或密码错误，请重新输入'}";
			}
		}
		return message;
	}

	@Override
	public Member getMemberByEmail(String email) {
		List<Member> findByProperty = findByProperty("email", email);
		if (findByProperty.size() > 0) {
			return findByProperty.get(0);
		}
		return null;
	}

	public Map<String, Object> getUserInfo(Member member) {
		MemberRole memberRole = memberRoleService.getById(member
				.getMemberRoleId());
		Region privice = regionService.getById(member.getProvince());
		Region city = regionService.getById(member.getCity());

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("user", member);
		map.put("privice", privice.getName());
		map.put("city", city.getName());
		map.put("memberRole", memberRole.getName());
		return map;
	}

	@Override
	public Message resetPwd(User user, String oldpassword, String repassword) {
		Message message;
		List<Member> findByProperty = findByProperty("email", user.getEmail());
		if (findByProperty.size() == 0) {
			message = new Message(false, "用户名不存在，请确认拼写正确");
		} else {
			Member member = findByProperty.get(0);
			String enPassword = md5PasswordEncoder.encodePassword(oldpassword,
					null);
			System.out.println(enPassword);
			if (enPassword.equals(user.getPwd())) {
				// 修改密码
				String newEncodePassword = md5PasswordEncoder.encodePassword(repassword,
						null);
				member.setPwd(newEncodePassword);
				this.update(member);
				message = new Message(true, "修改成功");
				// result = "{'state':true, 'message':'登录成功'}";
			} else {
				message = new Message(false, "密码错误，请重新输入");
				// result = "{'state':false, 'message':'用户名或密码错误，请重新输入'}";
			}

		}
		return message;
	}

	@Override
	public User convertMemberToUser(Member member) {
		MemberRole memberRole = memberRoleDao.getById(member.getMemberRoleId());
		Region province = regionService.getById(member.getProvince());
		Region city = regionService.getById(member.getCity());
		ProjectIndustryType industryType = null;
		if (!member.getHopeIndustryType().equals("希望加入的团队")
				&& member.getHopeIndustryType() != null) {
			industryType = projectIndustryTypeDao.getById(Long.parseLong(member
					.getHopeIndustryType()));
		}

		User user = new User();
		user.convertMember(member);
		user.setCity(city.getName());
		user.setProvince(province.getName());
		user.setMemberRole(memberRole.getName());
		user.setHopeIndustryType(industryType.getName());

		return user;
	}

	// 接受图片，返回图片地址
	private String storeIOc(HttpServletRequest request, MultipartFile file) {
		String realPath = request.getSession().getServletContext()
				.getRealPath("avatar/2015/test");
		if (file == null) {
			return "avatar" + File.separator + "test" + File.separator
					+ "headpic.jpg";
		}
		String fileName = "";
		String logImageName = "";
		if (file.isEmpty()) {
			System.out.println("文件未上传");
		} else {
			String _fileName = file.getOriginalFilename();
			String suffix = _fileName.substring(_fileName.lastIndexOf("."));
			// /**使用UUID生成文件名称**/
			logImageName = UUID.randomUUID().toString() + suffix;

			fileName = realPath + File.separator + logImageName;
			File restore = new File(fileName);
			try {
				file.transferTo(restore);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		// 返回默认的图片地址
		return "avatar/test/" + logImageName;
	}

	@Override
	public FileData storeHeadImg(MultipartHttpServletRequest multipartRequest,
			MultipartFile multipartFile) {
		
		FileData data=null;
		String fileName = "";
		String headImg = CoreUtil.getFilePathByDate();
		//获得文件夹的真实路径
		String realPath = multipartRequest.getSession().getServletContext()
				.getRealPath("avatar/" + headImg);
		
	
		if (multipartFile == null) {
			data=new FileData("default/icon.jpg", 0, "未上传成功","");
		} else {
			//获得上传文件名
			fileName = multipartFile.getOriginalFilename();
			//获取后缀名
			String suffix = fileName.substring(fileName.lastIndexOf("."));
			//得到要存储的文件名
			Date date=new Date();
			String logImageName = date.getTime() + suffix;
			
			//设置member的头像路径以存在于数据库中
			String avatarPath = headImg + File.separator + logImageName;

			//设置文件存储路径
			fileName = realPath + File.separator + logImageName;
			File restore = new File(fileName);
			try {
				//存储文件
				CoreUtil.copy(multipartFile, restore);
				//创建返回对象
				data=new FileData(avatarPath, 1, "success",logImageName);
				
				//删除以前上传图片
				addOrRemoveSessionAttribute(multipartRequest, avatarPath, "headImg","avatar/");
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("图像文件存储失败");
				data=new FileData("", 0, "写入文件失败","");
			}
		}
		
		//更新数据库
//		update(member);
		
		return data;
	}

	private void addOrRemoveSessionAttribute(
			MultipartHttpServletRequest multipartRequest, String avatarPath,
			String item,String bfPath ) {
		String sessionHeadImg = (String) multipartRequest.getSession().getAttribute(item);
		if(sessionHeadImg!=null){
			String oldPath = multipartRequest.getSession().getServletContext()
					.getRealPath(bfPath + sessionHeadImg);
			imageUtil.removePic(oldPath);
		}
		multipartRequest.getSession().setAttribute(item, avatarPath);
	}
	
	

	public static void main(String[] args) {
//		Md5PasswordEncoder md5PasswordEncoder=new Md5PasswordEncoder();
//		String enPassword = md5PasswordEncoder.encodePassword("123456",
//				null);
//		System.out.println(enPassword);
//		1426520433
		
	}

	@Override
	public boolean updateHeadImg(int id,String src) {
		
		Member member=getById(id);
		member.setAvatar(src);
		
		this.update(member);
		return false;
	}
}