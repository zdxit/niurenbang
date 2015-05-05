package com.niuren.base.service.impl;

import java.io.File;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.niuren.base.base.impl.BaseServiceImpl;
import com.niuren.base.dao.impl.ProjectDaoImpl;
import com.niuren.base.dto.FileData;
import com.niuren.base.entity.Project;
import com.niuren.base.service.ProjectService;
import com.niuren.base.util.CoreUtil;
import com.niuren.base.util.ImageUtil;

@Repository("projectService")
public class ProjectServiceImpl extends
		BaseServiceImpl<ProjectDaoImpl, Project> implements ProjectService {

	@Autowired
	private ImageUtil imageUtil;

	@Override
	public FileData storeHeadImg(MultipartHttpServletRequest multipartRequest,
			MultipartFile multipartFile) {
		
		FileData data=null;
		String fileName = "";
		String headImg = CoreUtil.getPathByDate();

		String realPath = multipartRequest.getSession().getServletContext()
				.getRealPath("Uploads/Project/" + headImg);
	
		if (multipartFile == null) {
			data=new FileData("default/icon.jpg", 0, "未上传成功","");
		} else {
			fileName = multipartFile.getOriginalFilename();
			String suffix = fileName.substring(fileName.lastIndexOf("."));
			Date date=new Date();
			String logImageName = date.getTime() + suffix;
			
			//设置member的头像路径以存在于数据库中
			String avatarPath = headImg + File.separator + logImageName;
//			member.setAvatar(avatarPath);

			//设置文件存储路径
			fileName = realPath + File.separator + logImageName;
			File restore = new File(fileName);
			try {
				CoreUtil.copy(multipartFile, restore);
				data=new FileData("Uploads/Project/"+avatarPath, 1, "success",logImageName);
				//将路径放入到session中，以便提交项目
				addOrRemoveSessionAttribute(multipartRequest, avatarPath, "projectImgPath", "/Uploads/Project/");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("图像文件存储失败");
				data=new FileData("", 0, "写入文件失败","");
			}
		}
		
		
		return data;
	}
	
	private void addOrRemoveSessionAttribute(
			MultipartHttpServletRequest multipartRequest, String avatarPath,
			String item,String bfPath) {
		String sessionHeadImg = (String) multipartRequest.getSession().getAttribute(item);
		if(sessionHeadImg!=null){
			String oldPath = multipartRequest.getSession().getServletContext()
					.getRealPath(bfPath + sessionHeadImg);
			imageUtil.removePic(oldPath);
		}
		multipartRequest.getSession().setAttribute(item, bfPath+avatarPath);
	}
}