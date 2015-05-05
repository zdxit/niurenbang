package com.niuren.base.dto;

import java.io.Serializable;

public class Message implements Serializable{

	private boolean state;
	private String msg;

	public Message() {
	}

	public Message(boolean state, String message) {
		super();
		this.state = state;
		this.msg = message;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}
