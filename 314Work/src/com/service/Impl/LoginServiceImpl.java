package com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IUserDao;
import com.model.User;
import com.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService{

	
	@Autowired
	private IUserDao userDao;
	
	@Override
	public boolean login(Integer userid, String pwd) {
		List<User> users = userDao.loginusernamepwd(userid, pwd);
		if(users==null) {
			return false;
		}else {
			return true;
		}
	}
}
