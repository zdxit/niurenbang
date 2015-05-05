package com.niuren.base.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CreateServiceFromPojo {

	public static void main(String[] args) throws IOException {
		// createDaoInterface();
		// createDaoImpl();
		// createServiceInterface();
		createServiceImpl();
	}

	private static void createServiceImpl() throws FileNotFoundException,
			IOException {

		String endName = "ServiceImpl.java";
		String outPutPath = "/home/zdx/MyEclipse/WorkSpace1/niurenbang/src/main/java/com/niuren/base/service/impl/";
		String code = "package com.niuren.base.service.impl;import org.springframework.stereotype.Repository;import com.niuren.base.base.impl.BaseServiceImpl;import com.niuren.base.dao.impl.ClassNameDaoImpl;import com.niuren.base.entity.ClassName;import com.niuren.base.service.ClassNameService;@Repository("
				+ "\"lowerNameService\""
				+ ")public class ClassNameServiceImpl extends BaseServiceImpl<ClassNameDaoImpl, ClassName> implements ClassNameService {}";

		createAndRepleaceJavaFIle(endName, outPutPath, code);

	}

	private static void createServiceInterface() throws FileNotFoundException,
			IOException {
		// TODO Auto-generated method stub
		String endName = "Service.java";
		String outPutPath = "/home/zdx/MyEclipse/WorkSpace1/niurenbang/src/main/java/com/niuren/base/service/";
		String code = "package com.niuren.base.service;import com.niuren.base.dao.impl.ClassNameDaoImpl;import com.niuren.base.entity.ClassName;import com.niuren.base.base.BaseService;public interface ClassNameService   extends BaseService<ClassNameDaoImpl, ClassName> {}";
		createAndRepleaceJavaFIle(endName, outPutPath, code);
	}

	private static void createDaoImpl() throws FileNotFoundException,
			IOException {
		String endName = "DaoImpl.java";
		String outPutPath = "/home/zdx/MyEclipse/WorkSpace1/niurenbang/src/main/java/com/niuren/base/dao/impl/";
		String code = "package com.niuren.base.dao.impl;import org.springframework.stereotype.Repository;import com.niuren.base.base.impl.BaseDaoImpl;import com.niuren.base.dao.ClassNameDao;import com.niuren.base.entity.ClassName;@Repository("
				+ "\"lowerNameDao\""
				+ ")public class ClassNameDaoImpl   extends BaseDaoImpl<ClassName> implements ClassNameDao {}";

		createAndRepleaceJavaFIle(endName, outPutPath, code);

	}

	private static void createDaoInterface() throws FileNotFoundException,
			IOException {
		String pathname = "/home/zdx/MyEclipse/WorkSpace1/niurenbang/src/main/java/com/niuren/base/entity";
		String endName = "Dao.java";
		String outPutPath = "/home/zdx/MyEclipse/WorkSpace1/niurenbang/src/main/java/com/niuren/base/dao/";
		String code = "package com.niuren.base.dao;"

		+ "import com.niuren.base.entity.ClassName;"
				+ "import com.niuren.base.base.BaseDao;"

				+ "public interface ClassNameDao extends BaseDao<ClassName> {"

				+ "}";

		createAndRepleaceJavaFIle(endName, outPutPath, code);
	}

	private static void createAndRepleaceJavaFIle(String endName,
			String outPutPath, String sourceCode) throws FileNotFoundException,
			IOException {

		String pathname = "/home/zdx/MyEclipse/WorkSpace1/niurenbang/src/main/java/com/niuren/base/entity";

		File rootFolder = new File(pathname);
		File[] subFiles = rootFolder.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				String fileName = file.getName();
				boolean isJavaFile = fileName.endsWith(".java");
				return isJavaFile;
			}
		});

		for (int i = 0; i < subFiles.length; i++) {
			File file = subFiles[i];
			String fileName = file.getName();
			String className = fileName.substring(0, fileName.indexOf(".java"));
			String code = sourceCode;
			code = code.replaceAll("ClassName", className);
			if (code.contains("lowerName")) {
				String lowerName = className;
				char charAt = lowerName.charAt(0);
				lowerName = lowerName.substring(1, lowerName.length());
				charAt += 32;
				lowerName = charAt + lowerName;
				code = code.replace("lowerName", lowerName);
			}

			String serviceFileName = className + endName;
			System.out.println(code);
			File fileCreate = new File(outPutPath + serviceFileName);
			OutputStream outputStream = new FileOutputStream(fileCreate);
			Writer writer = new BufferedWriter(new OutputStreamWriter(
					outputStream));
			writer.write(code);
			System.out.println("***************");
			writer.flush();
			writer.close();

		}
	}
}
