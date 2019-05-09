package com.service;

public interface ILoginService {
	/**
	 * 
	 * @param userid 用户名
	 * @param pwd 密码
	 * @return true登陆成功 false登陆失败
	 */
	public boolean login(Integer userid,String pwd);
	
	/**
	 * 
	 * @param user_id 用户名
	 * @param name 姓名
	 * @param pwd 密码
	 * @return true注册成功 false注册失败
	 */
	public boolean register(Integer user_id,String name,String pwd);
}
