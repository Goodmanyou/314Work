package com.dao;

import java.util.List;

import com.model.Borrow;
import com.model.Idle;

/**
 * 资产领用和资产归还接口
 * 
 * @author LXY
 */
public interface IBorrowAndTurnDao {

	
	/**
	 * 查找全部的资产信息仓库
	 * 
	 * @return 查询成功返回一个idle的列表，查询失败时返回为空
	 */
	List<Idle> getIdleslist();
	
	
	/**
	 * 模糊查找资产信息仓库
	 * 
	 * @param catOrname
	 * @return 返回一个Idle的list，查询不到的时候返回为null
	 */
	List<Idle> getIdles(String catOrname);

	/**
	 * 获取资产的数量信息
	 * 
	 * @param idle_id 资产的主键
	 * @return 返回得到一个资产信息，返回为空即找不到
	 */
	Idle getIdlenum(Integer idle_id);

	/**
	 * 记录资产就用信息
	 * 
	 * @param borrow 借用信息
	 * @return true表示记录成功，false表示记录失败
	 */
	boolean IsRecord(Borrow borrow);

	/**
	 * 资产可用数量更新
	 * 
	 * @param idle_id 资产的主键
	 * @param equ_num 资产的借用数量
	 * @return true为更新资产闲置表归还成功
	 */
	boolean UpdateIdle(Integer idle_id, Integer equ_num);
	
	/**
	 * 查询已借出的资产信息
	 * @return 查询成功返回一个borrow的list
	 */
	List<Borrow> getBorrowlist();

	/**
	 * 资产归还
	 * 
	 * @param borrow 借用的信息
	 * @param turn_date   归还日期
	 * @return true为归还成功，false为归还失败
	 */
	boolean TurnBack(Integer borrow_id, String turn_date);

	/**
	 * 
	 * @param equ_name
	 * @param equ_num
	 * @return
	 */
	boolean UpdateIdleby(String equ_name, Integer equ_num);


}
