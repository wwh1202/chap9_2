package com.ssm.po;

import java.util.List;

public class Student {
	private Integer id;
	private String loginname;
	private String password;
	private String username;
	private Integer clazz_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getClazz_id() {
		return clazz_id;
	}

	public void setClazz_id(Integer clazz_id) {
		this.clazz_id = clazz_id;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", loginname='" + loginname + '\'' +
				", password='" + password + '\'' +
				", username='" + username + '\'' +
				", clazz_id=" + clazz_id +
				'}';
	}
}
