package com.yecao.bean;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String id;
	
	private String name;
	
	private String password;
	
	private String webchat;
	
	private String email;
	
	private String cellphone;
	
	private String qq;
	
	private String createTime;
	
	private List<String> address=new ArrayList<String>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebchat() {
		return webchat;
	}

	public void setWebchat(String webchat) {
		this.webchat = webchat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQq() {
		return qq;
	}
	
	

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	
}
