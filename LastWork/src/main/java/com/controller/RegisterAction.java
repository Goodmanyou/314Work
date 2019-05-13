package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.service.ILoginService;
@SuppressWarnings("serial")
@Controller
public class RegisterAction extends BaseAction{
	
	private Integer regist_user_id;
	private String regist_user_name;
	private String regist_password;
	private String final_password;
	



	@Autowired
	private ILoginService iLoginService;
	
	public String register() {
		System.out.println(regist_user_id+" "+regist_password+" "+final_password);
		if(regist_password.equals(final_password)) {
			System.out.println("hahahahah");
			boolean flag = iLoginService.register(regist_user_id, regist_user_name, regist_password);
			if(flag==true) {
				session.put("userid",regist_user_id);
				session.put("userpwd",regist_password);
				return "ok";
			}else {
				return "register";
			}
		}
		return "register";
	}
	
	
	
	public Integer getRegist_user_id() {
		return regist_user_id;
	}


	public void setRegist_user_id(Integer regist_user_id) {
		this.regist_user_id = regist_user_id;
	}


	public String getRegist_user_name() {
		return regist_user_name;
	}


	public void setRegist_user_name(String regist_user_name) {
		this.regist_user_name = regist_user_name;
	}


	public String getRegist_password() {
		return regist_password;
	}


	public void setRegist_password(String regist_password) {
		this.regist_password = regist_password;
	}


	public String getFinal_password() {
		return final_password;
	}


	public void setFinal_password(String final_password) {
		this.final_password = final_password;
	}

}
