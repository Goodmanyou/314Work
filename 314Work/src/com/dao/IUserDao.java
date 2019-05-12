package com.dao;

import java.util.List;

import com.model.User;

public interface IUserDao {

	/**
	 * 
	 * @param username 用户名
	 * @param pwd 账号
	 * @return
	 */
	public List<User> loginusernamepwd(Integer userid,String pwd);
	
}
