package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.IUserDao;
import com.model.User;

@Repository("userDao")
public class UserDao implements IUserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){		
		Session session=null;
		try {
			 session = sessionFactory.getCurrentSession();
			 System.out.println("获取到线程");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return session;
	}
	

	@Override
	public List<User> findByIdAndPwd(Integer userid, String pwd) {
		String hql = "FROM User";
		Query query = getSession().createQuery(hql);
		return (List<User>) query.list();
	}


	@Override
	public boolean insertByAll(Integer user_id, String name, String pwd) {
		User user = new User();
		user.setUser_id(user_id);
		user.setUser_name(name);
		user.setUser_pwd(pwd);
		user.setUser_role(1);
		try {
			System.out.println( this.getSession().save(user) );
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

}
