package com.niuren.base.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public class CoreUtil {
	public static String getFilePathByDate() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		String filePath = year + "/" + month + "/" + day;
		return filePath;
	}
	
	public static String getPathByDate() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		String filePath = year +""+ month+"" +  day;
		return filePath;
	}

	public static void copy(MultipartFile file, File fileTo) {

		// 根据文件对象创建一个输出流
		try {
			createFile(fileTo);
			InputStream fis = file.getInputStream();

			FileOutputStream fos = new FileOutputStream(fileTo);

			// 声明个Byte数组用于存放数据

			byte[] bt = new byte[1024];

			int hasNext = 1;
			// 考虑到数组的长度限制问题，我们不能讲文件中的数据一次性读入或者读出，所以这里我们使用循环处理
			while (hasNext != -1) {

				hasNext = fis.read(bt);
				fos.write(bt);

			}
			fos.flush();
			fos.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean createFile(File file) throws IOException {
		if (!file.exists()) {
			makeDir(file.getParentFile());
		}
		return file.createNewFile();
	}

	/**
	 * Enhancement of java.io.File#mkdir() Create the given directory . If the
	 * parent folders don't exists, we will create them all.
	 * 
	 * @see java.io.File#mkdir()
	 * @param dir
	 *            the directory to be created
	 */
	public static void makeDir(File dir) {
		if (!dir.getParentFile().exists()) {
			makeDir(dir.getParentFile());
		}
		dir.mkdir();
	}

	public static void copyFile(File inFile, File outFile) {
		// 根据文件对象创建一个输出流
		try {
			createFile(outFile);
			FileInputStream fis = new FileInputStream(inFile);
			FileOutputStream fos = new FileOutputStream(outFile);

			// 声明个Byte数组用于存放数据

			byte[] bt = new byte[1024];

			int hasNext = 1;
			// 考虑到数组的长度限制问题，我们不能讲文件中的数据一次性读入或者读出，所以这里我们使用循环处理
			while (hasNext != -1) {

				hasNext = fis.read(bt);
				fos.write(bt);

			}
			fos.flush();
			fos.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
