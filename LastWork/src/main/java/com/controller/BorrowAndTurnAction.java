package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.model.Borrow;
import com.model.Idle;
import com.service.IBorrowAndTurnService;

/**
 * 资产调用和资产归还action
 * 
 * @author LXY
 *
 */
@Controller
public class BorrowAndTurnAction {
	private Idle idle;
	private String catOrname;
	private Integer idle_id;
	private Borrow borrow;
	private Borrow borrpowed;
	@Autowired
	private IBorrowAndTurnService borrowAndTurnServiceImpl;
	private List<Idle> listIdles;
	private List<Borrow> listborrow;
	private Integer borrow_id, equ_num;
	private String equ_name;

	public String getIdleslist() {
		listIdles = borrowAndTurnServiceImpl.getIdlesList();
		if (listIdles != null) {

			return "sucess";
		} else {
			return "fail";
		}
	}

	public String findIdleslistbycatorname() {
		listIdles = null;
		listIdles = borrowAndTurnServiceImpl.getIdlesListbycatorname(catOrname);
		if (listIdles != null) {
			return "sucess";
		}
		return null;
	}

	public String findidlenum() {

		idle_id = Integer.parseInt(getParam("idle_id"));
		System.out.println(idle_id);
		idle = borrowAndTurnServiceImpl.getIdlenum(idle_id);
		if (idle != null) {
			return "success";
		}
		return "fail";
	}

	public String UpdateAndBorrow() {
		idle_id = Integer.parseInt(getParam("idle_id"));
		System.out.println(idle_id + borrow.toString());
		boolean flag = borrowAndTurnServiceImpl.UpdateAndInsertBorrow(idle_id, borrow);
		if (flag) {
			return "success";
		}
		return null;
	}

	public String findborrowlist() {
		listborrow = borrowAndTurnServiceImpl.findborrowlist();
		if (listborrow != null) {
			System.out.println(listborrow.size());
			return "success";
		}
		return null;
	}

	public String turnback() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String date = df.format(new Date());
		boolean flag = borrowAndTurnServiceImpl.turnbackandUpdate(borrow_id, equ_name, date, equ_num);
		if(flag) {
			return "success";
		}
		
		return null;
		
	}

	protected String getParam(String key) {
		return ServletActionContext.getRequest().getParameter(key);
	}

	public Idle getIdle() {
		return idle;
	}

	public void setIdle(Idle idle) {
		this.idle = idle;
	}

	public List<Idle> getListIdles() {
		return listIdles;
	}

	public void setListIdles(List<Idle> listIdles) {
		this.listIdles = listIdles;
	}

	public List<Borrow> getListborrow() {
		return listborrow;
	}

	public void setListborrow(List<Borrow> listborrow) {
		this.listborrow = listborrow;
	}

	public String getCatOrname() {
		return catOrname;
	}

	public void setCatOrname(String catOrname) {
		this.catOrname = catOrname;
	}

	public Borrow getBorrpowed() {
		return borrpowed;
	}

	public void setBorrpowed(Borrow borrpowed) {
		this.borrpowed = borrpowed;
	}

	public Borrow getBorrow() {
		return borrow;
	}

	public void setBorrow(Borrow borrow) {
		this.borrow = borrow;
	}

	public Integer getIdle_id() {
		return idle_id;
	}

	public void setIdle_id(Integer idle_id) {
		this.idle_id = idle_id;
	}

	public IBorrowAndTurnService getBorrowAndTurnServiceImpl() {
		return borrowAndTurnServiceImpl;
	}

	public void setBorrowAndTurnServiceImpl(IBorrowAndTurnService borrowAndTurnServiceImpl) {
		this.borrowAndTurnServiceImpl = borrowAndTurnServiceImpl;
	}

	public Integer getBorrow_id() {
		return borrow_id;
	}

	public void setBorrow_id(Integer borrow_id) {
		this.borrow_id = borrow_id;
	}

	public Integer getEqu_num() {
		return equ_num;
	}

	public void setEqu_num(Integer equ_num) {
		this.equ_num = equ_num;
	}

	public String getEqu_name() {
		return equ_name;
	}

	public void setEqu_name(String equ_name) {
		this.equ_name = equ_name;
	}

}
