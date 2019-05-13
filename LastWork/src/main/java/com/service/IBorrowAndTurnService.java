package com.service;

import java.util.List;

import com.model.Borrow;
import com.model.Idle;

/**
 * 资产领用和资产归还Service接口
 * @author LXY
 *
 */
public interface IBorrowAndTurnService {

	/**
	 * 查找资产信息
	 * 
	 * @return 返回一个Idle的list，查询不到的时候返回为null
	 */
	List<Idle> getIdlesList();
	/**
	 * 
	 * @param catOrname
	 * @return
	 */
	List<Idle> getIdlesListbycatorname(String catOrname);
	
	/**
	 * 
	 * @param idle_id
	 * @return
	 */
	Idle getIdlenum(Integer idle_id);
	
	/**
	 * 
	 * @param idle_id
	 * @param borrow
	 * @return
	 */
	boolean UpdateAndInsertBorrow(Integer idle_id, Borrow borrow);
	
	/**
	 * 
	 * @return
	 */
	List<Borrow> findborrowlist();
	
	/**
	 * 
	 * @param borrow
	 * @param turn_date
	 * @param equ_num
	 * @return
	 */
	boolean turnbackandUpdate(Integer borrow_id, String equ_name, String turn_date, Integer equ_num);

}
