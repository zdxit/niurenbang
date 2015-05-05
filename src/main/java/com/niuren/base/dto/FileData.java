package com.niuren.base.dto;

import java.io.Serializable;

public class FileData implements Serializable{

	private String url;
	private int status;
	private String info;
	private String fileName;
	
	
	
	public FileData() {
		super();
	}



	public FileData(String url, int status, String info,String fileName) {
		super();
		this.url = url;
		this.status = status;
		this.info = info;
		this.fileName=fileName;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public String getInfo() {
		return info;
	}



	public void setInfo(String info) {
		this.info = info;
	}



	public String getFileName() {
		return fileName;
	}



	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	
}
