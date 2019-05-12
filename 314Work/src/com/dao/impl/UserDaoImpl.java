package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.IUserDao;
import com.model.User;

@Repository
public class UserDaoImpl implements IUserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		
		Session session=null;
		try {
			 session=sessionFactory.getCurrentSession();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return session;
	}
	
	
	@Override
	public List<User> loginusernamepwd(Integer userid, String pwd) {
		String hql = "FROM User";
		Query query = getSession().createQuery(hql);
		return (List<User>) query.list();
	}

}
