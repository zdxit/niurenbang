package com.niuren.base.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Repository;

/**
 * 主要处理图片的问题
 * 
 * @author zdx
 * 
 */
@Repository("imageUtil")
public class ImageUtil {

	/**
	 * 对图片的进行切割并将其存放到制定的路径下
	 * 
	 * @param x
	 * @param y
	 * @param height
	 * @param width
	 * @param filePath
	 * @param destPath
	 * @return
	 */
	public boolean cutPic(double x, double y, double height, double width, String filePath,
			String destPath) {
		boolean isSuccess = false;
		File file = new File(filePath);
		// 不存在
		if (!file.exists()) {
			isSuccess = false;
			return isSuccess;
		}

		int lastIndexOf = filePath.lastIndexOf(".");
		String extendName = filePath.substring(lastIndexOf + 1);

		try {
			BufferedImage bufferedImage = ImageIO.read(file);
			
			//对图片进行限制
			int srcWidth = bufferedImage.getWidth();
			int srcHeight = bufferedImage.getHeight();
			if (srcHeight < height) {
				height = srcHeight;
			}
			if (srcWidth < width) {
				width = srcWidth;
			}
			if (x < 0) {
				x = 0;
			}
			if (y < 0) {
				y = 0;
			}
			BufferedImage image = bufferedImage
					.getSubimage((int)x, (int)y, (int)width, (int)height);
			// 存储图片
			File outputFile = new File(destPath);
			ImageIO.write(image, extendName, outputFile);
			isSuccess = true;

		} catch (IOException e) {
			e.printStackTrace();
			isSuccess = false;
		}
		return isSuccess;
	}

	public static void main(String[] args) {
		ImageUtil imageUtil = new ImageUtil();

		String string = "/home/zdx/Desktop/1.png";
		ImageUtil.removePic("/home/zdx/tool/tomcat/tomcat7/webapps/niurenbang/avatar/2015/5/2/61885416-07a0-481a-8e01-720974e44ea0.png");

	}

	public static void removePic(String oldPath) {
		File file=new File(oldPath);
		if(file.exists()&&file.isFile()){
			file.delete();
		}
//		file.deleteOnExit();
//		System.out.println("用户旧图片已删除");
		
	}
}
