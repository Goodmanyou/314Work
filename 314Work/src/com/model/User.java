package com.model;

public class User {
	
	private Integer userid;
	private String pwd;

	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", pwd=" + pwd + "]";
	}
	
}
