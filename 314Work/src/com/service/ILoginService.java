package com.service;

public interface ILoginService {
	/**
	 * 
	 * @param userid 用户名
	 * @param pwd 密码
	 * @return
	 */
	public boolean login(Integer userid,String pwd);
}
