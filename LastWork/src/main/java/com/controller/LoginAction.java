package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.service.ILoginService;

@Controller
public class LoginAction extends BaseAction{

	private Integer userid;
	private String pwd;
	
	@Autowired
	private ILoginService iLoginService;
	
	public String login() {
		System.out.println("controller");
		boolean flag = iLoginService.login(userid, pwd);
		if(flag==true) {
			session.put("userid",userid);
			return "ok";
		}else {
			return "login";
		}
	}
	
	

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	
}
