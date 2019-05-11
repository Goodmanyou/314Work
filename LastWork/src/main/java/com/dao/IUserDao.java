package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.User;

public interface IUserDao {

	/**
	 * 查找用户
	 * @param username 用户名
	 * @param pwd 账号
	 * @return
	 */
	public List<User> findByIdAndPwd(Integer userid,String pwd);
	
	
	/**
	 * 添加用户
	 * @param user_id 用户名
	 * @param name 姓名
	 * @param pwd 密码
	 * @return
	 */
	public boolean insertByAll(Integer user_id,String name,String pwd);
	
}
