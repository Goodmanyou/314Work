package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.IBorrowAndTurnDao;
import com.model.Borrow;
import com.model.Borrowed;
import com.model.Idle;

/**
 * 资产领用和资产归还Dao实现
 * 
 * @author LXY
 *
 */
@Repository("borrowAndTurnDaoImpl")
public class BorrowAndTurnDaoImpl implements IBorrowAndTurnDao {

	@Autowired
	private SessionFactory sessionFactory;

	Query query = null;

	/**
	 * 从线程池中获取线程
	 * 
	 * @return
	 */
	private Session getSession() {
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
			System.out.println("获取到线程");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return session;
	}

	/**
	 * 查询闲置表的资产仓库请况
	 * 
	 * @author by LXY
	 */
	@Override
	public List<Idle> getIdles(String catOrname) {
		try {
			System.out.println(catOrname);
			String hql = "select idle from Idle idle where idle.equ_cat like '%" + catOrname
					+ "%' or idle.equ_name like '%" + catOrname + "%'";
			query = getSession().createQuery(hql);
			List<Idle> idlelist = query.list();
			return idlelist;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Idle> getIdleslist() {
		try {
			String hql = "from Idle";
			query = getSession().createQuery(hql);

			@SuppressWarnings("unchecked")
			List<Idle> idlelist = query.list();
			// System.out.println(idlelist.size());
			return idlelist;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 查询单个资产的数量
	 * 
	 * @author by LXY
	 */
	@Override
	public Idle getIdlenum(Integer idle_id) {
		try {
			System.out.println(idle_id);
			String hql = "select idle from Idle idle where idle.idle_id = ?";
			query = getSession().createQuery(hql);
			query.setParameter(0, idle_id);
			Idle idle = (Idle) query.uniqueResult();
			return idle;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	/**
	 * 资产领用记录
	 * 
	 * @author by LXY
	 */
	@Override
	public boolean IsRecord(Borrow borrow) {
		try {
			this.getSession().save(borrow);
			Borrowed borrowed = new Borrowed();
			borrowed.setEqu_cat(borrow.getEqu_cat());
			borrowed.setEqu_name(borrow.getEqu_name());
			borrowed.setEqu_num(borrow.getEqu_num());
			borrowed.setBusiness_cat(borrow.getBusiness_cat());
			borrowed.setBusiness_pro(borrow.getBusiness_pro());
			borrowed.setUser_name(borrow.getUser_name());
			borrowed.setBorrow_date(borrow.getBorrow_date());
			this.getSession().save(borrowed);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 设备数量更新
	 *
	 * @author by LXY
	 */
	@Override
	public boolean UpdateIdle(Integer idle_id, Integer equ_num) {

		try {
			String hql = "Update Idle idle set idle.equ_num = idle.equ_num - ? where (idle.equ_num - ?) >=0 and idle.idle_id = ?";
			query = getSession().createQuery(hql);
			query.setParameter(0, equ_num);
			query.setParameter(1, equ_num);
			query.setParameter(2, idle_id);
			int flag = query.executeUpdate();
			if (flag == 1) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public List<Borrow> getBorrowlist() {
		try {
			String hql = "from Borrow";
			query = getSession().createQuery(hql);
			@SuppressWarnings("unchecked")
			List<Borrow> borrowlist = query.list();
			// System.out.println(idlelist.size());
			return borrowlist;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 资产归还记录存历史表
	 * 
	 * @author by LXY
	 */
	@Override
	public boolean TurnBack(Integer borrow_id, String turn_date) {

		try {
			String updatehql = "Update Borrowed b set turn_date = ? where b.borrowed_id = ?";
			query = getSession().createQuery(updatehql);
			query.setParameter(0, turn_date);
			query.setParameter(1, borrow_id);
			int flag = query.executeUpdate();
			if (flag == 1) {
				Borrow borrow = new Borrow();
				borrow.setBorrow_id(borrow_id);
				this.getSession().delete(borrow);
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	
	/**
	 * 
	 * @param equ_name
	 * @param equ_num
	 * @return
	 */
	@Override
	public boolean UpdateIdleby(String equ_name, Integer equ_num) {

		try {
			String hql = "Update Idle idle set idle.equ_num = idle.equ_num + ? where idle.equ_name = ?";
			query = getSession().createQuery(hql);
			query.setParameter(0, equ_num);
			query.setParameter(1, equ_name);
			int flag = query.executeUpdate();
			if (flag == 1 ) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

}
